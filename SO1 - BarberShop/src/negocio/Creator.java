/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Mauricio Capua
 */
public class Creator {

    Barber barber = new Barber("João");
    private ArrayList<Customers> customers = new ArrayList<>();
    private ArrayList<Chairs> chairs = new ArrayList(Arrays.asList(new Chairs(1), new Chairs(2), new Chairs(3), new Chairs(4), new Chairs(5)));

    public Barber getBarber() {
        return barber;
    }

    public ArrayList<Chairs> getChairs() {
        return chairs;
    }

    public void setChairs(ArrayList<Chairs> chairs) {
        this.chairs = chairs;
    }

    /*public void PopulaBarber_Shop() {
        chairs.add(new Chairs(1));
        chairs.add(new Chairs(2));
        chairs.add(new Chairs(3));
        chairs.add(new Chairs(4));
        chairs.add(new Chairs(5));

    }*/
    public ArrayList<Customers> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customers> customers) {
        this.customers = customers;
    }
}
