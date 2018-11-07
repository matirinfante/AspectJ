/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProductorConsumidor;

/**
 *
 * @author Matias
 */
public class testProductorConsumidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Buffer bf = new Buffer();
        Productor[] productores = new Productor[3];
        Consumidor[] consumidores = new Consumidor[4];

        for (int i = 0; i < consumidores.length; i++) {
            consumidores[i] = new Consumidor("Consumidor "+i,bf);
        }

        for (int i = 0; i < productores.length; i++) {
            productores[i] = new Productor("Productor "+i,bf);
        }

        for (int i = 0; i < consumidores.length; i++) {
            consumidores[i].start();
        }
        for (int i = 0; i < productores.length; i++) {
            productores[i].start();
        }

    }

}