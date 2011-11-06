/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Hector
 */
public class NewClass {
    public void crearBaraja(){
       
        List <String> baraja = new ArrayList <String>();
        
    //Generando Baraja Roja! 
    for (int i=0; i<10;i++){  
        baraja.add(i+"R");
    }
     for (int i=1; i<10;i++){  
        baraja.add(i+"R");
    }
      for (int i =0; i<2;i++){
        baraja.add("RI");
        baraja.add("RB");
        baraja.add("RT2");
      }
      
      //Generando Baraja Verde
     for (int i=0; i<10;i++){
        baraja.add(i+"V");
     }
     for (int i=1; i<10;i++){
        baraja.add(i+"V");
     }
     
     for (int i =0; i<2;i++){
        baraja.add("VI");
        baraja.add("VB");
        baraja.add("T2V");
     }
     
     
     
     //Generando Baraja Amarilla
      for (int i=0; i<10;i++){
        baraja.add(i+"AM");
      }
      for (int i=1; i<10;i++){
      baraja.add(i+"AM");
      }
      
      for (int i =0; i<2;i++){
        baraja.add("IA");
        baraja.add("BAM");
        baraja.add("T2AM");
      }
      
      //Generando Baraja Azul
      for (int i=0; i<10;i++){
      baraja.add(i+"A");
      }
      for (int i=1; i<10;i++){
      baraja.add(i+"A");
      }
       for (int i =0; i<2;i++){
        baraja.add("IA");
        baraja.add("BA");
        baraja.add("T2A");
       }
       
       for (int i=0;i<4;i++){
        baraja.add("T4");
        baraja.add("CambColor");
       }
        
        
        
       for (String imprimir:baraja){
       System.out.println(imprimir);
    
       }
     
       System.out.println("Cantidad de Cartas Creadas: " + baraja.toArray().length );
       if (baraja.toArray().length>108){
           System.out.println("Se paso de Cartas");
       }else if (baraja.toArray().length<108){
           System.out.println("Faltan Cartas");
       }else{
           
           System.out.println("Baraja Creada Correctamente!");
       }
           
       
             
    }    
    
    public static void main (String args[]){
    NewClass Test = new NewClass();
    Test.crearBaraja();
        
  }

}

