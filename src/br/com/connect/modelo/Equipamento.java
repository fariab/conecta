package br.com.connect.modelo;

public class Equipamento {

    private Integer idCadastroEquipamento;
    private String nomeEquipamento;
    private Integer numeroDeSerie;
    private String fabricanteEquipamento;
    private Float valorBaseHora;

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
    
    
    public void cadastroCliente(){
        System.out.println("Cadastro de cliente no banco de dados principal.");  
    }  
    
    

}
