
package model.entities;

import java.util.Objects;

/**
 *
 * @author Felipe Kellermann 
 */
public class Department {
    
    //Attributes
    private Integer id;
    private String nome;    

    //Default Constructor
    public Department() {
    }

    //Constructor Overload
    public Department(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
   
    }
   
    //Get and Set Methods
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Hash and Equals | comparison by content (not by pointers)
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.id);
        hash = 67 * hash + Objects.hashCode(this.nome);
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
        final Department other = (Department) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }    
    
    //toString    
    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
        
        sb.append("DEPARTMENT{");
        sb.append("\nid = ").append(id);
        sb.append(",\n nome = ").append(nome);
        sb.append('}');
        
        return sb.toString();
    }
    
    
}
