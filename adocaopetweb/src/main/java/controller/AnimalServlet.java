/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;

import dao.AnimalDAO;
import model.Animal;
/**
 *
 * @author br3no
 */
@WebServlet(name = "AnimalServlet", urlPatterns = {"/AnimalServlet"})
public class AnimalServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String op = request.getParameter("op");
        AnimalDAO adao = new AnimalDAO();
        Animal a = new Animal();
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            if (op.equals("CADASTRAR")) {

                String nome = request.getParameter("txtnome");
                String especie = request.getParameter("txtespecie");
                String raca = request.getParameter("txtraca");
                int idade = Integer.parseInt(request.getParameter("txtidade"));
                String sexo = request.getParameter("txtsexo");
                String porte = request.getParameter("txtporte");
                String cor = request.getParameter("txtcor");
                double peso = Double.parseDouble(request.getParameter("txtpeso"));

                boolean vacinado = request.getParameter("txtvacinado") != null;
                boolean castrado = request.getParameter("txtcastrado") != null;

                String descricao = request.getParameter("txtdescricao");
                String statusAdocao = request.getParameter("txtstatusAdocao");
                String contatoResponsavel = request.getParameter("txtcontatoResponsavel");

                a.setNome(nome);
                a.setEspecie(especie);
                a.setRaca(raca);
                a.setIdade(idade);
                a.setSexo(sexo);
                a.setPorte(porte);
                a.setCor(cor);
                a.setPeso(peso);
                a.setVacinado(vacinado);
                a.setCastrado(castrado);
                a.setDescricao(descricao);
                a.setStatusAdocao(statusAdocao);
                a.setContatoResponsavel(contatoResponsavel);
                
                String msg = "Cadastrar";

                adao.inserir(a);

                request.setAttribute("message", "Animal cadastrado com sucesso!");
                request.getRequestDispatcher("resultado.jsp").forward(request, response);
                
             
}
            else if (op.equals("CONSULTAR TODOS")) {

                ArrayList<Animal> lista = adao.listar();

                request.setAttribute("listaAnimais", lista);

                request.getRequestDispatcher("resultadoconsultartodos.jsp")
                       .forward(request, response);
}
            else if (op.equals("DELETAR")) {

                int id = Integer.parseInt(request.getParameter("txtid"));
                adao.deletar(id);
                ArrayList<Animal> lista = adao.listar();
                request.setAttribute("listaAnimais", lista);
                request.getRequestDispatcher("resultadoconsultartodos.jsp")
                       .forward(request, response);
}
            else if (op.equals("ATUALIZAR")) {

                int id = Integer.parseInt(request.getParameter("txtid"));
                a = adao.buscarPorId(id);
                request.setAttribute("a", a);
                request.getRequestDispatcher("resultadoatualizar.jsp")
                       .forward(request, response);
}
            else if (op.equals("EFETIVAR ATUALIZACAO")) {

                int id = Integer.parseInt(request.getParameter("txtid"));

                String nome = request.getParameter("txtnome");
                String especie = request.getParameter("txtespecie");
                String raca = request.getParameter("txtraca");
                int idade = Integer.parseInt(request.getParameter("txtidade"));
                String sexo = request.getParameter("txtsexo");
                String porte = request.getParameter("txtporte");
                String cor = request.getParameter("txtcor");
                double peso = Double.parseDouble(request.getParameter("txtpeso"));

                boolean vacinado = request.getParameter("txtvacinado") != null;
                boolean castrado = request.getParameter("txtcastrado") != null;

                String descricao = request.getParameter("txtdescricao");
                String statusAdocao = request.getParameter("txtstatusAdocao");
                String contatoResponsavel = request.getParameter("txtcontatoResponsavel");

                a.setId(id);
                a.setNome(nome);
                a.setEspecie(especie);
                a.setRaca(raca);
                a.setIdade(idade);
                a.setSexo(sexo);
                a.setPorte(porte);
                a.setCor(cor);
                a.setPeso(peso);
                a.setVacinado(vacinado);
                a.setCastrado(castrado);
                a.setDescricao(descricao);
                a.setStatusAdocao(statusAdocao);
                a.setContatoResponsavel(contatoResponsavel);
                adao.atualizar(a);

                String msg = "Atualizar";

                request.setAttribute("message", msg);

                request.getRequestDispatcher("resultado.jsp")
                       .forward(request, response);
}
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
