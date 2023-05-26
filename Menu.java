/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compra4;

import java.util.Scanner;

/**
 *
 * @author Geo
 */
public class Menu {
    
    int selection;
    String lugardeVotacion;
    private Scanner input = new Scanner(System.in);
    
    public void menu(){
        
        System.out.println("-- Bienvenido por favor selecione su opcion--");
        System.out.println(
        "Nuestro menu: \n" +
        "  1) Consultar punto de votacion \n" +
        "  2) Consultar Puntos de votacion con horario extendido \n" 
    );
        
        int selection = input.nextInt();
           input.nextLine(); 
           
           
        switch (selection) {
            case 1:
              consultarPuntodeVotacion();
              break;
            case 2:
              consultarPuntosFestivos();
              break;
            default:
              System.out.println("Invalid selection.");
              break;
            }
    }
    
    void consultarPuntodeVotacion()
    {
        System.out.println ("Por favor introduzca su cedula:"); 
        String cedula = "";
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        cedula = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner
        System.out.println ("El numero de identidad que usted ha ingresado es: \"" + cedula +"\""); 
        
        Registraduria puntodeVotacion = new Registraduria();
        lugardeVotacion = puntodeVotacion.sitiodeVotacion(cedula);
        
        System.out.println("su lugar de votacion es: " + lugardeVotacion);
        
    }
    
       void consultarPuntosFestivos ()
    {
            System.out.println ("Los puntos de votacion con horario extendido son : salitre el greco y aguascalientes"); 
    }
    
    
}
