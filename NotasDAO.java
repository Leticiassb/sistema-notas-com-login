package dao;
import factory.ConnectionFactory;
import modelo.Alunos;
import java.sql.*;
import java.sql.PreparedStatement;
public class NotasDAO { 
    private Connection connection;
    Long id;
    String aluno;
    String nota1;
    String nota2;
    String nota3;
    String nota4;
    String media;
    String situacao;
    
    public NotasDAO(){ 
        this.connection = new ConnectionFactory().getConnection();
    } 
    public void adiciona(Alunos alun){ 
        String sql = "INSERT INTO alunos(aluno,nota1,nota2,nota3,nota4,media,situacao) VALUES(?,?,?,?,?,?,?)";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, alun.getAluno());
            stmt.setString(2, alun.getNota1()); 
            stmt.setString(3, alun.getNota2());
            stmt.setString(4, alun.getNota3());
            stmt.setString(5, alun.getNota4());
            stmt.setString(6, alun.getMedia());
            stmt.setString(7, alun.getSituacaoFinal());
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
        
    } 
    
}