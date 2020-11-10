<h1>Lista de Clients</h1>
<table class="table table striped">
    <tr>
        <th>ID Cliente</th>
        <th>Nome</th>
        <th>Telefone</th>
        <th>E-mail</th>
        <th>Endereço</th>
        <th>Imagem</th>
        <th colspan="2">Ações</th>
    </tr>
    <?php
    foreach($arrayClients as $client){
    ?>
        <tr>
            <td>
                <?=$client['idClient']?>
            </td>
            <td>
                <?=$client['name']?>
            </td>
            <td>
                <?=$client['phone']?> 
            </td>
            <td>
                <?=$client['email']?> 
            </td>
            <td>
                <?=$client['address']?>
            </td>
            <td>
                <?php
                    if (is_file("assets/img/clients/{$client['idClient']}.jpg")){
                        echo("
                            <img style='max-width: 100px; max-heigth:100px; border-radius: 50%' src='assets/img/clients/{$client['idClient']}.jpg'>
                        ");
                    }else {
                        print("sem imagem");
                    }
                ?>
            </td>
            <td>
                <a href="?controller=clients&action=updateClient&id=<?=$client['idClient']?>" class="btn btn-warning">Editar</a>
            </td>
            <td>
                <a href="?controller=clients&action=deleteClient&id=<?=$client['idClient']?>" class="btn btn-danger">Excluir</a>
            </td>
        </tr>
    <?php
    }
    ?>
</table>