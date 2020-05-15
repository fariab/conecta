/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.connect.banco;

import java.util.Objects;

/**
 *
 * @author Matheus
 */
public class Banco {
    private Integer idBanco;
    private String nomeBanco;
    private Integer numBanco;
    
    /**
     * @return the idBanco
     */
    public Integer getIdBanco() {
        return idBanco;
    }

    /**
     * @param idBanco the idBanco to set
     */
    public void setIdBanco(Integer idBanco) {
        this.idBanco = idBanco;
    }

    /**
     * @return the nomeBanco
     */
    public String getNomeBanco() {
        return nomeBanco;
    }

    /**
     * @param nomeBanco the nomeBanco to set
     */
    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    /**
     * @return the numBanco
     */
    public Integer getNumBanco() {
        return numBanco;
    }

    /**
     * @param numBanco the numBanco to set
     */
    public void setNumBanco(Integer numBanco) {
        this.numBanco = numBanco;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.idBanco);
        hash = 97 * hash + Objects.hashCode(this.nomeBanco);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Banco other = (Banco) obj;
        if (!Objects.equals(this.idBanco, other.idBanco)) {
            return false;
        }
        if (!Objects.equals(this.nomeBanco, other.nomeBanco)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Banco{" + "idBanco=" + idBanco + ", nomeBanco=" + nomeBanco + ", numBanco=" + numBanco + '}';
    }

    public Banco(Integer idBanco, String nomeBanco, Integer numBanco) {
        this.idBanco = idBanco;
        this.nomeBanco = nomeBanco;
        this.numBanco = numBanco;
    }
    
}
