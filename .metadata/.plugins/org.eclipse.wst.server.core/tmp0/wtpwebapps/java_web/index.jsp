<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>teste jsp</title>
</head>
<body>
	<%-- onde vai ficar os codigos em java--%>
	<% String nome; 
		nome = "paiva";
	%>
	<%-- delimitador de expresão: só saída <%= "ola"%>--%>
	<h1>quem é o spider? é o <%= nome%></h1>
</body>
</html>