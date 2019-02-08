<%-- 
    Document   : practica1
    Created on : 8/02/2019, 08:14:30 AM
    Author     : utp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="PaqueteOp.OperacionesPractica1" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Operaciones</title>
    </head>
    <body>
        <p> ${param.Numero1} + ${param.Numero2} = <%= 
            OperacionesPractica1.suma(request.getParameter("Numero1"),request.getParameter("Numero2"))%> </p>
        
        <p> ${param.Numero1} - ${param.Numero2} = <%= 
            OperacionesPractica1.resta(request.getParameter("Numero1"),request.getParameter("Numero2"))%> </p>
        
        <p> ${param.Numero1} * ${param.Numero2} = <%= 
            OperacionesPractica1.mult(request.getParameter("Numero1"),request.getParameter("Numero2"))%> </p>
        
        <p> ${param.Numero1} / ${param.Numero2} = <%= 
            OperacionesPractica1.div(request.getParameter("Numero1"),request.getParameter("Numero2"))%> </p>
        
        <p> ${param.Numero1} % ${param.Numero2} = <%= 
            OperacionesPractica1.porc(request.getParameter("Numero1"),request.getParameter("Numero2"))%> </p>
    </body>
</html>
