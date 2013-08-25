/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;


public class Operaciones {
/**
 * 
 * @param x recibe un valor tipo double que el usuario digite en el primer campo de texto
 * @param y recibe un vlor double que el usuario digite en el segundo campo de texto
 * @return la suma de los parametros x,y
 */
   public static double sumar(double x,double y)
   {
   double z;
   z=x+y;
   return z;
   }
    
   /**
    * 
    * @param x recibe un valor tipo double que el usuario digite en el primer campo de texto
    * @param y recibe un valor tipo double que el usuario digite en el segundo campo de texto
    * @return el resultado de la resta x menos y
    */
   public static double restar(double x,double y)
   {
   double z;
   z=x-y;
   return z;
   }
   
   /**
    * 
    * @param x recibe un valor tipo double que el usuario digite en el primer campo de texto
    * @param y recibe un valor tipo double que el usuario digite en el segundo campo de texto
    * @return el resultado del producto entre x and y
    */
   public static double multiplicar(double x,double y)
   {
   double z;
   z=x*y;
   return z;
   }

   /**
    * 
    * @param x recibe un valor tipo double que el usuario digite en el primer campo de texto
    * @param y recibe un valor tipo double que el usuario digite en el segundo campo de texto
    * @return el resultado de la division  x sobre y
    */
   public static double dividir(double x,double y)
   {
   double z;
   z=x/y;
   return z;
   }
   
}
