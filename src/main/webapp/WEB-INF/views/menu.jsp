<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
  <body>
  <div class="container">
    <p>Bem vindo, ${usuarioLogado.login}</p>
    <a href="cadastrar">Cadastrar</a><br/>
    <a href="listar">Listar</a><br/>
    <a href="abrirExcluir">Excluir</a><br/>
    <a href="chamarAlteracao">Alterar</a><br/>
    <a href="logout">Sair do sistema</a>
   </div>
  </body>
</html>
