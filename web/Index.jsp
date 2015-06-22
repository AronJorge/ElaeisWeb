<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : index
    Created on : 7/06/2015, 06:32:00 PM
    Author     : JORGE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title> Elaeis Web </title>
        <meta charset = "utf-8"/>
        <link rel="stylesheet" href="css/materialize.min.css">
    </head>

    <body>

        <div class="navbar-fixed">

            <nav>
                <div class="nav-wrapper">
                    <a href="#" class="brand-logo">Elaeis Web</a>


                    <ul id="nav-moblie" class="right side">

                        <li><a href="#">Enlace 1</a></li>
                        <li><a href="#">Enlace 2</a></li>
                        <li><a href="#"><i class="mdi-action-account-circle"></i></a></li>
                    </ul>
                </div>
            </nav>

        </div>

        <div class="container">
            <div class="row">
                <div class="col s12 ">
                    <div class="container">
                        <h3>Nombre Plantacion</h3>
                        <h4>Fecha Censo</h4>
                    </div>
                    <table class='bordered striped hoverable responsive-table'>
                        <thead>
                            <tr>
                                <th>linea</th>
                                <th>Palma</th>
                                <th>N. Inf Femenina</th>
                                <th>N. Racimo</th>
                                <th>Total</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="lista" items="${sessionScope.lista}">
                            <tr>
                                <td>${lista.id}</td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                            </tr>
                            </c:forEach>
                        </tbody>
                    </table>


                </div>
            </div>
        </div>
                <!--Adjuntando los archivos JS-->
                <script src="js/jquerty.min.js"></script>
                <script src="js/materialize.min.js"></script>
                </body>
                </html>





