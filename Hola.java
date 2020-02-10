import java.io.*;

class Hola{
   public static void main (String arg[]){
      System.out.println("MENU");
      System.out.println("Ingresa una opción");
      System.out.println("1. Multiplicar");
      System.out.println("2. Sumar");
      int num=Lectura.readInt();
   }
   
   public static double multiplicar(double a, double b){
      return a*b;
   }
}