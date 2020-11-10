<h2>Dados do Registro</h2>
<table class="table">
    <tr>
        <th>Nome:</th>
        <td><?=$client['name']?> </td>
    </tr>
    <tr>
        <th>Sexo:</th>
        <td><?=$client['sex']?> </td>
    </tr>
    <tr>
        <th>E-mail:</th>
        <td><?=$client['email']?> </td>
    </tr>
    <tr>
        <th>Senha:</th>
        <td><?=$client['password']?> </td>
    </tr>
    <tr>
        <th> Notificações: </th>
        <td> 
        <?php
            foreach($notification as $notifications){
                echo $notifications.", ";}
        ?>
        </td>
    </tr>
    <tr>
        <th>Local:</th>
        <td><?=$client['place']?> </td>
    </tr>
    <tr>
        <th>Serviço:</th>
        <td><?=$client['service']?> </td>
    </tr>
    <tr>
        <th>Interesse:</th>
        <td><?=$client['interest']?> </td>
    </tr>
</table>

