<?php
    session_start();
    
    $requestMethod = $_SERVER['REQUEST_METHOD'];
    $local = $_SERVER['SCRIPT_NAME'];
    $uri = $_SERVER['PHP_SELF'];
    $rout = str_replace($local, '', $uri);
    $uriSegments = explode('/',$rout);

    if (isset($uriSegments[1])) {
        $controller = $uriSegments[1];
        switch ($uriSegments[1]){
            case 'contacts':
                require_once('controllers/ContactsController.php');
                $Contacts = new ContactsController();
                switch ($requestMethod) {
                    case 'GET':
                        if (isset($uriSegments[2]) && $uriSegments[2] !='') {
                            $Contacts ->listContact($uriSegments[2]);
                        }else{
                            $Contacts -> listContacts();
                        }
                    break;
                    case 'POST':
                        $Contacts -> insertContact();
                    break;
                }
            break;
            case 'users':
                require_once('controllers/UsersController.php');
                $Users = new UsersController();
                switch ($requestMethod){
                    case 'GET':
                            if (isset($uriSegments[2]) && $uriSegments[2]=='login'){
                                if (!isset($uriSegments[3]) || $uriSegments[3]==''){
                                    $Users -> login();
                                }
                            }
                    break;
                }
                
            break;
        }
    }


?>