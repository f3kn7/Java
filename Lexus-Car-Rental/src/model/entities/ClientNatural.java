package model.entities;

import java.util.Objects;

/**
 *
 * @author Felipe Kellermann
 */
public class ClientNatural extends Person {

    private String sexo;
    private String dataNascimento;
    private String rg;
    private String cpf;
    private String cnh;

    public ClientNatural() {
    }
    
    //Constructor Overload
    public ClientNatural(String sexo, String dataNascimento, String rg, String cpf, String cnh, Integer idPessoa, String dataCadastro, String nome, String telefoneFixo, String celular, String whatsapp, String email, String cep, String rua, String numeroPredioCond, String numeroResidencia, String bairro, String cidade, String Estado, String pais, String observacao) {
        super(idPessoa, dataCadastro, nome, telefoneFixo, celular, whatsapp, email, cep, rua, numeroPredioCond, numeroResidencia, bairro, cidade, Estado, pais, observacao);
        this.sexo = sexo;       
        this.dataNascimento = dataNascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.cnh = cnh;
    }
    
     //Get and Set Methods
    public String getSexo() {    
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnh() {
        return cnh;
    }
   
    public void setCnh(String cnh) {    
        this.cnh = cnh;
    }

    //Hash and Equals | comparison by content (not by pointers)
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.getIdPessoa());
        hash = 29 * hash + Objects.hashCode(this.getNome());
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
        final ClientNatural other = (ClientNatural) obj;
        if (!Objects.equals(this.getNome(), other.getNome())) {
            return false;
        }
        return Objects.equals(this.getIdPessoa(), other.getIdPessoa());
    }

    //toString mehtod
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("PERSON{");
        sb.append("\nid = ").append(getIdPessoa());
        sb.append(",\n dataCadastro = ").append(getDataCadastro());
        sb.append(",\n nome = ").append(getNome());
        sb.append(",\n telefoneFixo = ").append(getTelefoneFixo());
        sb.append(",\n celular = ").append(getCelular());
        sb.append(",\n whatsapp = ").append(getWhatsapp());
        sb.append(",\n email = ").append(getEmail());
        sb.append(",\n cep = ").append(getCep());
        sb.append(",\n rua = ").append(getRua());
        sb.append(",\n numeroPredioCond = ").append(getNumeroPredioCond());
        sb.append(",\n numeroResidencia = ").append(getNumeroResidencia());
        sb.append(",\n bairro = ").append(getBairro());
        sb.append(",\n cidade = ").append(getCidade());
        sb.append(",\n Estado = ").append(getEstado());
        sb.append(",\n pais = ").append(getPais());
        sb.append(",\n observacao = ").append(getObservacao());
        sb.append('}');     

        sb.append("ClientNaturalPerson{");
        sb.append("\nsexo = ").append(sexo);
        sb.append(",\n dataNascimento = ").append(dataNascimento);
        sb.append(",\n rg = ").append(rg);
        sb.append(",\n cpf = ").append(cpf);
        sb.append(",\n cnh = ").append(cnh);
        sb.append('}');

        return sb.toString();
    }

    public String toStringNaturalClient() {

        return this.getNome();

    }

}
