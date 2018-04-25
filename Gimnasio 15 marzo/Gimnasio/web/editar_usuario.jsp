<%-- 
    
--%>

<%@page import="logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Usuario</title>
        <script src='funciones.jsp' language='JavaScript1.2'></script>
        <link href='diseno.css' rel='stylesheet' type='text/css'>
    </head>
    <body>
         <form id="frmActualizar_Usuario" action="Actualizar_Usuario" method="POST">
             <input type="hidden" id="txtId" name="txtId" value="<%= ((Usuario)session.getAttribute("usuario")).getId() %>">
        <table>
            <tr>
                <td>Nombre</td>
                <td><input type="text" id="nombre" name="nombre" value="<%= ((Usuario)session.getAttribute("usuario")).getNombre() %>"></td>
            </tr>
            <tr>
                <td>Telefono</td>
                <td><input type="number" id="tel" name="tel" value="<%= ((Usuario)session.getAttribute("usuario")).getTelefono() %>"></td>
            </tr>
            <tr>
                <td>Email</td>
                <td><input type="email" id="email" name="email" value="<%= ((Usuario)session.getAttribute("usuario")).getEmail() %>"></td>
            </tr>

            <tr>
                <td colspan="2"><input type="button" value="Aceptar" onclick="submit();"></td>
            </tr>
            
        </table>
        </form>
    </body>
</html>
