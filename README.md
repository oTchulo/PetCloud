<h1 align="center">🐾 PetCloud</h1>

<p align="center">
  Sistema CRUD para gerenciamento de animais de pet shop desenvolvido em Java Web.
</p>

<hr>

<h2>📋 Descrição</h2>

<p>
O PetCloud é uma aplicação web desenvolvida para o gerenciamento de animais em pet shops e centros de adoção.
O sistema permite cadastrar, consultar, atualizar e remover informações de animais, utilizando Java Web com JSP,
Servlets e integração com banco de dados relacional.
</p>

<h2>🚀 Funcionalidades</h2>

<ul>
  <li>Cadastro de animais</li>
  <li>Consulta de todos os animais cadastrados</li>
  <li>Atualização de informações</li>
  <li>Exclusão de registros</li>
  <li>Controle de vacinação</li>
  <li>Controle de castração</li>
  <li>Status de adoção</li>
  <li>Cadastro de contato do responsável</li>
</ul>

<h2>🛠️ Tecnologias Utilizadas</h2>

<ul>
  <li>Java</li>
  <li>JSP</li>
  <li>Servlets</li>
  <li>HTML5</li>
  <li>CSS3</li>
  <li>JDBC</li>
  <li>Maven</li>
  <li>Apache Tomcat</li>
  <li>MySQL</li>
</ul>

<h2>🏗️ Arquitetura</h2>

<p>O projeto segue o padrão MVC:</p>

<ul>
  <li><strong>Model:</strong> Animal.java</li>
  <li><strong>View:</strong> JSP e HTML</li>
  <li><strong>Controller:</strong> AnimalServlet.java</li>
  <li><strong>DAO:</strong> AnimalDAO.java</li>
</ul>

<h2>📂 Estrutura do Projeto</h2>

<pre>
src/main/java
├── controller
│   └── AnimalServlet.java
├── DAO
│   └── AnimalDAO.java
├── model
│   └── Animal.java
└── util
    └── ConexaoBD.java

src/main/webapp
├── index.html
├── estilo.css
├── resultado.jsp
├── resultadoatualizar.jsp
└── resultadoconsultartodos.jsp
</pre>

<h2>▶️ Como Executar o Projeto</h2>

<h3>Pré-requisitos</h3>

<ul>
  <li>Java JDK 17 ou superior</li>
  <li>Apache Tomcat</li>
  <li>MySQL</li>
  <li>NetBeans IDE (opcional)</li>
</ul>

<h3>Configuração do Banco de Dados</h3>

<ol>
  <li>Crie um banco de dados MySQL.</li>
  <li>Execute o script SQL disponibilizado no projeto.</li>
  <li>Abra o arquivo <code>ConexaoBD.java</code>.</li>
  <li>Configure a URL, usuário e senha do banco de dados.</li>
</ol>

<h3>Execução</h3>

<ol>
  <li>Baixe ou clone este repositório.</li>
  <li>Abra o projeto no NetBeans.</li>
  <li>Configure o Apache Tomcat.</li>
  <li>Compile o projeto.</li>
  <li>Execute a aplicação.</li>
</ol>

<h3>Acesso</h3>

<pre>
http://localhost:8080/adocaopetweb
</pre>


<!-- Exemplo:
<img src="imgs/cadastro.png" width="800">
-->

<h2>👨‍💻 Autores</h2>

<ul>
  <li>Breno Diniz</li>
  <li>Vitor Landim</li>
</ul>

<hr>

<p align="center">
  Projeto desenvolvido para fins acadêmicos e estudo de Java Web.
</p>
