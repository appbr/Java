package DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class conexaoDAO {
    public Connection conectaBD(){
        Connection conn = null;
        
        try {
            String url = "jdbc:mysql://sql10.freesqldatabase.com:3306/sql10531594?user=sql10531594&password=itPIiLlL1t";
            conn = DriverManager.getConnection(url);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"ConexaoDAO" + erro.getMessage());
        }
        
        return conn;
    }
    
}
