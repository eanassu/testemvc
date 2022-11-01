<%@page import="java.text.SimpleDateFormat"%>
<%@page import="br.vemprafam.pojo.Funcionario"%>
<%@page import="br.vemprafam.dao.DaoFuncionario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fam" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://code.jquery.com/ui/1.13.2/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script src="https://code.jquery.com/ui/1.13.2/jquery-ui.js"></script>
<title>Alteração</title>
</head>
<body>
<%
Funcionario funcionario = (Funcionario) session.getAttribute("funcionario");
SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
String dataAdmStr = format.format(funcionario.getDataAdmissao());
%>
<form action='alterar'>
RE:<input type='text' name='re' value="<%=funcionario.getRe()%>"/><br/>
nome:<input type='text' name='nome' value="<%=funcionario.getNome()%>"/><br/>
data de admissão:<fam:campoData id='dataAdmissao' value="<%=dataAdmStr%>"/><br/>
salário:<input type='text' name='salario' value="<%=funcionario.getSalario()%>"/><br/>
e-mail:<input type='text' name='email' value='<%=funcionario.getEmail()%>'/><br/>
<input type='submit' value='enviar'>
</form>
</body>
</html>