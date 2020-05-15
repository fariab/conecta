
package br.com.connect.pagamento;

import java.util.Objects;

/**
 *
 * @author Lucas Miguel
 */
public class Pagamento {
    private Integer idPagamento;
    private String tipoPagamento;

    public Pagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    
    
    /**
     * @return the idPagamento
     */
    public Integer getIdPagamento() {
        return idPagamento;
    }

    /**
     * @param idPagamento the idPagamento to set
     */
    public void setIdPagamento(Integer idPagamento) {
        this.idPagamento = idPagamento;
    }

    /**
     * @return the tipoPagamento
     */
    public String getTipoPagamento() {
        return tipoPagamento;
    }

    /**
     * @param tipoPagamento the tipoPagamento to set
     */
    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.tipoPagamento);
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
        final Pagamento other = (Pagamento) obj;
        if (!Objects.equals(this.tipoPagamento, other.tipoPagamento)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pagamento{" + "idPagamento=" + idPagamento + ", tipoPagamento=" + tipoPagamento + ", idUsuarioFk=" + '}';
    }
    
    
}
