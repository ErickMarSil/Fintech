<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login - App CashFlow</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="css/loginstyle.css"> <!-- Link para o CSS externo -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
</head>
<body>
<div class="background-decor">
    <div class="shape shape1"></div>
    <div class="shape shape2"></div>
    <div class="shape shape3"></div>
</div>

<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <div class="card">
                <div class="card-body">
                    <h3 class="card-title text-center">Login</h3>
                    <p class="text-center">Oi! Bem-vindo de volta, você fez falta.</p>
                    <form action="login" method="post" id="loginForm">
                        <div class="form-group">
                            <label for="email">Email</label>
                            <input type="text" class="form-control" id="email" name="identifier" placeholder="Email" required>
                        </div>
                        <div class="form-group">
                            <label for="password">Senha</label>
                            <input type="password" class="form-control" id="password" name="password" placeholder="**********" required>
                        </div>
                        <div class="form-group text-right">
                            <a href="#" class="forgot-password">Esqueceu sua senha?</a>
                        </div>
                        <button type="submit" class="btn btn-custom btn-block">Login</button>
                        <div class="text-center mt-3">
                            <p>Ou faça login com:</p>
                            <div class="social-container">
                                <button type="button" class="btn social-btn">
                                    <i class="fab fa-google"></i>
                                </button>
                                <button type="button" class="btn social-btn">
                                    <i class="fab fa-linkedin"></i>
                                </button>
                                <button type="button" class="btn social-btn">
                                    <i class="fab fa-apple"></i>
                                </button>
                            </div>
                        </div>
                        <div class="text-center mt-3">
                            <p>Ainda não tem uma conta? <span><a class="ml-2" href="signup.jsp">Cadastre-se</a></span></p>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
<script src="assets/js/scripts.js"></script>
</body>
</html>