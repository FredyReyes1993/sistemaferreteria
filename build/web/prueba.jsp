<%-- 
    Document   : prueba
    Created on : 1/04/2021, 11:05:39 AM
    Author     : FredyReyes
--%>
<%@page session="true" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Validar si la contraseña y la repetición de la contraseña son iguales</title>
<script>
function comprobarClave(){
    clave1 = document.f1.clave1.value
    clave2 = document.f1.clave2.value

    if (clave1 == clave2)
       alert("SI")
   
       
       
    else
       alert("Las dos claves son distintas...\nRealizaríamos las acciones del caso negativo")


}
</script>
</head>

<body>

<h1>Validar si la contraseña y la repetición de la contraseña son iguales</h1>
<br>
Escribe una supuesta contraseña dos veces, una en cada campo, y pulsa el botón. Javascript te dirá si las dos son iguales.

<br>
<form method="POST" action="prueba" name="f1">
Contraseña: <input type="password" name="clave1" size="20">
<br>
Repite contraseña: <input type="password" name="clave2" size="20">
<br>
<input type="button" value="Comprobar si son iguales" onClick="comprobarClave()">
</form>

<%
            
            HttpSession sesion = request.getSession();
            
         if(request.getAttribute("Usuarios")=="123")   
         {
                sesion.setAttribute("clave1", request.getAttribute("clave1"));
                response.sendRedirect("login.jsp");
                }
             
%>



</body>
</html>