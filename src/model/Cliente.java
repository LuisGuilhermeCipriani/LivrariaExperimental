/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Giuliano
 */
public class Cliente {
    private String cpf;
    private String nome;
    private String telefone;
    private String email;
    private String estadoCivil;
    private Endereco endereco;

    public Cliente(String cpf, String nome, String telefone, String email, String estadoCivil, Endereco endereco) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.estadoCivil = estadoCivil;
        this.endereco = endereco;
    }

    public Cliente() {
        endereco = new Endereco();
    }

    @Override
    public String toString()
    {
        String str = "CPF: " + cpf;
        str += "\nNOME: " + nome;
        str += "\nEMAIL: " + email;
        str += "\nTELEFONE: " + telefone;
        str += "\nESTADO CIVIL: " + estadoCivil;
        str += "\n---------- ENDERREÇO ----------- ";
        str += "\nLOGRADOURO: " + endereco.getLogradouro();
        str += "\nCIDADE: " + endereco.getCidade();
        str += "\nESTADO: " + endereco.getEstado();
        str += "\nCEP: " + endereco.getCep();
               
        return str;
        
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
}
