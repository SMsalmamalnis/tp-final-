
<%@page import="java.util.List"%>
<%@page import="modelos.Sede"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Bootstrap -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
              rel="stylesheet"
              integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
              crossorigin="anonymous"
        />
        <title>Sedes</title>
    </head>
    <body>
        <div class="container">
            <h1 class="text-center mt-2">Sedes - Contactos</h1>
            <a class="btn btn-success" href="">Volver</a>
            <br>
            <br>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th class="text-center">ID</th>
                        <th class="text-center">NOMBRE SEDE</th>
                        <th class="text-center">CONTACTO</th>
                    </tr>
                </thead>
                <tbody>
                    <% List<Sede> listaSedes = (List<Sede>) request.getAttribute("listaSedes");
                    for (Sede sede : listaSedes) { %>
                    <tr>
                        <td class="text-center"><%= sede.getIdSede() %></td>
                        <td class="text-center"><%= sede.getNombreSede() %></td>
                        <td class="text-center"><%= sede.getContactoSede() %></td>
                    </tr>
                    <% } %>
                </tbody>
            </table>
        </div>
    </body>
</html>