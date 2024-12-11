package Figuras;

import java.util.Scanner;

public class Rectangulo extends Figura{
    private double a;
    private double b;

    @Override
    public void leerDatos(){
        Scanner sc = new Scanner(System.in);
        super.leerDatos();
        System.out.println("Ingrese el ancho: ");
        a = sc.nextDouble();
        System.out.println("Ingrese el largo: ");
        b = sc.nextDouble();
    }

    @Override
    public double calcularArea(){
        return a*b;
    }
    @Override
    public double calcularPerimetro(){
        return 2*a +2*b;
    }

    @Override
    public double calcularSemiPerimetro(){
        return 0;
    }
    @Override
    public String toString(){
        return "\n---------------------------\n"
                +"Circulo\n"
                + super.toString()+" *)Ancho: "+a+"\n *)Largo: " +b+" \n *) Area: "+calcularArea() + " \n *) Perimetro: "+calcularPerimetro()
                ;

    }
}

