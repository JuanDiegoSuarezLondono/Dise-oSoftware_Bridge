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
public class ElaborarRavioli extends ElaborarPasta{
    private String complemento = "alverjas";
    public ElaborarRavioli( IElaborar implementador )
    {
        this.setImplementador( implementador );
    }
    @Override
     public void obtener()
    {
        System.out.println("Preparando raviolis con "+complemento+"...");
         this.getImplementador().procesar();
    }    
}
