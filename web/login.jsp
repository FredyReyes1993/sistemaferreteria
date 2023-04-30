<%@page session="true" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link href="estiloscss/login.css" rel="stylesheet" type="text/css"/>
	<!--Boostrap 4 -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    
    <!--Fontawesome-->
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
       
        
        <script src="https://ajax.googleapes.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script src="boostrap/js/sweetalert.min.js" type="text/javascript"></script>
        
 <script type="text/javascript">  
        function validate(){
                var password=document.Login.txtcontra.value;
                var user=document.Login.txtusuario.value;
                 if (user=="")
                 {
                     alert("Ingrese su Usuario");
                     document.Login.txtusuario.focus();
                     return false;
                 }
                 else if (password=="")
                 {
                     alert("Ingrese su Contraseña ");
                     document.Login.txtcontra.focus();
                     return false;
                 }
            }
 </script>     
            
        
   <title>Sistema Ferreteria | 2023</title>
    </head>
    <body>
<div class="container">
    <div class="d-flex justify-content-center h-100">
		<div class="card">
			<div class="card-header">        
        <h3>Inicio de Sesion</h3>
    <div class="d-flex justify-content-end social_icon">
        <span><i class="fab fa-facebook-square"></i></span>
	<span><i class="fab fa-google-plus-square"></i></span>
	<span><i class="fab fa-twitter-square"></i></span>
    </div>
    </div>
    <div class="card-body">        
        
<form name="frmLogin" action="svrlogin" method="POST">
 	<div class="input-group form-group">
	<div class="input-group-prepend">
        <span class="input-group-text"><i class="fas fa-user"></i></span>
	</div>   
    <input type="usuario" class="form-control"  name="txtusuario" placeholder="Usuario">
	</div>

<div class="input-group form-group">
    <div class="input-group-prepend">
	<span class="input-group-text"><i class="fas fa-key"></i></span>
    </div>    
    
 <input type="password" class="form-control" name="txtcontra" placeholder="Contraseña">
</div>

<div class="row align-items-center remember">
    <input type="checkbox">Recordar credenciales
</div>
    <div class="form-group">    
    
 <input type="submit" onClick="return validate();" name="ingresar" value="Acceder" class="btn float-right login_btn">
    </div>
</form>                    
 </div>                 
<div class="card-footer">
	<div class="d-flex justify-content-center links">
	No tiene acceso?<a href="#">Registrate</a>
        </div>
	<div class="d-flex justify-content-center">
	<a href="#">Olvidaste tu contraseña?</a>
	</div>
      	</div>
        </div>
    </div>
</div>
                    
       <%
            
            HttpSession sesion = request.getSession();
            
         if(request.getAttribute("respuesta")!=null)   
         {
              if(request.getAttribute("respuesta")=="True")
                {
                sesion.setAttribute("usuario", request.getAttribute("usuario"));
                sesion.setAttribute("perfil", request.getAttribute("perfil"));
                response.sendRedirect("master.jsp");
                }
              else
              {
        %>  
                <script> swal ( "Usuario No Encontrado" ,  "Sin Acceso al Sistema!" ,  "error" );</script>
                <%
              }
          }
          if (request.getParameter("cerrar")!=null)
            {
              session.invalidate();
            }
                %>
     
        <script src="js/jquery-3.3.1.slim.min.js" type="text/javascript"></script>
        <script src="js/popper.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>                
      
        
        
    </body>
</html>
