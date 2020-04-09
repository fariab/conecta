/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.connect.modelo;

import java.util.Date;

/**
 *
 * @author gustavo
 */
public class Disponibilizacao {

    @Override
    public String toString() {
        return "Disponibilizacao{" + "DataDisponibilizacao=" + getDataDisponibilizacao() + ", DataDevolucao=" + getDataDevolucao() + ", valor=" + getValor() + ", ConfirmacaoDevolucao=" + getConfirmacaoDevolucao() + '}';
    }
    private Date DataDisponibilizacao;
    private Date DataDevolucao;
    private float valor;
    private String ConfirmacaoDevolucao;
    private int ID;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.ID;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Disponibilizacao other = (Disponibilizacao) obj;
        if (this.ID != other.ID) {
            return false;
        }
        return true;
    }
    

    /**
     * @return the DataDisponibilizacao
     */
    public Date getDataDisponibilizacao() {
        return DataDisponibilizacao;
    }

    /**
     * @param DataDisponibilizacao the DataDisponibilizacao to set
     */
    public void setDataDisponibilizacao(Date DataDisponibilizacao) {
        this.DataDisponibilizacao = DataDisponibilizacao;
    }

    /**
     * @return the DataDevolucao
     */
    public Date getDataDevolucao() {
        return DataDevolucao;
    }

    /**
     * @param DataDevolucao the DataDevolucao to set
     */
    public void setDataDevolucao(Date DataDevolucao) {
        this.DataDevolucao = DataDevolucao;
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

    /**
     * @return the ConfirmacaoDevolucao
     */
    public String getConfirmacaoDevolucao() {
        return ConfirmacaoDevolucao;
    }

    /**
     * @param ConfirmacaoDevolucao the ConfirmacaoDevolucao to set
     */
    public void setConfirmacaoDevolucao(String ConfirmacaoDevolucao) {
        this.ConfirmacaoDevolucao = ConfirmacaoDevolucao;
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }
}
