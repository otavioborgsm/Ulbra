<!DOCTYPE html>
<html lang="pt-br">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PHP test</title>
    <script type="text/javascript" src="assets/js/script.js"></script>
    <link rel="stylesheet" href="<?=base_url('assets/css/style-adm.css')?>">
    <!-- Bootstrap -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/" crossorigin="anonymous">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
    <!-- /bootstrap-->
  </head>
  <body>
    <div class="jumbotron text-center" style="margin-bottom:0">
      <h1>ADM AREA</h1> 
    </div>

    <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
      <a class="navbar-brand" href="<?=base_url('admin')?>">ADM - HOME</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="collapsibleNavbar">
        <ul class="navbar-nav">
          <li class="nav-item">
            <a class="nav-link" href="<?=base_url('admin/logout')?>">Logout</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="<?=base_url('admin/clients')?>">Lista de clientes</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="<?=base_url('admin/clients/insert')?>">Adicionar Cliente</a>
          </li>
        </ul>
      </div>  
    </nav>
    <section>
        <article class="container">
            <br>
            