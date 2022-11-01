<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib tagdir="/WEB-INF/tags" prefix="fam" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulário</title>
<link rel="stylesheet" href="https://code.jquery.com/ui/1.13.2/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script src="https://code.jquery.com/ui/1.13.2/jquery-ui.js"></script>
</head>
<body>
<form action="gravarCadastro">
RE:<input type='text' name="re"/><br/>
nome:<input type='text' name='nome'/><br/>
data de admissão:<fam:campoData id='dataAdmissao'/><br/>
salário:<input type='text' name='salario'/><br/>
e-mail:<input type='text' name='email'/><br/>
<input type="hidden" name="logica" value="LogicaCadastro">
<input type='submit' value='Enviar'>
</form>
<br/>
<a href='menu'>voltar ao menu principal</a>
</body>
</html>