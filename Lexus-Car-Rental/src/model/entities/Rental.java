package model.entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Felipe Kellermann
 */
public class Rental {

    private Car carro;
    private ClientNatural pessoaFisica;

    private Integer idAluguel;
    private Date dataRetirada;
    private Date horaRetirada;
    private Date dataDevolucao;
    private Date horaDevolucao;
    private double valorTotal;

    public Rental(Car carro, ClientNatural pessoaFisica, Integer idAluguel, String dataRetirada, String horaRetirada, String dataDevolucao, String horaDevolucao, double valorTotal) {
        try {
            this.carro = carro;
            this.pessoaFisica = pessoaFisica;
            this.idAluguel = idAluguel;
            this.dataRetirada = new SimpleDateFormat("dd/MM/yyyy").parse(dataRetirada);
            this.horaRetirada = new SimpleDateFormat("HH:mm").parse(horaRetirada);
            this.dataDevolucao = new SimpleDateFormat("dd/MM/yyyy").parse(dataDevolucao);
            this.horaDevolucao = new SimpleDateFormat("HH:mm").parse(horaDevolucao);
            this.valorTotal = valorTotal;

        } catch (ParseException ex) {
            Logger.getLogger(Rental.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Car getCarro() {
        return carro;
    }

    public void setCarro(Car carro) {
        this.carro = carro;
    }

    public ClientNatural getPessoaFisica() {
        return pessoaFisica;
    }

    public void setPessoaFisica(ClientNatural pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
    }

    public Integer getIdAluguel() {
        return idAluguel;
    }

    public void setIdAluguel(Integer idAluguel) {
        this.idAluguel = idAluguel;
    }

    public Date getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(Date dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public Date getHoraRetirada() {
        return horaRetirada;
    }

    public void setHoraRetirada(Date horaRetirada) {
        this.horaRetirada = horaRetirada;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Date getHoraDevolucao() {
        return horaDevolucao;
    }

    public void setHoraDevolucao(Date horaDevolucao) {
        this.horaDevolucao = horaDevolucao;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    
    
}
