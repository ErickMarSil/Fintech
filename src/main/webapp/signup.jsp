<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastro - Fintech</title>
    <link rel="stylesheet" href="css/siginstyle.css"> <!-- Link to external CSS file -->
</head>
<body>
<div class="container">
    <h1>Cadastro</h1>
    <form action="signin" method="post">
        <div class="form-group">
            <label for="firstName">Primeiro Nome</label>
            <input type="text" id="firstName" name="firstName" required>
        </div>
        <div class="form-group">
            <label for="lastName">Último Nome</label>
            <input type="text" id="lastName" name="lastName" required>
        </div>
        <div class="form-group">
            <label for="dob">Data de Nascimento</label>
            <input type="date" id="dob" name="dob" required>
        </div>
        <div class="form-group">
            <label for="email">Email</label>
            <input type="email" id="email" name="email" required>
        </div>
        <div class="form-group">
            <label for="cpf">CPF</label>
            <input type="text" id="cpf" name="cpf" required pattern="\d{3}\.\d{3}\.\d{3}-\d{2}" placeholder="000.000.000-00">
        </div>
        <div class="form-group">
            <label for="password">Senha</label>
            <input type="password" id="password" name="password" required>
        </div>
        <div class="form-group">
            <label for="confirmPassword">Repetir Senha</label>
            <input type="password" id="confirmPassword" name="confirmPassword" required>
        </div>
        <button type="submit">Cadastrar</button>
    </form>
    <p>Já tem uma conta? <a href="login.jsp">Login</a></p>
</div>
</body>
</html>