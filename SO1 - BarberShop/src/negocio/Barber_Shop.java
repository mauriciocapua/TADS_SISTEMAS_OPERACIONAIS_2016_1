/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mauricio Capua
 */
public class Barber_Shop implements Runnable {

    Creator bar = new Creator();
    private Semaphore semaforo;

    public void GeraClientes() {

        for (int i = 0; i <= new Random().nextInt(2); i++) {
            Customers a = new Customers();
            if (CadeiraDisponivel() > -1) {

                bar.getChairs().get(CadeiraDisponivel()).setAssento(true);
                bar.getCustomers().add(a);

            } else {
                MostraClientes();
                System.out.println("Não há cadeiras livres, o cliente " + a.getNome() + " foi embora!");
                System.out.println("=====================");

            }
        }
    }

    public int CadeiraDisponivel() {
        int numero = 0;

        for (int i = 0; i < bar.getChairs().size(); i++) {
            if (bar.getChairs().get(i).getAssento() == false) {
                numero = i;
                break;
            } else {
                numero = -1;
            }
        }

        return numero;
    }

    public void LivraCadeira() {
        for (int i = 0; i < bar.getChairs().size(); i++) {
            if (bar.getChairs().get(i).getAssento() == true) {
                bar.getChairs().get(i).setAssento(false);
                break;
            }
        }

    }

    public void MostraClientes() {
        String clientes = "";
        for (int i = 0; i < bar.getCustomers().size(); i++) {
            clientes = clientes + " " + bar.getCustomers().get(i).getNome();
        }
        System.out.println("Clientes esperando: " + clientes);
    }

    public void BarberAction() throws InterruptedException {

        if (bar.getCustomers().size() > 0) {

            int clienteatendido = -1;
            for (int i = 0; i < bar.getCustomers().size(); i++) {
                if (bar.getCustomers().get(i) != null) {
                    clienteatendido = i;
                    break;
                }
            }
            bar.getBarber().setEstado(true);
            System.out.println(bar.getBarber().RetornoEstado());

            System.out.println("Barbeiro: " + bar.getBarber().getNome() + " cortou o cabelo do cliente: " + bar.getCustomers().get(clienteatendido).getNome());

            LivraCadeira();
            bar.getCustomers().remove(clienteatendido);
            System.out.println("======================");

            Thread.sleep(2000);
        } else {
            bar.getBarber().setEstado(false);
            System.out.println(bar.getBarber().RetornoEstado());
            System.out.println("======================");
            Thread.sleep(4000);
            try {

                semaforo.acquire();

            } catch (Exception e) {
                GeraClientes();
                MostraClientes();
            } finally {
                semaforo.release();
            }
        }
    }

    @Override
    public void run() {
        int count = 0;
        bar.getBarber().Inicio();
        while (count < 10) {

            try {
                BarberAction();
                MostraClientes();
                count++;
            } catch (NullPointerException ex) {
            } catch (InterruptedException ex) {
            }
        }
    }
}
