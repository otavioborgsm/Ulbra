<?php
class clientsController{
    public function register(){
        require_once('views/templates/header.php');
        require_once('views/clients/register.php');
        require_once('views/templates/footer.php');
    }
    public function registerView(){
        $client = array(
            "name" => $_POST["name"],
            "email" => $_POST["email"],
            "interest" => $_POST["interest"],
            'password' =>  $_POST['password'],
            'sex' =>     $_POST['sex'],
            $notification = $_POST['notifications'],
            'place'=> $_POST['place'],
            'service'=> $_POST['service']
        );
        require_once('views/templates/header.php');
        require_once('views/clients/registerView.php');
        require_once('views/templates/footer.php');
    }
    public function list(){
        require_once("models/clientsModel.php");
        $client = new clientsModel();
        $client -> list();
        $result = $client -> getConsult();
        $arrayClients = array(); 
        while ($line = $result -> fetch_assoc()){
            array_push($arrayClients, $line);
        }
        require_once('views/templates/header.php');
        require_once('views/clients/list.php');
        require_once('views/templates/footer.php');
    }


    
}
?>