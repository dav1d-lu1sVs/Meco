package Figuras;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
      Figura f1 = new Circulo();
      Figura f2 = new Rectangulo();
      Figura f3 = new Triangulo();
      Scanner sc = new Scanner(System.in);
      int i= 1;
      while (i==1) {
          System.out.println("Ingresar Datos:\n" +
                  "1) Triangulo\n"+
                  "2) Circulo\n"+
                  "3) Rectangulo\n"+
                  "4)Mostrar Datos: \n"+
                  "Mostrar Calculos\n"+
                  "5) Triangulo\n"+
                  "6) Circulo\n"+
                  "7) Rectangulo\n"+
                  "8) Salir\n"+
                  "9) Volver a Ingresar Datos\n");
          System.out.println("---------------------------------------------\n");
          int op = sc.nextInt();
          System.out.println("\n---------------------------------------------\n");
          if (op == 1) {
              f2.leerDatos();
          } else if (op == 2) {
              f1.leerDatos();
          } else if (op == 3) {
              f3.leerDatos();
          }else if (op == 4) {
              System.out.println(f2);
              System.out.println(f1);
              System.out.println(f3);
          }else if (op == 5) {
              System.out.println("---------------------------------------------");
              System.out.println("\nPerimetro: \n "
                      +"a+b+c"+f2.calcularPerimetro()+"\nSemi Perimetro:\n "+"P/2"+f2.calcularSemiPerimetro()+"\nArea: "+"sqrt{s(s-a)(s-b)(s-c) }"+f2.calcularArea());
              System.out.println("\n---------------------------------------------");
          }else if (op == 6) {
              System.out.println("---------------------------------------------");
              System.out.println("\nPerimetro: \n "
                      +"2PI*Radio="+f2.calcularPerimetro()+"\nArea: PI*Radio^2 "+f2.calcularArea());
              System.out.println("\n---------------------------------------------");
          }else if (op == 7) {
              System.out.println("---------------------------------------------");
              System.out.println("\nPerimetro: \n "
                      +"2a+2b = "+f2.calcularPerimetro()+"\nArea: "+ "ab="+f2.calcularArea());
              System.out.println("\n---------------------------------------------");
          }else if(op==8){
              System.out.println("Saliendo.....");
              i= 2;
          }else if(op==9){
              i= 1;
          }



      }
    }
}

