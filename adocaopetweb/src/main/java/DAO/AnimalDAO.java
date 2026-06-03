/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Animal;
import util.ConexaoBD;
/**
 *
 * @author br3no
 */
public class AnimalDAO {
    public void inserir(Animal animal) {

    String sql = "INSERT INTO pets "
            + "(nome, especie, raca, idade, sexo, porte, cor, peso, "
            + "vacinado, castrado, descricao, statusAdocao, contatoResponsavel) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    try {

        Connection conn = ConexaoBD.getConexao();

        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setString(1, animal.getNome());
        stmt.setString(2, animal.getEspecie());
        stmt.setString(3, animal.getRaca());
        stmt.setInt(4, animal.getIdade());
        stmt.setString(5, animal.getSexo());
        stmt.setString(6, animal.getPorte());
        stmt.setString(7, animal.getCor());
        stmt.setDouble(8, animal.getPeso());
        stmt.setBoolean(9, animal.isVacinado());
        stmt.setBoolean(10, animal.isCastrado());
        stmt.setString(11, animal.getDescricao());
        stmt.setString(12, animal.getStatusAdocao());
        stmt.setString(13, animal.getContatoResponsavel());

        stmt.execute();

        stmt.close();
        conn.close();

    } catch (ClassNotFoundException e) {

        

    } catch (SQLException e) {

       
    }
   
}
    public ArrayList<Animal> listar() {

    ArrayList<Animal> lista = new ArrayList<>();

    String sql = "SELECT * FROM pets";

    try {

        Connection conn = ConexaoBD.getConexao();

        PreparedStatement stmt = conn.prepareStatement(sql);

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {

            Animal animal = new Animal();

            animal.setId(rs.getInt("id"));
            animal.setNome(rs.getString("nome"));
            animal.setEspecie(rs.getString("especie"));
            animal.setRaca(rs.getString("raca"));
            animal.setIdade(rs.getInt("idade"));
            animal.setSexo(rs.getString("sexo"));
            animal.setPorte(rs.getString("porte"));
            animal.setCor(rs.getString("cor"));
            animal.setPeso(rs.getDouble("peso"));
            animal.setVacinado(rs.getBoolean("vacinado"));
            animal.setCastrado(rs.getBoolean("castrado"));
            animal.setDescricao(rs.getString("descricao"));
            animal.setStatusAdocao(rs.getString("statusAdocao"));
            animal.setContatoResponsavel(rs.getString("contatoResponsavel"));

            lista.add(animal);
        }

        rs.close();
        stmt.close();
        conn.close();

    } catch (ClassNotFoundException e) {

        

    } catch (SQLException e) {

       
    }

    return lista;
}
    
    
    public void deletar(int id) {

    String sql = "DELETE FROM pets WHERE id = ?";

    try {

        Connection conn = ConexaoBD.getConexao();

        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setInt(1, id);

        stmt.execute();

        stmt.close();
        conn.close();

        System.out.println("Animal deletado com sucesso!");

    } catch (ClassNotFoundException e) {

       

    } catch (SQLException e) {

       
    }
}
    public Animal buscarPorId(int id) {

    String sql = "SELECT * FROM pets WHERE id = ?";

    Animal animal = new Animal();

    try {

        Connection conn = ConexaoBD.getConexao();
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            animal.setId(rs.getInt("id"));
            animal.setNome(rs.getString("nome"));
            animal.setEspecie(rs.getString("especie"));
            animal.setRaca(rs.getString("raca"));
            animal.setIdade(rs.getInt("idade"));
            animal.setSexo(rs.getString("sexo"));
            animal.setPorte(rs.getString("porte"));
            animal.setCor(rs.getString("cor"));
            animal.setPeso(rs.getDouble("peso"));
            animal.setVacinado(rs.getBoolean("vacinado"));
            animal.setCastrado(rs.getBoolean("castrado"));
            animal.setDescricao(rs.getString("descricao"));
            animal.setStatusAdocao(rs.getString("statusAdocao"));
            animal.setContatoResponsavel(rs.getString("contatoResponsavel"));
        }
        rs.close();
        stmt.close();
        conn.close();

    } catch (ClassNotFoundException e) {
        
    } catch (SQLException e) {
       
    }
    return animal;
}
    public void atualizar(Animal animal) {

    String sql = "UPDATE pets SET "
            + "nome = ?, "
            + "especie = ?, "
            + "raca = ?, "
            + "idade = ?, "
            + "sexo = ?, "
            + "porte = ?, "
            + "cor = ?, "
            + "peso = ?, "
            + "vacinado = ?, "
            + "castrado = ?, "
            + "descricao = ?, "
            + "statusAdocao = ?, "
            + "contatoResponsavel = ? "
            + "WHERE id = ?";

    try {

        Connection conn = ConexaoBD.getConexao();

        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setString(1, animal.getNome());
        stmt.setString(2, animal.getEspecie());
        stmt.setString(3, animal.getRaca());
        stmt.setInt(4, animal.getIdade());
        stmt.setString(5, animal.getSexo());
        stmt.setString(6, animal.getPorte());
        stmt.setString(7, animal.getCor());
        stmt.setDouble(8, animal.getPeso());
        stmt.setBoolean(9, animal.isVacinado());
        stmt.setBoolean(10, animal.isCastrado());
        stmt.setString(11, animal.getDescricao());
        stmt.setString(12, animal.getStatusAdocao());
        stmt.setString(13, animal.getContatoResponsavel());

        stmt.setInt(14, animal.getId());

        stmt.executeUpdate();

        stmt.close();
        conn.close();

        System.out.println("Animal atualizado com sucesso!");

    } catch (ClassNotFoundException e) {

    } catch (SQLException e) {

    }
}
}