package br.com.connect.categoria;

import java.util.Objects;

/**
 *
 * @author Lucas Miguel
 */
public class Categoria {
    private Integer idCategoria;
    private String desCategoria;
    private Integer categoriaUsuario;

    /**
     * @return the idCategoria
     */
    public Integer getIdCategoria() {
        return idCategoria;
    }

    /**
     * @param idCategoria the idCategoria to set
     */
    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    /**
     * @return the desCategoria
     */
    public String getDesCategoria() {
        return desCategoria;
    }

    /**
     * @param desCategoria the desCategoria to set
     */
    public void setDesCategoria(String desCategoria) {
        this.desCategoria = desCategoria;
    }

    /**
     * @return the categoriaUsuario
     */
    public Integer getCategoriaUsuario() {
        return categoriaUsuario;
    }

    /**
     * @param categoriaUsuario the categoriaUsuario to set
     */
    public void setCategoriaUsuario(Integer categoriaUsuario) {
        this.categoriaUsuario = categoriaUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.desCategoria);
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
        final Categoria other = (Categoria) obj;
        if (!Objects.equals(this.desCategoria, other.desCategoria)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Categoria{" + "idCategoria=" + idCategoria + ", desCategoria=" + desCategoria + '}';
    }
    
    
    
}
