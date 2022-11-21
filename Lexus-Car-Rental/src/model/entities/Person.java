package model.entities;

import java.io.Serializable;
import model.enums.person.Gender;

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
    private String unEstadoFed;
    private String pais;

    //Default Constructor
    public Person() {
    }

    //Constructor Overload
   
    
    //Get and Set Methods
    

    //Hash and Equals | comparison by content and not by pointers


    //toString
    

}
