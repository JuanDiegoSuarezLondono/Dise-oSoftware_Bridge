/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridge;

import Elaborar.*;
import Mas.*;

/**
 *
 * @author suare
 */
public class Bridge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        ElaborarPasta ravioli = new ElaborarRavioli( new Cocinar(70,5) );
        ravioli.obtener();
        ravioli.setImplementador( new Envasar() );
        ravioli.obtener();
        System.out.println("-------------");
        ElaborarPasta lasagna = new ElaborarLasagna( new Cocinar(100,7) );
        lasagna.obtener();
        lasagna.setImplementador( new Envasar() );
        lasagna.obtener();
    }    
}
