<%@page import="modelo.gestionusuarios"%>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

<!DOCTYPE html>
<html lang="pt-br">
    <head> 

        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" href="assets/css/bootstrap.css">
        <link href="estiloscss/registrousuarios.css" rel="stylesheet" type="text/css"/>

        <link rel="stylesheet" type="text/css" href="assets/css/main.css">


        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css">

        <link href='https://fonts.googleapis.com/css?family=Passion+One' rel='stylesheet' type='text/css'>
        <link href='https://fonts.googleapis.com/css?family=Oxygen' rel='stylesheet' type='text/css'>

        <script src="boostrap/js/sweetalert.min.js" type="text/javascript"></script>
        <title>Usuarios</title>

    </head>
    <body>

         Hora local: <%= new java.util.Date() %>



        <div class="container">
            <div class="row main">
                <div class="panel-heading">
                    <div class="panel-title text-center">
                        <h1 class="title">Gestión de Usuarios</h1>
                        <hr />
                    </div>
                </div> 
                <div class="main-login main-center">

                    <form class="form-horizontal" name="registro"  method="POST" action="svragregarusuario">

                        <div class="form-group">
                            <label for="username" class="cols-sm-2 control-label">Nuevo usuario</label>
                            <div class="cols-sm-10">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="fa fa-users fa" aria-hidden="true"></i></span>
                                    <input type="text" class="form-control" name="nuevousuario" id="username"  placeholder="Ingrese su usuario"/>
                                </div>
                            </div>
                        </div>

                         <div class="form-group">
                            <label for="name" class="cols-sm-2 control-label">Perfil</label>
                            <div class="cols-sm-10">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                                    <div class="form-check">
                                        <input class="form-check-input" type="radio" name="flexRadioDefault" value="Administrador">
                                        <label class="form-check-label" for="flexRadioDefault1">
                                            Administrador
                                        </label>
                                    </div>
                                    <div class="form-check">
                                        <input class="form-check-input" type="radio" name="flexRadioDefault" value="Compras y Ventas">
                                        <label class="form-check-label" for="flexRadioDefault2">
                                            Compras y Ventas
                                        </label>
                                    </div>
                                    <div class="form-check">
                                        <input class="form-check-input" type="radio" name="flexRadioDefault"  value="Gestor De Archivos">
                                        <label class="form-check-label" for="flexRadioDefault3">
                                            Gestor De Archivos
                                        </label>
                                    </div>


                                </div>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="password" class="cols-sm-2 control-label">Contraseña</label>
                            <div class="cols-sm-10">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
                                    <input type="password" class="form-control" name="nuevacontra" id="password"  placeholder="Ingrese su contraseña"/>
                                </div>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="confirm" class="cols-sm-2 control-label">Confirmación de contraseña</label>
                            <div class="cols-sm-10">
                                <div class="input-group">
                                    <span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
                                    <input type="password" class="form-control" name="confirm" id="confirm"  placeholder="Confirme su contraseña"/>
                                </div>
                            </div>
                        </div>

                        <div class="form-group ">
                            <button type="submit" value="submit" class="btn btn-primary btn-lg btn-block login-button">Registrar</button>
                        </div>

                    </form>
                </div>
            </div>
        </div>







        <script type="text/javascript" src="assets/js/bootstrap.js"></script>


    </body>
</html>