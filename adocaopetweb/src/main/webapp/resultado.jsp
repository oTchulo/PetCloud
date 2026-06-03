<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>PetCloud - Resultado</title>

    <link rel="stylesheet" href="estilo.css">

    <style>

        .resultado-card{
            background:white;
            padding:40px;
            border-radius:15px;
            box-shadow:0 5px 20px rgba(0,0,0,0.2);
            text-align:center;
            max-width:500px;
        }

        .resultado-card h1{
            color:#22C55E;
            margin-bottom:20px;
        }

        .resultado-card p{
            font-size:18px;
            color:#374151;
            margin-bottom:25px;
        }

        .btn-voltar{
            display:inline-block;
            background:#2563EB;
            color:white;
            padding:12px 20px;
            border-radius:8px;
            text-decoration:none;
            font-weight:bold;
            transition:0.3s;
        }

        .btn-voltar:hover{
            background:#1D4ED8;
        }

    </style>

</head>
<body>

    <div class="resultado-card">

        <h1>✅ Operação realizada com sucesso!</h1>

        <p>${message}</p>

        <a class="btn-voltar"
           href="<%=request.getContextPath()%>/index.html">
            Voltar ao PetCloud
        </a>

    </div>

</body>
</html>