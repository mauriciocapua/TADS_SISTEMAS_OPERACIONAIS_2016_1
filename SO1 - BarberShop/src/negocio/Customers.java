/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.Random;

/**
 *
 * @author Mauricio Capua
 */
public class Customers {

    String[] nomes = {"John", "Arthur", "Ed", "Sam", "Dexter"};
    private final String nome;

    public Customers() {
        this.nome = nomes[new Random().nextInt(nomes.length)];
    }

    public String getNome() {
        return nome;
    }

}
