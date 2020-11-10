<?php
class clientsController{
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