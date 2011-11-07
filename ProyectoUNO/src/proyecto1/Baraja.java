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
public class Baraja {
 
       
  List <String> baraja = new ArrayList <String>();
        
        
     public Baraja(){   
    //Generando Baraja Roja! 
    for (int i=0; i<10;i++){  
        baraja.add(i+"R.png");
    }
     for (int i=1; i<10;i++){  
        baraja.add(i+"R.png");
    }
      for (int i =0; i<2;i++){
        baraja.add("IR.png");
        baraja.add("BR.png");
        baraja.add("T2R.png");
      }
      
      //Generando Baraja Verde
     for (int i=0; i<10;i++){
        baraja.add(i+"V.png");
     }
     for (int i=1; i<10;i++){
        baraja.add(i+"V.png");
     }
     
     for (int i =0; i<2;i++){
        baraja.add("IV.png");
        baraja.add("BV.png");
        baraja.add("T2V.png");
     }
     
     
     
     //Generando Baraja Amarilla
      for (int i=0; i<10;i++){
        baraja.add(i+"AM.png");
      }
      for (int i=1; i<10;i++){
      baraja.add(i+"AM.png");
      }
      
      for (int i =0; i<2;i++){
        baraja.add("IA.png");
        baraja.add("BAM.png");
        baraja.add("T2AM.png");
      }
      
      //Generando Baraja Azul
      for (int i=0; i<10;i++){
      baraja.add(i+"A.png");
      }
      for (int i=1; i<10;i++){
      baraja.add(i+"A.png");
      }
       for (int i =0; i<2;i++){
        baraja.add("IA.png");
        baraja.add("BA.png");
        baraja.add("T2A.png");
       }
       
       for (int i=0;i<4;i++){
        baraja.add("CT4.png");
        baraja.add("CC.png");
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


