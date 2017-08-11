/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author Mauricio Capua
 */
public class Chairs {

    private int Numero;
    private boolean Assento = false;

    public Chairs() {
    }

    public Chairs(int Numero) {
        this.Numero = Numero;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public boolean getAssento() {
        return Assento;
    }

    public void setAssento(boolean Assento) {
        this.Assento = Assento;
    }

}
