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

    //Attributes
    private Integer idAluguel;
    private Date dataRetirada;
    private Date dataDevolucao;
    private double valorTotal;

    private Car carro;
    private ClientNatural pessoaFisica;

    //Default constructor
    public Rental() {
    }

    //Overload Constructor id
    public Rental(Integer idAluguel) {
        this.idAluguel = idAluguel;
    }

    //Overload Constructor all
    public Rental(Car carro, ClientNatural pessoaFisica, Integer idAluguel, String dataRetirada, String dataDevolucao, double valorTotal) {
        try {
            this.carro = carro;
            this.pessoaFisica = pessoaFisica;
            this.idAluguel = idAluguel;
            this.dataRetirada = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(dataRetirada);
            this.dataDevolucao = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(dataDevolucao);
            this.valorTotal = valorTotal;

        } catch (ParseException ex) {
            Logger.getLogger(Rental.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //get and set methods
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

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

}
