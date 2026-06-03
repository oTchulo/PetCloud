🐾 PetCloud

Sistema CRUD para gerenciamento de animais de pet shop desenvolvido em Java Web utilizando JSP, Servlets e banco de dados relacional.

📋 Descrição

O PetCloud é uma aplicação web que permite cadastrar, consultar, atualizar e remover informações de animais disponíveis em um pet shop ou centro de adoção.

O projeto foi desenvolvido com foco no aprendizado de conceitos de desenvolvimento web em Java, arquitetura MVC e integração com banco de dados.

🚀 Funcionalidades
Cadastro de animais
Consulta de todos os animais cadastrados
Atualização de informações dos animais
Exclusão de registros
Controle de vacinação
Controle de castração
Status de adoção
Armazenamento de contato do responsável
🛠️ Tecnologias Utilizadas
Java
JSP (Java Server Pages)
Servlets
HTML5
CSS3
Maven
JDBC
Apache Tomcat
Banco de Dados Relacional
📂 Estrutura do Projeto
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
├── resultado.jsp
├── resultadoatualizar.jsp
├── resultadoconsultartodos.jsp
└── estilo.css
🏗️ Arquitetura

O projeto segue o padrão MVC:

Model: classe Animal
View: páginas JSP e HTML
Controller: AnimalServlet
DAO: acesso ao banco de dados
▶️ Como Executar
Clone o repositório.
Configure o banco de dados.
Atualize as credenciais de conexão em ConexaoBD.java.
Execute o projeto em um servidor Apache Tomcat.
Acesse a aplicação pelo navegador.
📸 Telas do Sistema
Cadastro de Animais
Consulta de Animais
Atualização de Dados
Remoção de Registros
👨‍💻 Autor

Breno Diniz e Vitor Landim

Projeto desenvolvido para fins acadêmicos e estudo de Java Web.
