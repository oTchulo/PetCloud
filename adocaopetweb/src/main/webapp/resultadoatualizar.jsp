<%@page import="model.Animal"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    Animal a = (Animal) request.getAttribute("a");
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Atualizar Animal</title>

    <link rel="stylesheet" href="estilo.css">
</head>

<body>

<div class="container">

    <form action="AnimalServlet" method="GET">

        <h1>✏️ Atualizar Animal</h1>

        <input type="hidden" name="txtid" value="<%=a.getId()%>">

        <div class="campo">
            <label>Nome</label>
            <input type="text" name="txtnome"
                   value="<%=a.getNome()%>">
        </div>

        <div class="campo">
            <label>Espécie</label>
            <input type="text" name="txtespecie"
                   value="<%=a.getEspecie()%>">
        </div>

        <div class="campo">
            <label>Raça</label>
            <input type="text" name="txtraca"
                   value="<%=a.getRaca()%>">
        </div>

        <div class="campo">
            <label>Idade</label>
            <input type="text" name="txtidade"
                   value="<%=a.getIdade()%>">
        </div>

        <div class="campo">
            <label>Sexo</label>
            <input type="text" name="txtsexo"
                   value="<%=a.getSexo()%>">
        </div>

        <div class="campo">
            <label>Porte</label>
            <input type="text" name="txtporte"
                   value="<%=a.getPorte()%>">
        </div>

        <div class="campo">
            <label>Cor</label>
            <input type="text" name="txtcor"
                   value="<%=a.getCor()%>">
        </div>

        <div class="campo">
            <label>Peso</label>
            <input type="text" name="txtpeso"
                   value="<%=a.getPeso()%>">
        </div>

        <div class="campo">
            <label>
                <input type="checkbox" name="txtvacinado"
                       <%= a.isVacinado() ? "checked" : "" %>>
                Vacinado
            </label>
        </div>

        <div class="campo">
            <label>
                <input type="checkbox" name="txtcastrado"
                       <%= a.isCastrado() ? "checked" : "" %>>
                Castrado
            </label>
        </div>

        <div class="campo">
            <label>Descrição</label>
            <input type="text" name="txtdescricao"
                   value="<%=a.getDescricao()%>">
        </div>

        <div class="campo">
            <label>Status da Adoção</label>
            <input type="text" name="txtstatusAdocao"
                   value="<%=a.getStatusAdocao()%>">
        </div>

        <div class="campo">
            <label>Contato Responsável</label>
            <input type="text" name="txtcontatoResponsavel"
                   value="<%=a.getContatoResponsavel()%>">
        </div>

        <div class="botoes">
            <input type="submit"
                   name="op"
                   value="EFETIVAR ATUALIZACAO">
        </div>

    </form>

</div>

</body>
</html>