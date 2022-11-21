
package model.entities;

import java.io.Serializable;

/**
 *
 * @author Felipe Kellermann 
 */
public class Car implements Serializable {
    
    //Convert object to bytes
    private static final long serialVersionUID = 1L;
    
    //Attributes
    private long id;
    private String dataCadastroCarro;
    private String marca;
    private String modelo;
    private String categoria;
    private String ano;
    private String qntPassageiros;
    private String qntPortas;
    private String capPortaMalas;
    private String motor;
    private String potencia;
    private String transmissao;
    private String tipoCombustivel;
    private String codChassi;
    private String placa;
    private double km;
    private double valorAluguel;
    private String observacoes;
    
    //Default constructor
    public Car() {
    }
    
    //Constructor overload
    public Car(long id, String dataCadastroCarro, String marca, String modelo, String categoria, String ano, String qntPassageiros, String qntPortas, String capPortaMalas, 
                String motor, String potencia, String transmissao, String tipoCombustivel, String codChassi, String placa, double km, double valorAluguel, String observacoes) {
        
        this.id = id;
        this.dataCadastroCarro = dataCadastroCarro;
        this.marca = marca;
        this.modelo = modelo;
        this.categoria = categoria;
        this.ano = ano;
        this.qntPassageiros = qntPassageiros;
        this.qntPortas = qntPortas;
        this.capPortaMalas = capPortaMalas;
        this.motor = motor;
        this.potencia = potencia;
        this.transmissao = transmissao;
        this.tipoCombustivel = tipoCombustivel;
        this.codChassi = codChassi;
        this.placa = placa;
        this.km = km;
        this.valorAluguel = valorAluguel;
        this.observacoes = observacoes;
    }
    
    //Get and Set Methods
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDataCadastroCarro() {
        return dataCadastroCarro;
    }

    public void setDataCadastroCarro(String dataCadastroCarro) {
        this.dataCadastroCarro = dataCadastroCarro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getQntPassageiros() {
        return qntPassageiros;
    }

    public void setQntPassageiros(String qntPassageiros) {
        this.qntPassageiros = qntPassageiros;
    }

    public String getQntPortas() {
        return qntPortas;
    }

    public void setQntPortas(String qntPortas) {
        this.qntPortas = qntPortas;
    }

    public String getCapPortaMalas() {
        return capPortaMalas;
    }

    public void setCapPortaMalas(String capPortaMalas) {
        this.capPortaMalas = capPortaMalas;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public String getTransmissao() {
        return transmissao;
    }

    public void setTransmissao(String transmissao) {
        this.transmissao = transmissao;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getCodChassi() {
        return codChassi;
    }

    public void setCodChassi(String codChassi) {
        this.codChassi = codChassi;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
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
        final Car other = (Car) obj;
        return this.id == other.id;
    }
    
    //toString

    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
        
        sb.append("CAR\n{");
        sb.append("id = ").append(id);
        sb.append(",\n dataCadastroCarro = ").append(dataCadastroCarro);
        sb.append(",\n marca = ").append(marca);
        sb.append(",\n modelo = ").append(modelo);
        sb.append(",\n categoria = ").append(categoria);
        sb.append(",\n ano = ").append(ano);
        sb.append(",\n qntPassageiros = ").append(qntPassageiros);
        sb.append(",\n qntPortas = ").append(qntPortas);
        sb.append(",\n capPortaMalas = ").append(capPortaMalas);
        sb.append(",\n motor = ").append(motor);
        sb.append(",\n potencia = ").append(potencia);
        sb.append(",\n transmissao = ").append(transmissao);
        sb.append(",\n tipoCombustivel = ").append(tipoCombustivel);
        sb.append(",\n nrChassi = ").append(codChassi);
        sb.append(",\n placa = ").append(placa);
        sb.append(",\n km = ").append(km);
        sb.append(",\n valorAluguel = ").append(valorAluguel);
        sb.append(",\n observacoes = ").append(observacoes);
        sb.append('}');
        
        return sb.toString();
    }
        
}
