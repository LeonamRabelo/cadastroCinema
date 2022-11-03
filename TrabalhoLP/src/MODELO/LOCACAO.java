/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Lion
 */
public class LOCACAO {
   private int CODIGO;
    private int CLIENTECODIGO;
    private int FUNCIONARIOCODIGO;
    private String DATA;
    private float VALORTOTAL;
    private String DATAENTREGUE;
    private int FUNCIONARIOCODIGORENTREGA;
    private String DATAENTREGA;
    private int DIARIAS;

    public int getCODIGO() {
        return CODIGO;
    }

    public void setCODIGO(int CODIGO) {
        this.CODIGO = CODIGO;
    }

    public int getCLIENTECODIGO() {
        return CLIENTECODIGO;
    }

    public void setCLIENTECODIGO(int CLIENTECODIGO) {
        this.CLIENTECODIGO = CLIENTECODIGO;
    }

    public int getFUNCIONARIOCODIGO() {
        return FUNCIONARIOCODIGO;
    }

    public void setFUNCIONARIOCODIGO(int FUNCIONARIOCODIGO) {
        this.FUNCIONARIOCODIGO = FUNCIONARIOCODIGO;
    }

    public String getDATA() {
        return DATA;
    }

    public void setDATA(String DATA) {
        this.DATA = DATA;
    }

    public float getVALORTOTAL() {
        return VALORTOTAL;
    }

    public void setVALORTOTAL(float VALORTOTAL) {
        this.VALORTOTAL = VALORTOTAL;
    }

    public String getDATAENTREGUE() {
        return DATAENTREGUE;
    }

    public void setDATAENTREGUE(String DATAENTREGUE) {
        this.DATAENTREGUE = DATAENTREGUE;
    }

    public int getFUNCIONARIOCODIGORENTREGA() {
        return FUNCIONARIOCODIGORENTREGA;
    }

    public void setFUNCIONARIOCODIGORENTREGA(int FUNCIONARIOCODIGORENTREGA) {
        this.FUNCIONARIOCODIGORENTREGA = FUNCIONARIOCODIGORENTREGA;
    }

    public String getDATAENTREGA() {
        return DATAENTREGA;
    }

    public void setDATAENTREGA(String DATAENTREGA) {
        this.DATAENTREGA = DATAENTREGA;
    }

    public int getDIARIAS() {
        return DIARIAS;
    }

    public void setDIARIAS(int DIARIAS) {
        this.DIARIAS = DIARIAS;
    }

    
   
 public void INSERIR() throws SQLException, ClassNotFoundException{
      
 PreparedStatement ps;
        ps = Conexão.getConexão().prepareStatement("INSERT into LOCACAO(CODIGOL, CLIENTE_COD, FUNCIONARIO_COD, DATAL, DATA_ENTREGA, VALOR_TOTAL, DIARIASL) values(?,?,?,?,?,?,?)");
            ps.setInt(1, CODIGO);
            ps.setInt(2, CLIENTECODIGO);
            ps.setInt(3, FUNCIONARIOCODIGO);
            ps.setString(4, DATA);
            ps.setString(5, DATAENTREGA);
            ps.setFloat(6, VALORTOTAL);
            ps.setInt(7, DIARIAS);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Locação realizada com sucesso");

}
  
}
