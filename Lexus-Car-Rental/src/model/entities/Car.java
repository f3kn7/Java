package model.entities;

import java.io.Serializable;
import model.enums.car.Category;
import model.enums.car.NumberDoors;
import model.enums.car.NumberPassengers;
import model.enums.car.Traction;
import model.enums.car.TransmissionType;
import model.enums.car.TrunkCapacity;
import model.enums.car.TypeFuel;

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
    private Category categoria;
    private String ano;
    private NumberPassengers qntPassageiros;
    private NumberDoors qntPortas;
    private TrunkCapacity capPortaMalas;
    private String motor;
    private String potencia;
    private Traction tracao;
    private TransmissionType transmissao;
    private TypeFuel tipoCombustivel;
    private String renavam;
    private String codChassi;
    private String placa;
    private double km;
    private double valorAluguel;
    private String observacoes;

    //Default constructor
    public Car() {
    }

    //Constructor overload
    public Car(long id, String dataCadastroCarro, String marca, String modelo, Category categoria, String ano, NumberPassengers qntPassageiros, NumberDoors qntPortas,
            TrunkCapacity capPortaMalas, String motor, String potencia, Traction tracao, TransmissionType transmissao, TypeFuel tipoCombustivel, String renavam,
            String codChassi, String placa, double km, double valorAluguel, String observacoes) {

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
        this.tracao = tracao;
        this.transmissao = transmissao;
        this.tipoCombustivel = tipoCombustivel;
        this.renavam = renavam;
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

    public Category getCategoria() {
        return categoria;
    }

    public void setCategoria(Category categoria) {
        this.categoria = categoria;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public NumberPassengers getQntPassageiros() {
        return qntPassageiros;
    }

    public void setQntPassageiros(NumberPassengers qntPassageiros) {
        this.qntPassageiros = qntPassageiros;
    }

    public NumberDoors getQntPortas() {
        return qntPortas;
    }

    public void setQntPortas(NumberDoors qntPortas) {
        this.qntPortas = qntPortas;
    }

    public TrunkCapacity getCapPortaMalas() {
        return capPortaMalas;
    }

    public void setCapPortaMalas(TrunkCapacity capPortaMalas) {
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

    public Traction getTracao() {
        return tracao;
    }

    public void setTracao(Traction tracao) {
        this.tracao = tracao;
    }

    public TransmissionType getTransmissao() {
        return transmissao;
    }

    public void setTransmissao(TransmissionType transmissao) {
        this.transmissao = transmissao;
    }

    public TypeFuel getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(TypeFuel tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
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
        int hash = 3;
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
        
        sb.append("CAR{");
        sb.append("\nid = ").append(id);
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
        sb.append(",\n tracao = ").append(tracao);
        sb.append(",\n transmissao = ").append(transmissao);
        sb.append(",\n tipoCombustivel = ").append(tipoCombustivel);
        sb.append(",\n renavam = ").append(renavam);
        sb.append(",\n codChassi = ").append(codChassi);
        sb.append(",\n placa = ").append(placa);
        sb.append(",\n km = ").append(km);
        sb.append(",\n valorAluguel = ").append(valorAluguel);
        sb.append(",\n observacoes = ").append(observacoes);
        sb.append('}');
        
        return sb.toString();
    }

}
