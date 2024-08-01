package projetoquiz;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import projetoquiz.ConexaoJava;

public class UsuarioDAO { //Data Access Objet
    //metodo de inserção de dados
    public void cadastrarUsuario(Usuario Usuario) throws SQLException{
        String sql = "INSERT INTO USUARIO (NOME, LOGIN, SENHA, EMAIL) VALUES (?, ?, ?, ?)";
        
        PreparedStatement ps = null;
        try{
        ps = ConexaoJava.getConexaoJava().prepareStatemet(sql);
        ps.setString(parameterIndex:1, usuario.getNome());
        ps.setString(parameterIndex:2, usuario.getLogin());
        ps.setDouble(parameterIndex:3, usuario.getPassword());
        ps.setString(parameterIndex:4, usuario.getEmail());
           
        ps.execute();
        ps.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
}
