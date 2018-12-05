/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Cliente;
import model.Livro;

/**
 *
 * @author Giuliano
 */
public class LivroDAO {
    private List<Livro> lista = null;

    public LivroDAO() {
        lista = new ArrayList<Livro>();
    }
    
    public void inserirLivro(Livro livro)
    {
        lista.add(livro);
    }
    
    public Livro buscarLivro(int codigo)
    {
        Livro lv = null;
        for(Livro livro: lista)
        {
            if(livro.getCodigo() == codigo)
                lv = livro;
        }
        
        return lv;
    }
    
    public void removerLivro(int codigo)
    {
        Livro livro = buscarLivro(codigo);
        if(livro != null)
        {
            lista.remove(livro);
        }
    }
    
    public void alterarLivro(int codigo)
    {
        Livro livro = buscarLivro(codigo);
        if(livro != null)
        {
            int pos = lista.indexOf(livro);
            lista.set(pos, livro);
        }
    }
    
    public List<Livro> todosLivros()
    {
        return lista;
    }
    
    
}
