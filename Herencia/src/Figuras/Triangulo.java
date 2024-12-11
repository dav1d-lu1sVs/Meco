package Figuras;

import java.util.Scanner;

public class Triangulo extends Figura{
    private double a;
    private double b;
    private double c;

    @Override
    public void leerDatos(){
        Scanner sc = new Scanner(System.in);
        super.leerDatos();
        System.out.println("Ingrese el lada 1: ");
        a = sc.nextDouble();
        System.out.println("Ingrese el lado 2: ");
        b = sc.nextDouble();
        System.out.println("Ingrese el lado 3: ");
        c = sc.nextDouble();
    }


    @Override
    public double calcularPerimetro(){
        return a+b+c;
    }

    @Override
    public double calcularSemiPerimetro(){
        return calcularPerimetro()/2;
    }
    @Override
    public double calcularArea(){
        double s= calcularSemiPerimetro();
        return  Math.sqrt(s*(s-a)*(s-b)*(s-c)) ;
    }
    @Override
    public String toString(){
        return "---------------------------\n"
                +"Triangulo\n"
                + super.toString()+" *)Lado 1: "+a+"\n *)Lado 2: " +b+"\n *)Lado 3: " +c
                +" \n *) Area: "+calcularArea() + " \n *) Perimetro: "+calcularPerimetro()
                +"\n---------------------------\n";

    }
}

