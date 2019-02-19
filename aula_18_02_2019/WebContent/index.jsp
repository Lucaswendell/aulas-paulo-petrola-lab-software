<%-- Delimitador de configurção --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%-- Delimitador de comentario --%>
<%-- 
	delimitadores jsp
		<% %> -> delimitador de script
		<%= %> -> delimitador de expressao. Sempre de saida
		<%! %> -> delimitador de declaração
		<%@ %> -> delimitador de configuração
 --%>
<meta charset="UTF-8">
<title>Delimitadores JSP</title>
</head>
<body>
<%-- Delimitador de script --%>
<%
	String lais = "Lais I love you";
	out.print("<h3>"+lais+"</h3>");
%>
<%-- delimitador de expressão --%>
<%= lais %>
<%-- Delimitador de declaração --%>
<%! String mensagem = "Vida de Gado"; %>
</body>
</html>