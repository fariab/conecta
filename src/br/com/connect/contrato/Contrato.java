/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.connect.contrato;

import java.util.Calendar;
import java.util.Objects;

public class Contrato {
    private Integer idContrato;
    private Calendar CompetenciaContratoInicio;
    private Calendar CompetenciaContratoFinal;
    private Calendar DataVencimento;
    private Float ValorBrutoContrato;
    private String DescricaoServicos;

    /**
     * @return the idContrato
     */
    public Integer getIdContrato() {
        return idContrato;
    }

    /**
     * @param idContrato the idContrato to set
     */
    public void setIdContrato(Integer idContrato) {
        this.idContrato = idContrato;
    }

    /**
     * @return the CompetenciaContratoInicio
     */
    public Calendar getCompetenciaContratoInicio() {
        return CompetenciaContratoInicio;
    }

    /**
     * @param CompetenciaContratoInicio the CompetenciaContratoInicio to set
     */
    public void setCompetenciaContratoInicio(Calendar CompetenciaContratoInicio) {
        this.CompetenciaContratoInicio = CompetenciaContratoInicio;
    }

    /**
     * @return the CompetenciaContratoFinal
     */
    public Calendar getCompetenciaContratoFinal() {
        return CompetenciaContratoFinal;
    }

    /**
     * @param CompetenciaContratoFinal the CompetenciaContratoFinal to set
     */
    public void setCompetenciaContratoFinal(Calendar CompetenciaContratoFinal) {
        this.CompetenciaContratoFinal = CompetenciaContratoFinal;
    }

    /**
     * @return the DataVencimento
     */
    public Calendar getDataVencimento() {
        return DataVencimento;
    }

    /**
     * @param DataVencimento the DataVencimento to set
     */
    public void setDataVencimento(Calendar DataVencimento) {
        this.DataVencimento = DataVencimento;
    }

    /**
     * @return the ValorBrutoContrato
     */
    public Float getValorBrutoContrato() {
        return ValorBrutoContrato;
    }

    /**
     * @param ValorBrutoContrato the ValorBrutoContrato to set
     */
    public void setValorBrutoContrato(Float ValorBrutoContrato) {
        this.ValorBrutoContrato = ValorBrutoContrato;
    }

    /**
     * @return the DescricaoServicos
     */
    public String getDescricaoServicos() {
        return DescricaoServicos;
    }

    /**
     * @param DescricaoServicos the DescricaoServicos to set
     */
    public void setDescricaoServicos(String DescricaoServicos) {
        this.DescricaoServicos = DescricaoServicos;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.idContrato);
        hash = 67 * hash + Objects.hashCode(this.CompetenciaContratoInicio);
        hash = 67 * hash + Objects.hashCode(this.CompetenciaContratoFinal);
        hash = 67 * hash + Objects.hashCode(this.DataVencimento);
        hash = 67 * hash + Objects.hashCode(this.ValorBrutoContrato);
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
        final Contrato other = (Contrato) obj;
        if (!Objects.equals(this.idContrato, other.idContrato)) {
            return false;
        }
        if (!Objects.equals(this.CompetenciaContratoInicio, other.CompetenciaContratoInicio)) {
            return false;
        }
        if (!Objects.equals(this.CompetenciaContratoFinal, other.CompetenciaContratoFinal)) {
            return false;
        }
        if (!Objects.equals(this.DataVencimento, other.DataVencimento)) {
            return false;
        }
        if (!Objects.equals(this.ValorBrutoContrato, other.ValorBrutoContrato)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Contrato{" + "idContrato=" + idContrato + ", CompetenciaContratoInicio=" + CompetenciaContratoInicio + ", CompetenciaContratoFinal=" + CompetenciaContratoFinal + ", DataVencimento=" + DataVencimento + ", ValorBrutoContrato=" + ValorBrutoContrato + ", DescricaoServicos=" + DescricaoServicos + '}';
    }

    public Contrato(Integer idContrato, Calendar CompetenciaContratoInicio, Calendar CompetenciaContratoFinal, Calendar DataVencimento, Float ValorBrutoContrato, String DescricaoServicos) {
        this.idContrato = idContrato;
        this.CompetenciaContratoInicio = CompetenciaContratoInicio;
        this.CompetenciaContratoFinal = CompetenciaContratoFinal;
        this.DataVencimento = DataVencimento;
        this.ValorBrutoContrato = ValorBrutoContrato;
        this.DescricaoServicos = DescricaoServicos;
    }
    
    
}
