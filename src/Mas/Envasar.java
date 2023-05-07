/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mas;

import Elaborar.IElaborar;

/**
 *
 * @author suare
 */
public class Envasar implements IElaborar{
    private String tipoDeEnvase = "Plastico";
     public Envasar() {
    }
    @Override
     public void procesar()
    {
        System.out.println("\tAlimento envasado en "+tipoDeEnvase);
    }    
}
