package br.com.connect.modelo;

import java.util.ArrayList;
import java.util.List;

public class Equipamento {
  
    private Integer idCadastroEquipamento;
    private String nomeEquipamento;
    private Integer numeroDeSerie;
    private String fabricanteEquipamento;
    private Float valorBaseHora;

    public Equipamento(Integer idCadastroEquipamento, String nomeEquipamento,
            Integer numeroDeSerie, String fabricanteEquipamento, Float valorBaseHora) {
        this.idCadastroEquipamento = idCadastroEquipamento;
        this.nomeEquipamento = nomeEquipamento;
        this.numeroDeSerie = numeroDeSerie;
        this.fabricanteEquipamento = fabricanteEquipamento;
        this.valorBaseHora = valorBaseHora;
    }

    public Equipamento() { // Verificar o motivo do construtor ser obrigatório
    }
    
    
    
    /**
     * @return the idCadastroEquipamento
     */
    public Integer getIdCadastroEquipamento() {
        return idCadastroEquipamento;
    }

    /**
     * @param idCadastroEquipamento the idCadastroEquipamento to set
     */
    public void setIdCadastroEquipamento(Integer idCadastroEquipamento) {
        this.idCadastroEquipamento = idCadastroEquipamento;
    }

    /**
     * @return the nomeEquipamento
     */
    public String getNomeEquipamento() {
        return nomeEquipamento;
    }

    /**
     * @param nomeEquipamento the nomeEquipamento to set
     */
    public void setNomeEquipamento(String nomeEquipamento) {
        this.nomeEquipamento = nomeEquipamento;
    }

    /**
     * @return the numeroDeSerie
     */
    public Integer getNumeroDeSerie() {
        return numeroDeSerie;
    }

    /**
     * @param numeroDeSerie the numeroDeSerie to set
     */
    public void setNumeroDeSerie(Integer numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    /**
     * @return the fabricanteEquipamento
     */
    public String getFabricanteEquipamento() {
        return fabricanteEquipamento;
    }

    /**
     * @param fabricanteEquipamento the fabricanteEquipamento to set
     */
    public void setFabricanteEquipamento(String fabricanteEquipamento) {
        this.fabricanteEquipamento = fabricanteEquipamento;
    }

    /**
     * @return the valorBaseHora
     */
    public Float getValorBaseHora() {
        return valorBaseHora;
    }

    /**
     * @param valorBaseHora the valorBaseHora to set
     */
    public void setValorBaseHora(Float valorBaseHora) {
        this.valorBaseHora = valorBaseHora;
    }

    public void cadastroEquipamento() {
        System.out.println("Cadastro de equipamento no banco de dados  .");
    }

    public List<Equipamento> buscarEquipamentos() {
        return new ArrayList<>();
    }

    public Equipamento deletaEquipamento() {
        Equipamento eaquipamentoExluido = new Equipamento();
        System.out.println("Realiza e exclusão do equipamento cadastrado.");
        return eaquipamentoExluido;
    }
 
    public void alteraEquipamento() {
        System.out.println("Altera equipamento já cadastrado. ");
    }

    @Override
    public String toString() {
        return "Equipamento{" + "idCadastroEquipamento=" + idCadastroEquipamento + ", nomeEquipamento=" + nomeEquipamento + ", numeroDeSerie=" + numeroDeSerie + ", fabricanteEquipamento=" + fabricanteEquipamento + ", valorBaseHora=" + valorBaseHora + '}';
    }
    
}
