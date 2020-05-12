/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.connect.alugados;

import java.util.Objects;

public class Alugados {
    private Integer idAlugados;
    private String NomeEquipamentos;
    private String DescricaoContrato;

    /**
     * @return the idAlugados
     */
    public Integer getIdAlugados() {
        return idAlugados;
    }

    /**
     * @param idAlugados the idAlugados to set
     */
    public void setIdAlugados(Integer idAlugados) {
        this.idAlugados = idAlugados;
    }

    /**
     * @return the NomeEquipamentos
     */
    public String getNomeEquipamentos() {
        return NomeEquipamentos;
    }

    /**
     * @param NomeEquipamentos the NomeEquipamentos to set
     */
    public void setNomeEquipamentos(String NomeEquipamentos) {
        this.NomeEquipamentos = NomeEquipamentos;
    }

    /**
     * @return the DescricaoContrato
     */
    public String getDescricaoContrato() {
        return DescricaoContrato;
    }

    /**
     * @param DescricaoContrato the DescricaoContrato to set
     */
    public void setDescricaoContrato(String DescricaoContrato) {
        this.DescricaoContrato = DescricaoContrato;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.idAlugados);
        hash = 89 * hash + Objects.hashCode(this.NomeEquipamentos);
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
        final Alugados other = (Alugados) obj;
        if (!Objects.equals(this.NomeEquipamentos, other.NomeEquipamentos)) {
            return false;
        }
        if (!Objects.equals(this.idAlugados, other.idAlugados)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Alugados{" + "idAlugados=" + idAlugados + ", NomeEquipamentos=" + NomeEquipamentos + '}';
    }

    public Alugados(Integer idAlugados, String NomeEquipamentos, String DescricaoContrato) {
        this.idAlugados = idAlugados;
        this.NomeEquipamentos = NomeEquipamentos;
        this.DescricaoContrato = DescricaoContrato;
    }
    
    
}
