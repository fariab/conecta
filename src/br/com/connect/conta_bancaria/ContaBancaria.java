
package br.com.connect.conta_bancaria;

import java.util.Objects;

/**
 *
 * @author Lucas Miguel
 */
public class ContaBancaria {
    private Integer idConta;
    private String nomBanco;
    private Integer numAgencia;
    private Integer numconta;

    /**
     * @return the idConta
     */
    public Integer getIdConta() {
        return idConta;
    }

    /**
     * @param idConta the idConta to set
     */
    public void setIdConta(Integer idConta) {
        this.idConta = idConta;
    }

    /**
     * @return the nomBanco
     */
    public String getNomBanco() {
        return nomBanco;
    }

    /**
     * @param nomBanco the nomBanco to set
     */
    public void setNomBanco(String nomBanco) {
        this.nomBanco = nomBanco;
    }

    /**
     * @return the numAgencia
     */
    public Integer getNumAgencia() {
        return numAgencia;
    }

    /**
     * @param numAgencia the numAgencia to set
     */
    public void setNumAgencia(Integer numAgencia) {
        this.numAgencia = numAgencia;
    }

    /**
     * @return the numconta
     */
    public Integer getNumconta() {
        return numconta;
    }

    /**
     * @param numconta the numconta to set
     */
    public void setNumconta(Integer numconta) {
        this.numconta = numconta;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.nomBanco);
        hash = 59 * hash + Objects.hashCode(this.numAgencia);
        hash = 59 * hash + Objects.hashCode(this.numconta);
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
        final ContaBancaria other = (ContaBancaria) obj;
        if (!Objects.equals(this.nomBanco, other.nomBanco)) {
            return false;
        }
        if (!Objects.equals(this.numAgencia, other.numAgencia)) {
            return false;
        }
        if (!Objects.equals(this.numconta, other.numconta)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" + "idConta=" + idConta + ", nomBanco=" + nomBanco + ", numAgencia=" + numAgencia + ", numconta=" + numconta + '}';
    }
    
    
}
