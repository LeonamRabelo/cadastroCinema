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
public class Filmeslocados {

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the filmecod
     */
    public int getFilmecod() {
        return filmecod;
    }

    /**
     * @param filmecod the filmecod to set
     */
    public void setFilmecod(int filmecod) {
        this.filmecod = filmecod;
    }

    /**
     * @return the codloc
     */
    public int getCodloc() {
        return codloc;
    }

    /**
     * @param codloc the codloc to set
     */
    public void setCodloc(int codloc) {
        this.codloc = codloc;
    }

    /**
     * @return the valor
     */
    public float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(float valor) {
        this.valor = valor;
    }
    private int codigo;
    private int filmecod;
    private int codloc;
    private float valor;
    
    public void Inserir() throws ClassNotFoundException, SQLException{
             PreparedStatement ps;
            ps = Conexão.getConexão().prepareStatement("INSERT into FILMES_LOCADOS(CODIGO, FILME_COD, LOCACAO_COD, VALOR) values(?,?,?,?)");
            ps.setInt(1, codigo);
            ps.setInt(2, filmecod);
            ps.setInt(3, codloc);
            ps.setFloat(4, valor);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Locação realizada com sucesso");

    }
}
