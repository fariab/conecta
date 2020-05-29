/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.connect.cadastrar_anuncio;

import java.util.Objects;

public class CadastrarAnuncio {
    private Integer idCadastro;
    private String NomeCadastro;
    private Float ValorItemCadastrado;
    
    public void CadastrarAnuncio(Integer idCadastro, String NomeCadastro, Float ValorItemCadastrado){
        CadastrarAnuncio ca = new CadastrarAnuncio(idCadastro, NomeCadastro, ValorItemCadastrado);
        System.out.println("Cadastrar os Anuncios de aluguel");
    }
    
    /**
     * @return the idCadastro
     */
    public Integer getIdCadastro() {
        return idCadastro;
    }

    /**
     * @param idCadastro the idCadastro to set
     */
    public void setIdCadastro(Integer idCadastro) {
        this.idCadastro = idCadastro;
    }

    /**
     * @return the NomeCadastro
     */
    public String getNomeCadastro() {
        return NomeCadastro;
    }

    /**
     * @param NomeCadastro the NomeCadastro to set
     */
    public void setNomeCadastro(String NomeCadastro) {
        this.NomeCadastro = NomeCadastro;
    }

    /**
     * @return the ValorItemCadastrado
     */
    public Float getValorItemCadastrado() {
        return ValorItemCadastrado;
    }

    /**
     * @param ValorItemCadastrado the ValorItemCadastrado to set
     */
    public void setValorItemCadastrado(Float ValorItemCadastrado) {
        this.ValorItemCadastrado = ValorItemCadastrado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.idCadastro);
        hash = 41 * hash + Objects.hashCode(this.NomeCadastro);
        hash = 41 * hash + Objects.hashCode(this.ValorItemCadastrado);
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
        final CadastrarAnuncio other = (CadastrarAnuncio) obj;
        if (!Objects.equals(this.NomeCadastro, other.NomeCadastro)) {
            return false;
        }
        if (!Objects.equals(this.idCadastro, other.idCadastro)) {
            return false;
        }
        if (!Objects.equals(this.ValorItemCadastrado, other.ValorItemCadastrado)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CadastrarAnuncio{" + "idCadastro=" + idCadastro + ", NomeCadastro=" + NomeCadastro + ", ValorItemCadastrado=" + ValorItemCadastrado + '}';
    }

    public CadastrarAnuncio(Integer idCadastro, String NomeCadastro, Float ValorItemCadastrado) {
        this.idCadastro = idCadastro;
        this.NomeCadastro = NomeCadastro;
        this.ValorItemCadastrado = ValorItemCadastrado;
    }
    
    
}
