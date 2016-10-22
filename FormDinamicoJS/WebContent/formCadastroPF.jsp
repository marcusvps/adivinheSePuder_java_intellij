<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Página de Cadastro de Pessoas Fisicas</title>

<script type="text/javascript" src="jsSource.js"></script>


</head>
<body>
<b>Está pagina tem o objetivo de implementar um simples <br>
formulario com uso de JavaScript para ativar e desativar <br>
os inputs de forma hierarquica.</b><br>
-----------------------------------------------------
<br>

<!-- Areas dos inputs -->
<form id="iformcCadastroPF">
	<label>Nome:</label>
		<input type = "text" id="inameid" onchange="OnOffInputs(inameid);"/>
	<label>CPF:</label>
		<input type = "text" id="icpfid" onchange="OnOffInputs(icpfid);" disabled/>
	<br><br>
	<label>Data de Nascimento:</label>
		<input type = "text" id="idatanascimentoid" onchange="OnOffInputs(idatanascimentoid);" disabled/>
	<br><br>
	<label>Sexo:</label>
		Masculino<input type = "radio" name="sexo" value="Masculino" disabled/>
		Feminino<input type = "radio" name="sexo" value="Feminino" disabled/>
	<br><br>
	<input type="submit" value="Cadastrar"/>
</form>
</body>
</html>