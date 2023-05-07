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
public abstract class ElaborarPasta {
    private IElaborar implementador;
    private String nombre;
     public IElaborar getImplementador()
    {
        return this.implementador;
    }
    public void setImplementador( IElaborar implementador )
    {
        this.implementador = implementador;
    }
    public abstract void obtener();    
}
