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
public class Livro {
    private int codigo;
    private String titulo;
    private String fornecedor;
    private int estoque;
    private float valor;
    private String data;

    public Livro(int codigo, String titulo, String fornecedor, int estoque, float valor, String data) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.fornecedor = fornecedor;
        this.estoque = estoque;
        this.valor = valor;
        this.data = data;
    }

    public Livro() {
    }

    @Override
    public String toString()
    {
        String str = "CODIGO: " + codigo;
        str += "\nTITULO: " + titulo;
        str += "\nEDITORA: " + fornecedor;
        str += "\nDATA DE PUBLICAÇÃO: " + data;
        str += "\n----------------------------------------";
        str += "\nVALOR UNITÁRIO: " + valor;
        str += "\n----------------------------------------";
        str += "\nQUANTIDADE EM ESTOQUE: " + estoque;
        str += "\n****************************************************\n\n";   
               
        return str;        
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    
    
}
