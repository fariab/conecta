/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.connect.modelo;

import java.util.Calendar;

/**
 *
 * @author gabri
 */
public class FormaPagamento {
    
    private String nome;
    private String numero;
    private Calendar calendarioEm;

    
    
    @Override
    public String toString() {
        return "FormaPagamento{" + "nome=" + nome + ", numero=" + numero + ", calendarioEm=" + calendarioEm + '}';
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the calendarioEm
     */
    public Calendar getCalendarioEm() {
        return calendarioEm;
    }

    /**
     * @param calendarioEm the calendarioEm to set
     */
    public void setCalendarioEm(Calendar calendarioEm) {
        this.calendarioEm = calendarioEm;
    }
    
}
