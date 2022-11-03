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
public class FILME {

    /**
     * @return the CODIGOF
     */
    public int getCODIGOF() {
        return CODIGOF;
    }

    /**
     * @param CODIGOF the CODIGOF to set
     */
    public void setCODIGOF(int CODIGOF) {
        this.CODIGOF = CODIGOF;
    }

    /**
     * @return the CATEGORIAF
     */
    public String getCATEGORIAF() {
        return CATEGORIAF;
    }

    /**
     * @param CATEGORIAF the CATEGORIAF to set
     */
    public void setCATEGORIAF(String CATEGORIAF) {
        this.CATEGORIAF = CATEGORIAF;
    }

    /**
     * @return the SINOPSEF
     */
    public String getSINOPSEF() {
        return SINOPSEF;
    }

    /**
     * @param SINOPSEF the SINOPSEF to set
     */
    public void setSINOPSEF(String SINOPSEF) {
        this.SINOPSEF = SINOPSEF;
    }

    /**
     * @return the CLASSIFICACAOF
     */
    public int getCLASSIFICACAOF() {
        return CLASSIFICACAOF;
    }

    /**
     * @param CLASSIFICACAOF the CLASSIFICACAOF to set
     */
    public void setCLASSIFICACAOF(int CLASSIFICACAOF) {
        this.CLASSIFICACAOF = CLASSIFICACAOF;
    }

    /**
     * @return the TIPO_CODIGOF
     */
    public int getTIPO_CODIGOF() {
        return TIPO_CODIGOF;
    }

    /**
     * @param TIPO_CODIGOF the TIPO_CODIGOF to set
     */
    public void setTIPO_CODIGOF(int TIPO_CODIGOF) {
        this.TIPO_CODIGOF = TIPO_CODIGOF;
    }

    /**
     * @return the VALOR_COMPRAF
     */
    public float getVALOR_COMPRAF() {
        return VALOR_COMPRAF;
    }

    /**
     * @param VALOR_COMPRAF the VALOR_COMPRAF to set
     */
    public void setVALOR_COMPRAF(float VALOR_COMPRAF) {
        this.VALOR_COMPRAF = VALOR_COMPRAF;
    }

    /**
     * @return the SITUACAOF
     */
    public String getSITUACAOF() {
        return SITUACAOF;
    }

    /**
     * @param SITUACAOF the SITUACAOF to set
     */
    public void setSITUACAOF(String SITUACAOF) {
        this.SITUACAOF = SITUACAOF;
    }
    private int CODIGOF;
    private String CATEGORIAF;
    private String SINOPSEF;
    private int CLASSIFICACAOF;
    private int TIPO_CODIGOF;
    private float VALOR_COMPRAF;
    private String SITUACAOF;
    
    public void Novo() throws ClassNotFoundException{
        try{
             PreparedStatement ps = Conexão.getConexão().prepareStatement("Insert into FILME(CODIGOF, CATEGORIAF, SINOPSEF, CLASSIFICACAOF, TIPO_CODIGOF, VALOR_COMPRAF, SITUACAOF) values(?, ?, ?, ?, ?, ?, ?)");
             ps.setInt(1, CODIGOF);
             ps.setString(2, CATEGORIAF);
             ps.setString(3, SINOPSEF);
             ps.setInt(4, CLASSIFICACAOF);
             ps.setInt(5, TIPO_CODIGOF);
             ps.setFloat(6, VALOR_COMPRAF);
             ps.setString(7, SITUACAOF);
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
            PreparedStatement ps = Conexão.getConexão().prepareStatement("Update FILME set CODIGOF = ?, CATEGORIAF = ?, SINOPSEF = ?, CLASSIFICACAOF = ?, TIPO_COFIGOF = ?, VALOR_COMPRAF = ?, SITUACAOF = ? where CODIGOF = ?");
             ps.setInt(1, getCODIGOF());
             ps.setString(2, getCATEGORIAF());
             ps.setString(3, getSINOPSEF());
             ps.setInt(4, getCLASSIFICACAOF());
             ps.setInt(5, getTIPO_CODIGOF());
             ps.setFloat(6, getVALOR_COMPRAF());
             ps.setString(7, getSITUACAOF());
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
        try{
          rs = Conexão.getConexão().createStatement().executeQuery("Select  CODIGOF, CATEGORIAF, SINOPSEF, CLASSIFICACAOF, TIPO_CODIGOF, VALOR_COMPRAF, SITUACAOF from FILME");
        }
       catch (SQLException ex) {
            rs = null;
            Logger.getLogger(CLIENTES.class.getName()).log(Level.SEVERE, null, ex);
        }
         return rs;
        
    
       }
       
      public void Excluir () throws ClassNotFoundException{
      
          try{
               PreparedStatement ps = Conexão.getConexão().prepareStatement("Delete from FILME where CODIGOF = ?");
               ps.setInt(1, getCODIGOF());
               ps.executeUpdate();
          }
          catch (SQLException ex) {
            if (ex.getMessage().indexOf("PRIMARY") > 0) {
                JOptionPane.showMessageDialog(null, "Codigo já existente");
            }
        }
      }
    
}
