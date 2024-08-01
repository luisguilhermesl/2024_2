package projetoquiz;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoJava {
    //conexao estatica - assim ja vai para memoria do java sem ter que estanciar
    
    private static final String url = "jdbc:mysql://localhost:3306/bd";
    //usuario e senha banco de dados
    
    private static final String user = "root";
    private static final String password ="8131";
    
    //criar objeto tipo conection, cuidado, sempre escolher java.sql
    
    private static Connection conn;
    
    //metodo estatico que vai fazer a verificacao se a conexao ja foi instanciada uma vez ou nao
    
     public static Connection getConexaoJava() throws SQLException{
         try{ //caso der erro de conexao ele cai no catch
         if(conn == null){ //quer dizer que ela nunca foi criado, entao vamos criar
             conn = DriverManager.getConnection(url,user,password);
             return conn;
         }else{
             return conn;
         }
         }catch(SQLException e){
             e.printStackTrace();
             return null;
         }
         
     }
}
