<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>App Banco</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="css/lobbystyle.css">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css" rel="stylesheet">
</head>

<body>

<!-- Barra superior com foto e nome -->
<div class="container py-3">
    <div class="d-flex align-items-center justify-content-around">
        <div class="d-block">
            <h4>Olá, <span id="nome-usuario">João</span></h4>
            <p>Invista de maneira inteligente</p>
        </div>
        <img src="https://randomuser.me/api/portraits/men/1.jpg" alt="Foto Perfil" class="profile-image me-3">
    </div>
</div>

<div class="container py-3 card-container">
    <div class="card card-gradient p-4">
        <div class="d-flex justify-content-end">
            <i class="fas fa-wallet" style="color: #ffff;"></i>
        </div>
        <div class="card-number ms-3">1234 5678 1234 5678</div>
        <div class="d-flex ms-3">
            <span class="card-validade me-3">12/27</span>
            <span class="card-cvc">***</span>
        </div>
        <div class="card-name ms-3">João da Silva</div>
    </div>
</div>

<div class="container py-3 icon-section">
    <div class="row text-center d-flex justify-content-evenly">
        <div class="d-flex col-2">
            <div class="d-block">
                <div class="d-flex align-items-center justify-content-center icon-circle-2">
                    <i class="fas fa-piggy-bank fa-2x" style="color: #ffff"></i>
                </div>
                <p>Investimentos</p>
            </div>
        </div>
        <div class="d-flex col-2">
            <div class="d-block">
                <div class="d-flex align-items-center justify-content-center icon-circle">
                    <i class="fas fa-file-invoice-dollar fa-2x" style="color: #ffff"></i>
                </div>
                <p>Extrato</p>
            </div>
        </div>
        <div class="d-flex col-2">
            <div class="d-block">
                <div class="d-flex align-items-center justify-content-center icon-circle-2">
                    <i class="fas fa-ticket-alt fa-2x" style="color: #ffff"></i>
                </div>
                <p>Bilhete</p>
            </div>
        </div>
        <div class="d-flex col-2">
            <div class="d-block">
                <div class="d-flex align-items-center justify-content-center icon-circle">
                    <i class="fas fa-comment-dots fa-2x" style="color: #ffff"></i>
                </div>
                <p>Mensagens</p>
            </div>
        </div>
        <div class="d-flex col-2">
            <div class="d-block">
                <div class="d-flex align-items-center justify-content-center icon-circle-2">
                    <i class="fas fa-ellipsis-h fa-2x" style="color: #ffff"></i>
                </div>
                <p>Mais</p>
            </div>
        </div>
    </div>
</div>

<div class="container py-3">
    <div class="d-flex justify-content-between align-items-center mb-3">
        <h5>Send Money</h5>
        <p>See all</p>
    </div>
    <div class="row text-center d-flex justify-content-around">
        <div class="d-flex col-2">
            <div class="d-block">
                <img src="https://randomuser.me/api/portraits/men/1.jpg" class="profile-image" alt="Pessoa 1">
                <p>Lucas</p>
                <p class="money">R$20,00</p>
            </div>
        </div>
        <div class="d-flex col-2">
            <div class="d-block">
                <img src="https://randomuser.me/api/portraits/women/1.jpg" class="profile-image" alt="Pessoa 2">
                <p>Ana</p>
                <p class="money">R$100,00</p>
            </div>
        </div>
        <div class="d-flex col-2">
            <div class="d-block">
                <img src="https://randomuser.me/api/portraits/men/2.jpg" class="profile-image" alt="Pessoa 3">
                <p>Ricardo</p>
                <p class="money">R$500,00</p>
            </div>
        </div>

        <div class="d-flex col-2">
            <div class="d-block">
                <img src="https://randomuser.me/api/portraits/women/2.jpg" class="profile-image" alt="Pessoa 4">
                <p>Maria</p>
                <p class="money">R$250,00</p>
            </div>
        </div>
        <div class="d-flex col-2">
            <div class="d-block">
                <img src="https://randomuser.me/api/portraits/men/3.jpg" class="profile-image" alt="Pessoa 5">
                <p>Paulo</p>
                <p class="money">R$800,00</p>
            </div>
        </div>
    </div>
</div>

<div class="container py-3">
    <div class="d-flex  align-items-center justify-content-between">
        <h3>Transactions</h3>
        <p class="money">Ver Mais</p>
    </div>

    <section>
        <ul class="list-group vh-auto">
            <div>
                <li class="list-group-item transaction-card">
                    <div class="d-flex justify-content-between">
                        <div class="d-flex justify-content-center align-items-center">
                            <div class="me-3">
                                <img src="assets/img/Amazon.png" alt="">
                            </div>
                            <div class="d-block">
                                <h5>Amazon Prime</h5>
                                <p>04/03/2024<span class="ms-3">14:56</span></p>
                            </div>
                        </div>
                        <div class="d-flex justify-content-center align-items-center">
                            <h5 class="loss">R$ -30,00</h5>
                        </div>
                    </div>
                </li>
                <!-- <li class="list-group-item">Netflix - R$30,00 - Serviços Internos</li>
                <li class="list-group-item">Uber - R$25,00 - Transporte</li>
                <li class="list-group-item">Spotify - R$20,00 - Entretenimento</li> -->
            </div>
        </ul>
</div>
</section>

<footer class="fixed-bottom bg-light py-3">
    <div class="container text-center">
        <div class="row">
            <div class="col">
                <i class="fas fa-home"></i>
            </div>
            <div class="col">
                <i class="fas fa-wallet"></i>
            </div>
            <div class="col">
                <i class="fas fa-chart-line"></i>
            </div>
            <div class="col">
                <i class="fas fa-cogs"></i>
            </div>
        </div>
    </div>
</footer>

<!-- Scripts do Bootstrap -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>

</html>