/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.connect.empresa;

import java.util.Objects;

/**
 *
 * @author Matheus
 */
public class Empresa {
    private Integer idEmpresa;
    private String nomEmpressa;
    private String numCnpjEmpresa;
    private Integer telEmpresa;

    /**
     * @return the idEmpresa
     */
    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    /**
     * @param idEmpresa the idEmpresa to set
     */
    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    /**
     * @return the nomEmpressa
     */
    public String getNomEmpressa() {
        return nomEmpressa;
    }

    /**
     * @param nomEmpressa the nomEmpressa to set
     */
    public void setNomEmpressa(String nomEmpressa) {
        this.nomEmpressa = nomEmpressa;
    }

    /**
     * @return the numCnpjEmpresa
     */
    public String getNumCnpjEmpresa() {
        return numCnpjEmpresa;
    }

    /**
     * @param numCnpjEmpresa the numCnpjEmpresa to set
     */
    public void setNumCnpjEmpresa(String numCnpjEmpresa) {
        this.numCnpjEmpresa = numCnpjEmpresa;
    }

    /**
     * @return the telEmpresa
     */
    public Integer getTelEmpresa() {
        return telEmpresa;
    }

    /**
     * @param telEmpresa the telEmpresa to set
     */
    public void setTelEmpresa(Integer telEmpresa) {
        this.telEmpresa = telEmpresa;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.idEmpresa);
        hash = 97 * hash + Objects.hashCode(this.nomEmpressa);
        hash = 97 * hash + Objects.hashCode(this.numCnpjEmpresa);
        hash = 97 * hash + Objects.hashCode(this.telEmpresa);
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
        final Empresa other = (Empresa) obj;
        if (!Objects.equals(this.idEmpresa, other.idEmpresa)) {
            return false;
        }
        if (!Objects.equals(this.nomEmpressa, other.nomEmpressa)) {
            return false;
        }
        if (!Objects.equals(this.numCnpjEmpresa, other.numCnpjEmpresa)) {
            return false;
        }
        if (!Objects.equals(this.telEmpresa, other.telEmpresa)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "Empresa{" + "idEmpresa=" + idEmpresa + ", nomEmpressa=" + nomEmpressa + ", numCnpjEmpresa=" + numCnpjEmpresa + ", telEmpresa=" + telEmpresa + '}';
    }

    public Empresa(Integer idEmpresa, String nomEmpressa, String numCnpjEmpresa, Integer telEmpresa) {
        this.idEmpresa = idEmpresa;
        this.nomEmpressa = nomEmpressa;
        this.numCnpjEmpresa = numCnpjEmpresa;
        this.telEmpresa = telEmpresa;
    }
    
}
