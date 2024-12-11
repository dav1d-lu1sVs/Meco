package Figuras;

import java.util.Scanner;

public class Circulo extends Figura{
    private double radio;

    @Override
    public void leerDatos(){
        Scanner sc = new Scanner(System.in);
        super.leerDatos();
        System.out.println("Ingrese el radio: ");
        radio = sc.nextDouble();
    }

    @Override
    public double calcularArea(){
        return Math.PI * Math.pow(radio, 2);
    }
    @Override
    public double calcularPerimetro(){
        return 2* Math.PI * radio;
    }
    @Override
    public double calcularSemiPerimetro(){
        return 0;
    }
    @Override
    public String toString(){
        return "\n---------------------------\n"
                +"Circulo\n"
                + super.toString()+" *) Radio: "+radio
                +" \n *) Area: "+calcularArea() + " \n *) Perimetro: "+calcularPerimetro()
                ;
    }

}
