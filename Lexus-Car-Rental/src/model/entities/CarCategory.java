package model.entities;

import java.util.Objects;

/**
 *
 * @author Felipe Kellermann
 */
public class CarCategory {

    //Attributes
    private Integer idCategoria;
    private String nome;

    //Default Constructor
    public CarCategory() {
    }

    //Overload Constructor id
    public CarCategory(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    //Overload Constructor name
    public CarCategory(String nome) {
        this.nome = nome;
    }

    //Overload Constructor all
    public CarCategory(Integer idCategoria, String nome) {
        this.idCategoria = idCategoria;
        this.nome = nome;
    }

    //Get and Set methods
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    //Hash and Equals | comparison by content (not by pointers)
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.idCategoria);
        hash = 89 * hash + Objects.hashCode(this.nome);
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
        final CarCategory other = (CarCategory) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return Objects.equals(this.idCategoria, other.idCategoria);
    }

    //toString method
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CarCategory{");
        sb.append("\nidCategoria = ").append(idCategoria);
        sb.append(",\n nome = ").append(nome);
        sb.append('}');
        return sb.toString();
    }

}
