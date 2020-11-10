<?php
class clientsController{
    var $ClientModel;
    public function __construct(){
        if(!isset($_SESSION['login'])){
            header('Location:index.php?controller=main&action=login');
        }else{
            require_once("models/clientsModel.php");
            $this -> ClientModel = new clientsModel();
        }
    }

    public function list(){
        $this -> ClientModel -> getClients();
        $result = $this -> ClientModel -> getConsult();
        $arrayClients = array(); 
        while ($line = $result -> fetch_assoc()){
            array_push($arrayClients, $line);
        }
        require_once('views/templates/header.php');
        require_once('views/clients/list.php');
        require_once('views/templates/footer.php');
    }

    public function insertClient(){
        require_once('views/templates/header.php');
        require_once('views/clients/insertClient.php');
        require_once('views/templates/footer.php');
    }

    public function insertClientAction(){
        $arrayClient['name'] = $_POST['name'];
        $arrayClient['email'] = $_POST['email'];
        $arrayClient['phone'] = $_POST['phone'];
        $arrayClient['address'] = $_POST['address'];

        $this -> ClientModel -> insertClient($arrayClient);
        $idClient = $this -> ClientModel -> getConsult();
       
        if(isset($_FILES["photo"])){
            
        
            $foto_temp = $_FILES["photo"]["tmp_name"];	
            $foto_name = $_FILES["photo"]["name"];		
        
            $extensao = str_replace('.','',strrchr($foto_name, '.')); 
            $max_width = 600; 
            $max_height = 600; 
        
            
            $img = null;
        
            
            if ($extensao == 'jpg' || $extensao == 'jpeg') { 
                $img = imagecreatefromjpeg($foto_temp);
            } else if ($extensao == 'png') { 
                $img = imagecreatefrompng($foto_temp);
            } else if ($extensao == 'gif') { 
                $img = imagecreatefromgif($foto_temp); 
            }  else     
                $img = imagecreatefromjpeg($foto_temp); 
        
            
            if ($img) { 
                $width  = imagesx($img); 
                $height = imagesy($img); 
                $scale  = min($max_width/$width, $max_height/$height); 
                if ($scale < 1) { 
                    $new_width = floor($scale*$width); 
                    $new_height = floor($scale*$height);
                    $tmp_img = imagecreatetruecolor($new_width, $new_height);
                    imagecopyresampled($tmp_img, $img, 0, 0, 0, 0, 
                                    $new_width, $new_height, $width, $height);  
                    imagedestroy($img); 
                    $img = $tmp_img; 
                }           
            }
        
            $localFile = "assets/img/clients/{$idClient}.jpg";
            imagejpeg($img, $localFile); 
        }
        header('Location:index.php?controller=clients&action=list');

        
    }

    public function updateClient($idClient){
        $this -> ClientModel -> getClient($idClient);
        $result = $this -> ClientModel -> getConsult();
        if($arrayClient = $result -> fetch_assoc()){
            require_once('views/templates/header.php');
            require_once('views/clients/updateClient.php');
            require_once('views/templates/footer.php');
        }
    }

    public function updateClientAction($idClient){
        $arrayClient['idClient'] = $idClient;
        $arrayClient['name'] = $_POST['name'];
        $arrayClient['email'] = $_POST['email'];
        $arrayClient['phone'] = $_POST['phone'];
        $arrayClient['address'] = $_POST['address'];
        $this -> ClientModel -> updateClient($arrayClient);

        if(isset($_FILES["photo"])){
            
        
            $foto_temp = $_FILES["photo"]["tmp_name"];	
            $foto_name = $_FILES["photo"]["name"];		
        
            $extensao = str_replace('.','',strrchr($foto_name, '.')); 
            $max_width = 600; 
            $max_height = 600; 
        
            
            $img = null;
        
            
            if ($extensao == 'jpg' || $extensao == 'jpeg') { 
                $img = imagecreatefromjpeg($foto_temp);
            } else if ($extensao == 'png') { 
                $img = imagecreatefrompng($foto_temp);
            } else if ($extensao == 'gif') { 
                $img = imagecreatefromgif($foto_temp); 
            }  else     
                $img = imagecreatefromjpeg($foto_temp); 
        
            
            if ($img) { 
                $width  = imagesx($img); 
                $height = imagesy($img); 
                $scale  = min($max_width/$width, $max_height/$height); 
                if ($scale < 1) { 
                    $new_width = floor($scale*$width); 
                    $new_height = floor($scale*$height);
                    $tmp_img = imagecreatetruecolor($new_width, $new_height);
                    imagecopyresampled($tmp_img, $img, 0, 0, 0, 0, 
                                    $new_width, $new_height, $width, $height);  
                    imagedestroy($img); 
                    $img = $tmp_img; 
                }           
            }
        
            $localFile = "assets/img/clients/{$idClient}.jpg";
            imagejpeg($img, $localFile); 
        }

        header('Location:index.php?controller=clients&action=list');
    }

    public function deleteClient($idClient){
        $this -> ClientModel -> deleteClient($idClient);
        $linkPhoto = "assests/img/clients/{$idClient}.jpg";
        if (is_file($linkPhoto)){
            unlink($linkPhoto);
        }
        header('Location:index.php?controller=clients&action=list');
    }
}
?>