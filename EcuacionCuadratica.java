import java.util.Scanner;
import java.lang.Math;
class EcuacionCuadratica 
{   
   double x1, x2; //variables de clase
   double CalcularEcuacion2gX1(double a,double b,double c)
      {
        double potencia; // variables de metodo
        potencia = Math.pow(b,2) - (4*a*c);
        x1 = (-b - Math.sqrt(potencia))/ 2*a;
        return x1;
      }    
   double CalcularEcuacion2gX2(double a,double b,double c)
      {
        double potencia; // variables de metodo
        potencia = Math.pow(b,2) - (4*a*c);
        x2 = (-b + Math.sqrt(potencia))/ 2*a;
        return x2;
      }    
     public static void main(String [] args)
     {
        double ValorA, ValorB, ValorC; // variables de metodo
           try (Scanner form = new Scanner(System.in)) 
            {
               System.out.println("\nEcuación Cuadrática Empleando la POO");

                  System.out.println("\nEscriba el valor para a?");
                  ValorA = form.nextDouble();
         
                  System.out.println("\nEscriba el valor para b?");
                  ValorB = form.nextDouble();
         
                  System.out.println("\nEscriba el valor para c?");
                  ValorC = form.nextDouble();
            }
      EcuacionCuadratica ecuacion = new EcuacionCuadratica();
      System.out.println("\nMostrando Valores:");
      System.out.println("\n Valor X1 = " + ecuacion.CalcularEcuacion2gX1(ValorA, ValorB, ValorC));
      System.out.println("\n Valor X2 = " + ecuacion.CalcularEcuacion2gX2(ValorA, ValorB, ValorC));
	   }
}