package Figuras;

import java.io.DataOutput;
import java.util.Scanner;

public abstract class Figura {
    private Punto origen;

    public Figura() {
        origen = new Punto(0, 0);
    }

    public void leerDatos() {
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.println("Ingrese las coordenadas x del origen");
        x = sc.nextInt();
        System.out.println("Ingrese las coordenadas y del origen");
        y = sc.nextInt();
        origen.setX(x);
        origen.setY(y);
    }

    public abstract double calcularSemiPerimetro();

    @Override
    public String toString(){
        return "("+origen.getX()+" , "+origen.getY()+")\n";
   }
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}

