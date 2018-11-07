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
public class Buffer {

    MonitorSemaf lleno = new MonitorSemaf(0);
    MonitorSemaf vacio = new MonitorSemaf(5);
    MonitorSemaf mutex = new MonitorSemaf(1);

    public void agregar() {
        vacio.acquireM();
        mutex.acquireM();
        System.out.println("Productor: agrego a la canasta");
        mutex.releaseM();
        lleno.releaseM();
    }

    public void sacar() {
        lleno.acquireM();
        mutex.acquireM();
        System.out.println("Consumidor: saco de la canasta");
        mutex.releaseM();
        vacio.releaseM();
    }
}