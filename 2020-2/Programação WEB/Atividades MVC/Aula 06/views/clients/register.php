<h2>Registro de Clientes</h2>

<form action="?controller=clients&action=registerView" method="post">
    <div class="form-group">
        <label for="name">Nome:</label>
        <input type="text" name="name" class="form-control">
    </div>
    <div class="form-group">
        <h4>Sexo:</h4>
        <label for="masc">Masculino</label>
        <input type="radio" name="sex" value="masc" class="sex">
        <label for="fem">Feminino</label>
        <input type="radio" name="sex" value="fem" class="sex">
        <label for="other">Outro</label>
        <input type="radio" name="sex" value="other" class="sex">
    </div>
    <div class="form-group">
        <label for="email">E-mail:</label>
        <input type="email" name="email" class="form-control">
    </div>
    <div class="form-group">
        <label for="password">Senha:</label>
        <input type="password" name="password" class="form-control">
    </div>
    <div class="form-group">
        <label for="products">Deseja receber notificações sobre novos produtos?</label>
        <input type="checkbox" name="notifications[]" value="products">
        <br>
        <label for="sale">Deseja receber notificações sobre nossas ofertas?</label>
        <input type="checkbox" name="notifications[]" value="sale">
    </div>
    <div class="form-group">
        <label for="name">Qual lugar você mora?</label>
        <select id="place" name="place" class="form-control">
            <option value="AC">Acre</option>
            <option value="AL">Alagoas</option>
            <option value="AP">Amapá</option>
            <option value="AM">Amazonas</option>
            <option value="BA">Bahia</option>
            <option value="CE">Ceará</option>
            <option value="DF">Distrito Federal</option>
            <option value="ES">Espírito Santo</option>
            <option value="GO">Goiás</option>
            <option value="MA">Maranhão</option>
            <option value="MT">Mato Grosso</option>
            <option value="MS">Mato Grosso do Sul</option>
            <option value="MG">Minas Gerais</option>
            <option value="PA">Pará</option>
            <option value="PB">Paraíba</option>
            <option value="PR">Paraná</option>
            <option value="PE">Pernambuco</option>
            <option value="PI">Piauí</option>
            <option value="RJ">Rio de Janeiro</option>
            <option value="RN">Rio Grande do Norte</option>
            <option value="RS">Rio Grande do Sul</option>
            <option value="RO">Rondônia</option>
            <option value="RR">Roraima</option>
            <option value="SC">Santa Catarina</option>
            <option value="SP">São Paulo</option>
            <option value="SE">Sergipe</option>
            <option value="TO">Tocantins</option>
            <option value="EX">Estrangeiro</option>
        </select>
    </div>
    <div class="form-group">
        <label for="service">Tipo de serviço que utiliza:</label>
        <select id="service" name="service" multiple class="form-control">
            <option value="local">Presencial</option>
            <option value="remoto">Remoto</option>
            <option value="other">Via terceiro</option>
            <option value="none">Nenhum</option>
        </select>
    </div>
    <div class="form-group">
        <label for="interest">Interesse:</label>
        <textarea class="form-control" rows="5" id="comment" name="interest"></textarea>
    </div>
    <br>
    <input type="submit" value="Registrar" class="btn btn-info">
</form>