/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author Hector
 */
public class NewClass {
 
       
        ArrayList <String> baraja = new ArrayList <String>();
        
        
     public NewClass(){   
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
        
        
       /* 
       for (String imprimir:baraja){
       System.out.println(imprimir);
    
       }
      */
       
       
       System.out.println("Cantidad de Cartas Creadas: " + baraja.size() );
       
       Collections.shuffle(this.baraja);
     }   
      
             
        
    
    public static void main (String args[]){
   
   }

    }


