<%@page import="java.util.ArrayList"%>
<%@page import="model.Animal"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Todos os Animais</title>

    <link rel="stylesheet" href="estilo.css">

    <style>
        .tabela-container{
            width:95%;
            margin:30px auto;
            background:white;
            padding:20px;
            border-radius:15px;
            box-shadow:0 5px 20px rgba(0,0,0,0.15);
            overflow-x:auto;
        }

        table{
            width:100%;
            border-collapse:collapse;
        }

        th{
            background:#2563EB;
            color:white;
            padding:12px;
        }

        td{
            padding:10px;
            border-bottom:1px solid #ddd;
            text-align:center;
        }

        tr:hover{
            background:#f3f4f6;
        }

        .btn-editar{
            background:#22C55E;
            color:white;
            padding:6px 12px;
            border-radius:6px;
            text-decoration:none;
            font-weight:bold;
        }

        .btn-deletar{
            background:#EF4444;
            color:white;
            padding:6px 12px;
            border-radius:6px;
            text-decoration:none;
            font-weight:bold;
        }

        .voltar{
            display:inline-block;
            margin-top:20px;
            background:#2563EB;
            color:white;
            padding:10px 15px;
            border-radius:8px;
            text-decoration:none;
            font-weight:bold;
        }

        h1{
            text-align:center;
            margin:20px 0;
        }
    </style>

</head>
<body>

<h1>🐾 Animais Cadastrados</h1>

<div class="tabela-container">

<%
    ArrayList<Animal> listaAnimais =
            (ArrayList<Animal>) request.getAttribute("listaAnimais");
%>

<table>

    <tr>
        <th>ID</th>
        <th>Nome</th>
        <th>Espécie</th>
        <th>Raça</th>
        <th>Idade</th>
        <th>Sexo</th>
        <th>Porte</th>
        <th>Cor</th>
        <th>Peso</th>
        <th>Vacinado</th>
        <th>Castrado</th>
        <th>Status</th>
        <th>Contato</th>
        <th>Remover</th>
        <th>Editar</th>
    </tr>

    <% for(Animal a : listaAnimais) { %>

    <tr>
        <td><%= a.getId() %></td>
        <td><%= a.getNome() %></td>
        <td><%= a.getEspecie() %></td>
        <td><%= a.getRaca() %></td>
        <td><%= a.getIdade() %></td>
        <td><%= a.getSexo() %></td>
        <td><%= a.getPorte() %></td>
        <td><%= a.getCor() %></td>
        <td><%= a.getPeso() %></td>
        <td><%= a.isVacinado() ? "Sim" : "Não" %></td>
        <td><%= a.isCastrado() ? "Sim" : "Não" %></td>
        <td><%= a.getStatusAdocao() %></td>
        <td><%= a.getContatoResponsavel() %></td>

        <td>
            <a class="btn-deletar"
               href="AnimalServlet?op=DELETAR&txtid=<%=a.getId()%>">
                Excluir
            </a>
        </td>

        <td>
            <a class="btn-editar"
               href="AnimalServlet?op=ATUALIZAR&txtid=<%=a.getId()%>">
                Editar
            </a>
        </td>

    </tr>

    <% } %>

</table>

<br>

<a class="voltar"
   href="<%=request.getContextPath()%>/index.html">
   ← Voltar ao Cadastro
</a>

</div>

</body>
</html>