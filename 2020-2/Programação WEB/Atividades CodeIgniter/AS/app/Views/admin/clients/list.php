<h1>Lista de Clientes</h1>

<div class="container-fluid">

    <form action="<?=base_url('admin/clients')?>" method=GET enctype='multipart/form-data' class='row'>

        <div class='col-3'>
            <label for="search">Pesquisar Cliente:</label>
        </div>
        <div class='col-6'>
            <input type="text" class="form-control" name="search" >
        </div>
        <div class='col-3'>
            <button type="submit" class="btn btn-success">Pesquisar</button>
        </div>

    </form>
    <br><br>
</div>

<table class="table table striped">
    <tr>
        <th>ID Cliente</th>
        <th>Nome</th>
        
        <th>E-mail</th>
        <th colspan='3'>Ações</th>
    </tr>
    <?php
    foreach($clients as $client){
    ?>
        <tr>
            <td>
                <?=$client['idClient']?>
            </td>
            <td>
                <?=$client['name']?>
            </td>
            
            <td>
                <?=$client['email']?> 
            </td>
            <td>
                <a class='btn btn-warning' href="<?=base_url("admin/clients/update/{$client['idClient']}")?>">Update</a> 
            </td>
            <td>
                <a class='btn btn-danger' href="<?=base_url("admin/clients/delete/{$client['idClient']}")?>">Delete</a> 
            </td>
            <td>
                <a href="<?=base_url("admin/clients/{$client['idClient']}")?>">Ver Detalhes</a>
            </td>
        </tr>
    <?php
    }
    ?>
</table>