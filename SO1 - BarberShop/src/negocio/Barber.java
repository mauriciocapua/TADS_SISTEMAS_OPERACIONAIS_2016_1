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
public class Barber {

    private String Nome;
    private boolean Estado;

    public Barber(String Nome) {
        this.Nome = Nome;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    public String RetornoEstado() {
        String trabalho;
        if (isEstado() == true) {
            trabalho = "Barbeiro: " + Nome + " está trabalhando";
        } else {
            trabalho = "Não há clientes. O Barbeiro: " + Nome + " está dormindo";
        }
        return trabalho;
    }

    public void Inicio() {
        System.out.println("O barbeiro " + Nome + " chegou ao trabalho.");
    }

}
