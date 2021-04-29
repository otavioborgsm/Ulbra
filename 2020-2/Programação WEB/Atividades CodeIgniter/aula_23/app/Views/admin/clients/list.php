<h1>Lista de Clients</h1>
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