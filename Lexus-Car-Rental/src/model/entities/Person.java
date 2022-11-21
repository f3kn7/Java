package model.entities;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Felipe Kellermann
 */
public abstract class Person implements Serializable {

    //Transformar o objeto em bytes para envio do objeto pela rede (JSON, XML ...), ou salvá-lo em um arquivo ou em um banco de dados para ser recuperado posteriormente.
    //Convert object to bytes
    private static final long serialVersionUID = 1L;

    //Attributes
    private long id;
    private String dataCadastro;
    private String tipoPessoa;
    private String sexo;
    private String nome;
    private String dataNasc;
    private String rg;
    private String cpf;
    private String cnpj;
    private String cnh;
    private String categoriaCnh;
    private String telefoneResidencial;
    private String telefoneComercial;
    private String celular;
    private String whatsapp;
    private String email;
    private String cep;
    private String rua;
    private String numeroPredioCond;
    private String numeroResidencia;
    private String bairro;
    private String cidade;
    private String unEstadoFed;
    private String pais;

    //Default Constructor
    public Person() {
    }

    //Constructor Overload

    public Person(long id, String dataCadastro, String tipoPessoa, String sexo, String nome, String dataNasc, String rg, String cpf, String cnpj, String cnh, 
                   String categoriaCnh, String telefoneResidencial, String telefoneComercial, String celular, String whatsapp, String email, String cep, String rua, 
                   String numeroPredioCond, String numeroResidencia, String bairro, String cidade, String unEstadoFed, String pais) {
        
        this.id = id;
        this.dataCadastro = dataCadastro;
        this.tipoPessoa = tipoPessoa;
        this.sexo = sexo;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.rg = rg;
        this.cpf = cpf;
        this.cnpj = cnpj;
        this.cnh = cnh;
        this.categoriaCnh = categoriaCnh;
        this.telefoneResidencial = telefoneResidencial;
        this.telefoneComercial = telefoneComercial;
        this.celular = celular;
        this.whatsapp = whatsapp;
        this.email = email;
        this.cep = cep;
        this.rua = rua;
        this.numeroPredioCond = numeroPredioCond;
        this.numeroResidencia = numeroResidencia;
        this.bairro = bairro;
        this.cidade = cidade;
        this.unEstadoFed = unEstadoFed;
        this.pais = pais;
    }    

    //Get and Set Methods
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getCategoriaCnh() {
        return categoriaCnh;
    }

    public void setCategoriaCnh(String categoriaCnh) {
        this.categoriaCnh = categoriaCnh;
    }

    public String getTelefoneResidencial() {
        return telefoneResidencial;
    }

    public void setTelefoneResidencial(String telefoneResidencial) {
        this.telefoneResidencial = telefoneResidencial;
    }

    public String getTelefoneComercial() {
        return telefoneComercial;
    }

    public void setTelefoneComercial(String telefoneComercial) {
        this.telefoneComercial = telefoneComercial;
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

    public String getUfEstadoFed() {
        return unEstadoFed;
    }

    public void setUfEstadoFed(String unEstadoFed) {
        this.unEstadoFed = unEstadoFed;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    //Hash and Equals | comparison by content and not by pointers
    @Override
    public int hashCode() {
        int hash = 7;
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
        return this.id == other.id;
    }

    //toString
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("PERSON\n{");
        sb.append("id = ").append(id);
        sb.append(",\n dataCadastro = ").append(dataCadastro);
        sb.append(",\n tipoPessoa = ").append(tipoPessoa);
        sb.append(",\n sexo = ").append(sexo);
        sb.append(",\n nome = ").append(nome);
        sb.append(",\n dataNasc = ").append(dataNasc);
        sb.append(",\n rg = ").append(rg);
        sb.append(",\n cpf = ").append(cpf);
        sb.append(",\n cnpj = ").append(cnpj);
        sb.append(",\n cnh = ").append(cnh);
        sb.append(",\n categoriaCnh = ").append(categoriaCnh);
        sb.append(",\n telefoneResidencial = ").append(telefoneResidencial);
        sb.append(",\n telefoneComercial = ").append(telefoneComercial);
        sb.append(",\n celular = ").append(celular);
        sb.append(",\n whatsapp = ").append(whatsapp);
        sb.append(",\n email = ").append(email);
        sb.append(",\n cep = ").append(cep);
        sb.append(",\n rua = ").append(rua);
        sb.append(",\n numeroPredioCond = ").append(numeroPredioCond);
        sb.append(",\n numeroResidencia = ").append(numeroResidencia);
        sb.append(",\n bairro = ").append(bairro);
        sb.append(",\n cidade = ").append(cidade);
        sb.append(",\n ufEstadoFed = ").append(unEstadoFed);
        sb.append(",\n pais = ").append(pais);
        sb.append('}');

        return sb.toString();
    }

}
