/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mas;

import Elaborar.IElaborar;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author suare
 */
public class Cocinar implements IElaborar{
    private int temperatura;
    private int tiempo;
    public Cocinar(int myTemperatura, int myTiempo){
        temperatura = myTemperatura;
        tiempo = myTiempo;        
    }
    @Override
     public void procesar()
    {
        System.out.println("Se esta cocinando...espere "+tiempo+" segundos");
        try {
            TimeUnit.SECONDS.sleep(tiempo);
        } catch (InterruptedException ex) {
            Logger.getLogger(Cocinar.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("\tAlimento cocinado");
    }    
}
