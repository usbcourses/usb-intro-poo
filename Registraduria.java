/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compra4;

/**
 *
 * @author Geo
 */
public class Registraduria {
    
    
    String  puntodeVotacion;
    
    String sitiodeVotacion( String cedula)
    {
        
        if (cedula.startsWith("1"))
                
                {
                   puntodeVotacion= "el salitre";
                   
                }
        else {
            puntodeVotacion= "Soacha";
        }

        return puntodeVotacion;
    }
    
    
}
