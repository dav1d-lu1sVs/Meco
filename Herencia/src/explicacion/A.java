package explicacion;

public class A {
    private int atributo1;
    private int atributo2;
    public A(int atributo1, int atributo2){
        System.out.println("Constructor de la clase A");
        this.atributo1=atributo1;
        this.atributo2=atributo2;

    }

    public int getAtributo1() { return atributo1;
    }

    public void setAtributo1(int atributo1) { this.atributo1 = atributo1;
    }

    public int getAtributo2() { return atributo2;
    }

    public void setAtributo2(int atributo2) { this.atributo2 = atributo2;
    }
    //public String retornarDatos(){return "Atributo1: "+atributo1+"\nAtributo2: "+atributo2;}

   // @Override
    public String retornarDatos(){
        return "Atributo1: "+atributo1+"\2n Atributo2: ";
    }
}
