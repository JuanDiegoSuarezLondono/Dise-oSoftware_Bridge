/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elaborar;

/**
 *
 * @author suare
 */
public class ElaborarLasagna extends ElaborarPasta{
    private String salsa = "bechamel";
    public ElaborarLasagna( IElaborar implementador )
    {
        this.setImplementador( implementador );
    }
    @Override
     public void obtener()
    {
        System.out.println("Preparando lasagna con salsa "+salsa+"...");
         this.getImplementador().procesar();
    }    
}
