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
    public double calcularArea(){
        return a*b ;
    }
    @Override
    public double calcularPerimetro(){
        return a+b+c;
    }
    @Override
    public String toString(){
        return super.toString()+"Radio: "+a;
    }
}

