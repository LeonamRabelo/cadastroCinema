/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Ingrid e Wanessa
 */
public class CLIENTES {

    /**
     * @return the CODIGOC
     */
    public int getCODIGOC() {
        return CODIGOC;
    }

    /**
     * @param CODIGOC the CODIGOC to set
     */
    public void setCODIGOC(int CODIGOC) {
        this.CODIGOC = CODIGOC;
    }

    /**
     * @return the DATA_NASCIMENTOC
     */
    public String getDATA_NASCIMENTOC() {
        return DATA_NASCIMENTOC;
    }

    /**
     * @param DATA_NASCIMENTOC the DATA_NASCIMENTOC to set
     */
    public void setDATA_NASCIMENTOC(String DATA_NASCIMENTOC) {
        this.DATA_NASCIMENTOC = DATA_NASCIMENTOC;
    }

    /**
     * @return the DATA_CADASTROC
     */
    public String getDATA_CADASTROC() {
        return DATA_CADASTROC;
    }

    /**
     * @param DATA_CADASTROC the DATA_CADASTROC to set
     */
    public void setDATA_CADASTROC(String DATA_CADASTROC) {
        this.DATA_CADASTROC = DATA_CADASTROC;
    }

    /**
     * @return the NOMEC
     */
    public String getNOMEC() {
        return NOMEC;
    }

    /**
     * @param NOMEC the NOMEC to set
     */
    public void setNOMEC(String NOMEC) {
        this.NOMEC = NOMEC;
    }

    /**
     * @return the CPFC
     */
    public String getCPFC() {
        return CPFC;
    }

    /**
     * @param CPFC the CPFC to set
     */
    public void setCPFC(String CPFC) {
        this.CPFC = CPFC;
    }

    /**
     * @return the ENDERECOC
     */
    public String getENDERECOC() {
        return ENDERECOC;
    }

    /**
     * @param ENDERECOC the ENDERECOC to set
     */
    public void setENDERECOC(String ENDERECOC) {
        this.ENDERECOC = ENDERECOC;
    }

    /**
     * @return the TELEFONEC
     */
    public String getTELEFONEC() {
        return TELEFONEC;
    }

    /**
     * @param TELEFONEC the TELEFONEC to set
     */
    public void setTELEFONEC(String TELEFONEC) {
        this.TELEFONEC = TELEFONEC;
    }

    /**
     * @return the DATA_NASCIMENTOC
     */

     
    private int CODIGOC;
    private String NOMEC;
    private String CPFC;
    private String ENDERECOC;
    private String TELEFONEC;
    private String DATA_NASCIMENTOC;
    private String DATA_CADASTROC;
    
 public void Salvar() throws ClassNotFoundException, SQLException{

            PreparedStatement ps = Conexão.getConexão().prepareStatement("INSERT into CLIENTES(CODICOC, NOMEC, CPFC, ENDERECOC, TELEFONEC, DATA_NASCIMENTOC, DATA_CADASTROC) values(?,?,?,?,?,?,?)");
            ps.setInt(1, CODIGOC);
            ps.setString(2, NOMEC);
            ps.setString(3, CPFC);
            ps.setString(4, ENDERECOC);
            ps.setString(5, TELEFONEC);
            ps.setString(6, DATA_NASCIMENTOC);
            ps.setString(7, DATA_CADASTROC);
            ps.executeUpdate();
 }
 
}