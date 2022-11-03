/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Ingrid e Wanessa
 */
public class FUNCIONARIO {

    /**
     * @return the CODIGO_FUNC
     */
    public int getCODIGO_FUNC() {
        return CODIGO_FUNC;
    }

    /**
     * @param CODIGO_FUNC the CODIGO_FUNC to set
     */
    public void setCODIGO_FUNC(int CODIGO_FUNC) {
        this.CODIGO_FUNC = CODIGO_FUNC;
    }

    /**
     * @return the NOME_FUNC
     */
    public String getNOME_FUNC() {
        return NOME_FUNC;
    }

    /**
     * @param NOME_FUNC the NOME_FUNC to set
     */
    public void setNOME_FUNC(String NOME_FUNC) {
        this.NOME_FUNC = NOME_FUNC;
    }

    /**
     * @return the ENDERECO_FUNC
     */
    public String getENDERECO_FUNC() {
        return ENDERECO_FUNC;
    }

    /**
     * @param ENDERECO_FUNC the ENDERECO_FUNC to set
     */
    public void setENDERECO_FUNC(String ENDERECO_FUNC) {
        this.ENDERECO_FUNC = ENDERECO_FUNC;
    }

    /**
     * @return the TELEFONE_FUNC
     */
    public String getTELEFONE_FUNC() {
        return TELEFONE_FUNC;
    }

    /**
     * @param TELEFONE_FUNC the TELEFONE_FUNC to set
     */
    public void setTELEFONE_FUNC(String TELEFONE_FUNC) {
        this.TELEFONE_FUNC = TELEFONE_FUNC;
    }
    private int CODIGO_FUNC;
    private String NOME_FUNC;
    private String ENDERECO_FUNC;
    private String TELEFONE_FUNC;
    
    public void Novo() throws ClassNotFoundException, SQLException{
    FUNCIONARIO func = new FUNCIONARIO();
    Conexão Conexão = new Conexão();
            PreparedStatement ps = Conexão.getConexão().prepareStatement("INSERT into FUNCIONARIO(CODIGO_FUNC, NOME_FUNC, ENDERECO_FUNC, TELEFONE_FUNC) values(?,?,?,?)");
            ps.setInt(1, CODIGO_FUNC);
            ps.setString(2, NOME_FUNC);
            ps.setString(3, ENDERECO_FUNC);
            ps.setString(4, TELEFONE_FUNC);
             ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
    }
    
    public void Editar() throws ClassNotFoundException{
        try{
            PreparedStatement ps = Conexão.getConexão().prepareStatement("Update FUNCIONARIO set CODIGO_FUNC = ?, NOME_FUNC = ?, ENDERECO_FUNC = ?, TELEFONE_FUNC = ? where CODIGO_FUNC =? ");
            ps.setInt(1, getCODIGO_FUNC());
            ps.setString(2, getNOME_FUNC());
            ps.setString(3, getENDERECO_FUNC());
            ps.setString(4, getTELEFONE_FUNC());
            ps.execute();
        }
        
     catch (SQLException ex) {
            if (ex.getMessage().indexOf("PRIMARY") > 0) {
                JOptionPane.showMessageDialog(null, "Codigo já existente");
            }
        }
    }
    
      public ResultSet Selecionar() throws ClassNotFoundException{
        ResultSet rs;
            try {
             rs = Conexão.getConexão().createStatement().executeQuery("Select CODIGO_FUNC, NOME_FUNC, ENDERECO_FUNC, TELEFONE_FUNC from FUNCIONARIO");
            }
            catch (SQLException ex) {
            rs = null;
            Logger.getLogger(CLIENTES.class.getName()).log(Level.SEVERE, null, ex);
            }
         return rs;
      }
      
      public void Excluir() throws ClassNotFoundException{
          try{
            PreparedStatement ps = Conexão.getConexão().prepareStatement("Delete from FUNCIONARIO where CODIGO_FUNC = ?");
            ps.setInt(1, getCODIGO_FUNC());
            ps.executeUpdate();
          } 
          
          catch (SQLException ex) {
            if (ex.getMessage().indexOf("PRIMARY") > 0) {
                JOptionPane.showMessageDialog(null, "Codigo já existente");
            }
        }
      
      }
       
    
}
