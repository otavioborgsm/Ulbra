<?php
namespace App\Controllers\Admin;
use CodeIgniter\Controller;
use App\Models\ClientsModel;

class Admin extends Controller{
    public function index(){
        $session = \Config\Services::session();
        if ($session -> has("user")):
            
            echo view('admin/templates/header');
            echo view('admin/home');
            echo view('admin/templates/footer');
        else:
            $this -> login();
        endif;
    }

    public function login(){
        echo view('admin/users/login');
    }

    public function logout()
    {
        $session = \Config\Services::session();
        $session -> destroy();
        return redirect() -> to(base_url('admin'));
    }

    public function listClients(){
        $clients = new ClientsModel();

        $data = [
            'clients' => $clients -> getClients()
        ];

        echo view('admin/templates/header');
        echo view('admin/clients/list', $data);
        echo view('admin/templates/footer');
    }

    public function detailsClient($idClient){

        $clients = new ClientsModel();

        $data = [
            'client' => $clients -> getClients($idClient)                
        ];

        echo view('admin/templates/header');
        echo view('admin/clients/details', $data);
        echo view('admin/templates/footer');

    }
}