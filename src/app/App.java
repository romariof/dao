/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import dao.Dao;
import dao.PessoaDaoArrayList;
import dao.PessoaDaoVetor;
import modelo.Pessoa;

/**
 *
 * @author Your Name <your.name at your.org>
 */
public class App {
    //psvm + tab
    public static void main(String[] args) {
        
        Pessoa joao = new Pessoa("Joao", "Silva", 20);
        Pessoa pedro = new Pessoa("Pedro", "Silva", 21);
        Pessoa jose = new Pessoa("Jose", "Silva", 22);
        
        Dao dao = new PessoaDaoVetor(3);
        dao.adicionar(joao);
        dao.adicionar(jose);
        dao.adicionar(pedro);
        
        dao.listarTudo();
        
        System.out.println("\n\n -----Vamos remover");
        dao.remover(jose);
        dao.listarTudo();
    }
}
