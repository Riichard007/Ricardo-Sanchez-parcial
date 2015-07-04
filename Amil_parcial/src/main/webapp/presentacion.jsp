<%-- 
    Document   : presentacion
    Created on : 3/07/2015, 08:29:54 PM
    Author     : amil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Examen parcial Java 3</title>
    </head>
    <body>
        <h1>Resultado de calificaciones</h1>
        <form action="guardar-usuario" method="post">
            <table>
                <tr>
                    <td>Nombre</td>
                    <td><input type="text" name="nombre"></td>
                </tr>
                <tr>
                    <td>Calificación</td>
                    <td><input type="text" name="calificacion"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Guardar alumno"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
