<h2>Registro de Clientes</h2>

<form action="?controller=clients&action=registerView" method="post">
    <div class="form-group">
        <label for="name">Nome:</label>
        <input type="text" name="name" class="form-control">
    </div>
    <div class="form-group">
        <label for="email">E-mail:</label>
        <input type="email" name="email" class="form-control">
    </div>
    <div class="form-group">
        <label for="interesse">Interesse:</label>
        <input type="interesse" name="interest" class="form-control">
    </div>
    <br>
    <input type="submit" value="Registrar" class="btn btn-info">
</form>