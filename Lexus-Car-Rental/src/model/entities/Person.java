package model.entities;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Felipe Kellermann
 */
public abstract class Person implements Serializable {

    //Transformar o objeto em bytes para envio do objeto pela rede (JSON, XML ...), ou salvá-lo em um arquivo ou em um banco de dados para ser recuperado posteriormente.
    //Convert object to bytes
    private static final long serialVersionUID = 1L;

    //Attributes 
    private Integer idPessoa;
    private Date dataCadastro;
    private String nome;
    private String telefoneFixo;
    private String celular;
    private String whatsapp;
    private String email;
    private String cep;
    private String rua;
    private String numeroPredioCond;
    private String numeroResidencia;
    private String bairro;
    private String cidade;
    private String Estado;
    private String pais;
    private String observacao;

    //Default Constructor 
    public Person() {
    }

    //Constructor Overload id
    public Person(Integer idPessoa) {
        this.idPessoa = idPessoa;
    }

    //Contructor Overload name
    public Person(String nome) {
        this.nome = nome;
    }

    //Constructor Overload all
    public Person(Integer idPessoa, String dataCadastro, String nome, String telefoneFixo, String celular, String whatsapp, String email, String cep, String rua,
            String numeroPredioCond, String numeroResidencia, String bairro, String cidade, String Estado, String pais, String observacao) {
        this.idPessoa = idPessoa;
        try {
            this.dataCadastro = new SimpleDateFormat("dd/MM/yyyy").parse(dataCadastro);
        } catch (ParseException ex) {
            Logger.getLogger(Person.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.nome = nome;
        this.telefoneFixo = telefoneFixo;
        this.celular = celular;
        this.whatsapp = whatsapp;
        this.email = email;
        this.cep = cep;
        this.rua = rua;
        this.numeroPredioCond = numeroPredioCond;
        this.numeroResidencia = numeroResidencia;
        this.bairro = bairro;
        this.cidade = cidade;
        this.Estado = Estado;
        this.pais = pais;
        this.observacao = observacao;
    }

    //Get and Set Methods 
    public Integer getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Integer idPessoa) {
        this.idPessoa = idPessoa;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefoneFixo() {
        return telefoneFixo;
    }

    public void setTelefoneFixo(String telefoneFixo) {
        this.telefoneFixo = telefoneFixo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumeroPredioCond() {
        return numeroPredioCond;
    }

    public void setNumeroPredioCond(String numeroPredioCond) {
        this.numeroPredioCond = numeroPredioCond;
    }

    public String getNumeroResidencia() {
        return numeroResidencia;
    }

    public void setNumeroResidencia(String numeroResidencia) {
        this.numeroResidencia = numeroResidencia;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    //Hash and Equals | comparison by content (not by pointers) 
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.idPessoa);
        hash = 71 * hash + Objects.hashCode(this.nome);
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
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return Objects.equals(this.idPessoa, other.idPessoa);
    }

    //toString     
    public String toStringPerson() {

        StringBuilder sb = new StringBuilder();

        sb.append("PERSON{");
        sb.append("\nid = ").append(idPessoa);
        sb.append(",\n dataCadastro = ").append(dataCadastro);
        sb.append(",\n nome = ").append(nome);
        sb.append(",\n telefoneFixo = ").append(telefoneFixo);
        sb.append(",\n celular = ").append(celular);
        sb.append(",\n whatsapp = ").append(whatsapp);
        sb.append(",\n email = ").append(email);
        sb.append(",\n cep = ").append(cep);
        sb.append(",\n rua = ").append(rua);
        sb.append(",\n numeroPredioCond = ").append(numeroPredioCond);
        sb.append(",\n numeroResidencia = ").append(numeroResidencia);
        sb.append(",\n bairro = ").append(bairro);
        sb.append(",\n cidade = ").append(cidade);
        sb.append(",\n Estado = ").append(Estado);
        sb.append(",\n pais = ").append(pais);
        sb.append(",\n observacao = ").append(observacao);
        sb.append('}');

        return sb.toString();
    }

}
