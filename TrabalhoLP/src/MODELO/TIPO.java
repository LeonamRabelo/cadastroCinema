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
public class TIPO {

    /**
     * @return the CODIGOT
     */
    public int getCODIGOT() {
        return CODIGOT;
    }

    /**
     * @param CODIGOT the CODIGOT to set
     */
    public void setCODIGOT(int CODIGOT) {
        this.CODIGOT = CODIGOT;
    }

    /**
     * @return the DESCRICAOT
     */
    public String getDESCRICAOT() {
        return DESCRICAOT;
    }

    /**
     * @param DESCRICAOT the DESCRICAOT to set
     */
    public void setDESCRICAOT(String DESCRICAOT) {
        this.DESCRICAOT = DESCRICAOT;
    }

    /**
     * @return the VALOR_LOCACAOT
     */
    public float getVALOR_LOCACAOT() {
        return VALOR_LOCACAOT;
    }

    /**
     * @param VALOR_LOCACAOT the VALOR_LOCACAOT to set
     */
    public void setVALOR_LOCACAOT(float VALOR_LOCACAOT) {
        this.VALOR_LOCACAOT = VALOR_LOCACAOT;
    }
    
    private int CODIGOT;
    private String DESCRICAOT;
    private float VALOR_LOCACAOT;
    
    public void Novo() throws ClassNotFoundException{
        try{
            PreparedStatement ps = Conexão.getConexão().prepareStatement("Insert into TIPO(CODIGOT, DESCRICAOT, VALOR_LOCACAOT) values(?,?,?)");
            ps.setInt(1, CODIGOT);
            ps.setString(2, DESCRICAOT);
            ps.setFloat(3, VALOR_LOCACAOT);
             ps.executeUpdate();
        }
        catch (SQLException ex) {
            if (ex.getMessage().indexOf("PRIMARY") > 0) {
                JOptionPane.showMessageDialog(null, "Codigo já existente");
            }
        }
    }
    
    public void Editar() throws ClassNotFoundException{
        
         try{
            PreparedStatement ps = Conexão.getConexão().prepareStatement("Update TIPO set CODIGOT = ?, DESCRICAOT = ?, VALOR_LOCACAOT = ? where CODIGOT =? ");
            ps.setInt(1, getCODIGOT());
            ps.setString(2, getDESCRICAOT());
            ps.setFloat(3, getVALOR_LOCACAOT());
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
             rs = Conexão.getConexão().createStatement().executeQuery("Select CODIGOT, DESCRICAOT, VALOR_LOCACAOT from TIPO");
            }
            catch (SQLException ex) {
            rs = null;
            Logger.getLogger(CLIENTES.class.getName()).log(Level.SEVERE, null, ex);
            }
         return rs;
      }
      
       public void Excluir() throws ClassNotFoundException{
          try{
            PreparedStatement ps = Conexão.getConexão().prepareStatement("Delete from TIPO where CODIGOT = ?");
            ps.setInt(1, getCODIGOT());
            ps.executeUpdate();
          } 
          
          catch (SQLException ex) {
            if (ex.getMessage().indexOf("PRIMARY") > 0) {
                JOptionPane.showMessageDialog(null, "Codigo já existente");
            }
        }
      
      }
 
       
}
