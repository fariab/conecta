package br.com.connect.modelo;

import java.util.ArrayList;
import java.util.List;

public class Modelo {
    private String nome;
    private String descricao;

public List<Modelo> consultarModelo() {
            return new ArrayList<>();
    }

public void cadastrarEquip(){
    
}

public void removerEquip(){
    
}

public void consultarEquip(){
    
}

public void alterarEquip(){
    
}

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


}
