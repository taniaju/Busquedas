/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author CT7-PC19
 */

public class BusquedaLineal {
    
  public static String posicion1;
    
   public  static void busquedaSecuencial(int []arreglo,int dato){
 int posicion = -1;
 posicion1 = "";
  for(int i = 0; i < arreglo.length; i++){//recorremos todo el arreglo
      if(arreglo[i] == dato){//comparamos el elemento en el arreglo con el buscado
   // posicion = i;//Si es verdadero guardamos la posicion
  //  break;//Para el ciclo
     posicion1 = posicion1 + i + ","; 
  
   }
 }
} 
   
   
    public  static void busquedaSecuencial1(String []arreglo,String dato){
 int posicion = -1;
 posicion1 = "";
  for(int i = 0; i < arreglo.length; i++){//recorremos todo el arreglo
      if(dato.equals(arreglo[i])){//comparamos el elemento en el arreglo con el buscado
   // posicion = i;//Si es verdadero guardamos la posicion
  //  break;//Para el ciclo
     posicion1 = posicion1 + i + ","; 
  
   }
 }
} 
   
   
   
}
