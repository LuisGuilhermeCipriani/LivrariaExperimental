/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author alunoces
 */
public class Venda {
    private static int numero = 0;
    private Cliente cliente;
    private List<Item> lista;
    private float valorTotal;
    private Date dataVenda;

    public Venda() {
        numero++;
        lista = new ArrayList<Item>();
        dataVenda = new Date();
    }
    
    public void inserirItem(Item item)
    {
        lista.add(item);
    }
    
    public Item buscarItem(int codigo)
    {
        Item it = null;
        for(Item item : lista)
        {
            if(item.getLivro().getCodigo() == codigo)
                it = item;
        }
        
        return it;
    }
    
    public void removerItem(int codigo)
    {
        Item item = buscarItem(codigo);
        if(item != null)
        {
            lista.remove(item);
        }
    }
    
    public float calcularValorTotal(){
        float soma = 0;
        for(Item item : lista){
            soma += item.getValorItem();
        }
        return soma;
    }
    
    @Override
    public String toString(){
        String str = "";
        str += cliente.toString();
        str += "\n----------------------------\n";
        for(Item item : lista){
            str += item.toString();
        }
        SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy");
        str += "\nData da Venda = "+ fm.format(dataVenda);
        str += "\nValor Total = " + valorTotal;
        return str;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        Venda.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Item> getLista() {
        return lista;
    }

    public void setLista(List<Item> lista) {
        this.lista = lista;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }
}
