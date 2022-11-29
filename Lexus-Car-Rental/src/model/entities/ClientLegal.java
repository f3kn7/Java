package model.entities;

import java.util.Objects;

/**
 *
 * @author Felipe Kellermann
 */
public class ClientLegal extends Person {

    private String cnpj;

    //Default Constructor
    public ClientLegal() {
    }

    //Constructor Overload
    public ClientLegal(String cnpj, Integer idPessoa, String dataCadastro, String nome, String telefoneFixo, String celular, String whatsapp,
            String email, String cep, String rua, String numeroPredioCond, String numeroResidencia, String bairro, String cidade, String Estado, String pais, String observacao) {

        super(idPessoa, dataCadastro, nome, telefoneFixo, celular, whatsapp, email, cep, rua, numeroPredioCond, numeroResidencia, bairro, cidade, Estado, pais, observacao);
        this.cnpj = cnpj;
    }

    //Get and Set Methods
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    //Hash and Equals | comparison by content (not by pointers)
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.getIdPessoa());
        hash = 71 * hash + Objects.hashCode(this.getNome());
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
        final Person other = (Person) obj;
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

        sb.append("LegalPerson{");
        sb.append("\ncnpj = ").append(cnpj);

        sb.append('}');

        return sb.toString();
    }

    public String toStringLegalClient() {

        return this.getNome();

    }

}
