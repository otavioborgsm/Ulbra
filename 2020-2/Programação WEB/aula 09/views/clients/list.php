<h1>Lista de Clients</h1>
<table class="table table striped">
    <tr>
        <th>ID Cliente</th>
        <th>Nome</th>
        <th>Telefone</th>
        <th>E-mail</th>
        <th>Endereço</th>
    </tr>
    <?php
    foreach($arrayClients as $clients){
    ?>
        <tr>
            <td>
                <?=$clients['idClient']?>
            </td>
            <td>
                <?=$clients['name']?>
            </td>
            <td>
                <?=$clients['phone']?> 
            </td>
            <td>
                <?=$clients['email']?> 
            </td>
            <td>
                <?=$clients['address']?>
            </td>
        </tr>
    <?php
    }
    ?>
</table>