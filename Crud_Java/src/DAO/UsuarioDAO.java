package DAO;

import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    Connection conn;

    public ResultSet autenticacaoUsuario(UsuarioDTO objusuarioDTO) {

        conn = new conexaoDAO().conectaBD();

        try {
            String sql = "select * from login where usuario = ? and senha = ? ";
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, objusuarioDTO.getNomeUsuario());
            pstm.setString(2, objusuarioDTO.getSenhaUsuario());
            
            ResultSet rs = pstm.executeQuery();
            
            return rs;
            
            
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO:" + erro);
            return null;
        }

    }
}
