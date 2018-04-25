<%-- 
    Document   : index
    Created on : 10/12/2011, 06:25:32 PM
    Author     : alejandro
--%>

<%@page import="java.util.List"%>
<%@page import="logica.Usuario"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% ResultSet usuario = (ResultSet)session.getAttribute("usuario"); %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agenda web</title>
        <script src='validar.jsp' language='JavaScript1.2'></script>
        <link href='diseno.css' rel='stylesheet' type='text/css'>
    </head>
    <body>
        <h1>Usuarios</h1>
        <table>
            <tr>
                <th>codigo</th><th>nombre</th><th>apellido</th><th>correo</th><th>acciones</th>
            </tr>
                <% while (usuario.next()){ %>
                    <tr>
                        <td><%= usuario.getString("con_id") %></td>
                        <td><%= usuario.getString("con_nombre") %></td>
                        <td><%= usuario.getString("con_telefono") %></td>
                        <td><%= usuario.getString("con_email") %></td>
                        <td class="links">
                            <a href="Cargar_Usuario?op=edit&item=<%= usuario.getString("con_id") %>">Editar</a>
                            <a href="Cargar_Usuario?op=delete&item=<%= usuario.getString("con_id") %>">Borrar</a>
                        </td>
                    </tr>
                <% }%>
                <tr>
                    <td colspan="5" class="links"><a href="index.html">Agregar</a></td>
            </tr>
        </table>
    </body>
</html>
