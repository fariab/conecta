/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.connect.usuario;

import java.util.Objects;

/**
 *
 * @author Matheus
 */
public class Usuario {
    private Integer idUsuario;
    private String nomUsuario;
    private Integer numCpf;
    private String enderecoUsuario;
    private Integer telUsuario;

    /**
     * @return the idUsuario
     */
    public Integer getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * @return the nomUsuario
     */
    public String getNomUsuario() {
        return nomUsuario;
    }

    /**
     * @param nomUsuario the nomUsuario to set
     */
    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }

    /**
     * @return the numCpf
     */
    public Integer getNumCpf() {
        return numCpf;
    }

    /**
     * @param numCpf the numCpf to set
     */
    public void setNumCpf(Integer numCpf) {
        this.numCpf = numCpf;
    }

    /**
     * @return the enderecoUsuario
     */
    public String getEnderecoUsuario() {
        return enderecoUsuario;
    }

    /**
     * @param enderecoUsuario the enderecoUsuario to set
     */
    public void setEnderecoUsuario(String enderecoUsuario) {
        this.enderecoUsuario = enderecoUsuario;
    }

    /**
     * @return the telUsuario
     */
    public Integer getTelUsuario() {
        return telUsuario;
    }

    /**
     * @param telUsuario the telUsuario to set
     */
    public void setTelUsuario(Integer telUsuario) {
        this.telUsuario = telUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.idUsuario);
        hash = 37 * hash + Objects.hashCode(this.nomUsuario);
        hash = 37 * hash + Objects.hashCode(this.numCpf);
        hash = 37 * hash + Objects.hashCode(this.telUsuario);
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
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.idUsuario, other.idUsuario)) {
            return false;
        }
        if (!Objects.equals(this.nomUsuario, other.nomUsuario)) {
            return false;
        }
        if (!Objects.equals(this.numCpf, other.numCpf)) {
            return false;
        }
        if (!Objects.equals(this.telUsuario, other.telUsuario)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", nomUsuario=" + nomUsuario + ", numCpf=" + numCpf + ", enderecoUsuario=" + enderecoUsuario + ", telUsuario=" + telUsuario + '}';
    }

    public Usuario(Integer idUsuario, String nomUsuario, Integer numCpf, String enderecoUsuario, Integer telUsuario) {
        this.idUsuario = idUsuario;
        this.nomUsuario = nomUsuario;
        this.numCpf = numCpf;
        this.enderecoUsuario = enderecoUsuario;
        this.telUsuario = telUsuario;
    }
    
}
