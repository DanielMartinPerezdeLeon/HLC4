<%-- 
    Document   : ListarArticulos
    Created on : 20-feb-2023, 16:37:26
    Author     : alumno
--%>
<%@page import="Modelo.ListasPaises"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.HashMap"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.Map"%>
<%@page import="Modelo.Comida"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Lista de comidas</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>


    <body>
        <h1>Listado de las Comidas</h1>

        <% 
            Comida.getListacomidas().clear();
            Comida.RellenarLista();   
            ListasPaises.Reiniciar();
        %>


        <%
            for (Map.Entry<String, Comida> entry : Comida.getListacomidas().entrySet()) {
                    
                if(entry.getValue().getPais().equalsIgnoreCase("Italia")){
                    ListasPaises.italia.add(entry.getValue());
                }else if(entry.getValue().getPais().equalsIgnoreCase("Alemania")){
                    ListasPaises.alemania.add(entry.getValue());
                }else if(entry.getValue().getPais().equalsIgnoreCase("Espana")){
                    ListasPaises.espana.add(entry.getValue());
                }else{
                    ListasPaises.otro.add(entry.getValue());
                }
        }%>
        
        
        <article>
            <h2>Italia</h2>
            <% for (Comida c:ListasPaises.italia){
                %><p><% out.println(c.getNombre()); %></p>
                <p><% out.println(c.getFoto()); %></p>
                <img src="<% c.getPais(); %>"></img
            <%}%>
        </article>
        
        <article>
            <h2>Alemania</h2>
            <% for (Comida c:ListasPaises.alemania){
                %><p><% out.println(c.getNombre()); %></p>
            <%}%>
        </article>
        
        <article>
            <h2>España</h2>
            <% for (Comida c:ListasPaises.espana){
                %><p><% out.println(c.getNombre()); %></p>
            <%}%>
        </article>

    </body>
</html>
