/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import negocio.*;

/**
 *
 * @author Mauricio Capua
 */
public class ThreadExecute {

    public static void main(String[] args) {
        Barber_Shop barbeiro = new Barber_Shop();
        Thread threadBarbeiro = new Thread(barbeiro);
        threadBarbeiro.start();
    }
}
