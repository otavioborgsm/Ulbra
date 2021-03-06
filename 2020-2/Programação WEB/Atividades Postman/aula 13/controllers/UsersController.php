<?php
    class UsersController{
        public function __construct(){
            require_once('models/UsersModel.php');
            $this -> UserModel = new UsersModel();
        }
        
        public function login(){

            $userData = json_decode(file_get_contents('php://input'));

            if (isset($userData->user) && isset($userData ->password)) {
                $this -> UserModel -> getUser($userData->user);
                $result = $this -> UserModel -> getConsult();
                if ($line = $result -> fetch_assoc()) {
                    if ($line['password'] == $userData->password) {
                        $token = $this -> createJWT($line);
                        header('Content-Type: application/json');
                        echo json_encode('{"access": "true", "token" : "'.$token.'" }');
                    }else{
                        print("senha incorreta");    
                    }
                }else{
                    print ("usuário não existe");
                }
            }
        }

        public function createJWT($user){
            $header = [
                'alg' => 'HS256',
                'typ' => 'JWT'
            ];
            $header = json_encode($header);
            $header = base64_encode($header);
            $header = str_replace(['+', '/', '='], ['-', '_', ''], $header); 
                
            $payload = [
                'iss' => 'localhost',
                'name' => "{$user['name']}",
                'user' => "{$user['user']}",
                'adm' => "{$user['a']}"
            ];
            $payload = json_encode($payload);
            $payload = base64_encode($payload);
            $payload = str_replace(['+', '/', '='], ['-', '_', ''], $payload); 
                
            $signature = hash_hmac('sha256',"$header.$payload",'minha-senha',true);
            $signature = base64_encode($signature);
            $signature = str_replace(['+', '/', '='], ['-', '_', ''], $signature); 
                
                
            $token = $header . "." . $payload . "." . $signature;
            return $token;
        }

        public function checkJWT($headres){
            if($header['Athorization']){

                $header = apache_request_headers();
                $token = $header['Authorization'];

                $token = str_replace("Bearer ", "", $token); 

                var_dump($token);

                $part = explode(".",$token);
                $header = $part[0];
                $payload = $part[1];
                $signature = $part[2];
                $paylod = base64_decode($payload);

                $valid = hash_hmac('sha256',"$header.$payload",'minha-senha',true);
                $valid = base64_encode($valid);
                $valid = str_replace(['+', '/', '='], ['-', '_', ''], $valid); 

                if($signature == $valid){
                    return true;
                }else{
                    return false;
                }
            }
        }

        public function isAdmin(){

            $headers = apache_request_headers();

            if ($this -> checkJWT($headers)){
                $token = $headers['Authorization'];
                $token = str_replace("Beaer ", "", $token);

                $part = explode('.', $token);
                $payload = $part[1];
                $payload = base64_decode($payload);
                $payload = json_decode($payload);

                if ($payload -> amin == 1) {
                    return true;
                }else{
                    return false;
                }

            }else {
                header('Content-Type: application/json');
                echo json_encode('{ "access" : "denied" }');
            }
        }

        

    }
?>