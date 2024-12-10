package explicacion;

public class C extends B{
    private int atributoC;
    public C(){
        System.out.println("Constructor de la clase C");
    }
    public C(int atributo1, int atributo2, int atributoB, int atributoC){
        super(atributo1, atributo2, atributoB);
        this.atributoC = atributoC;
    }

    public int getAtributoC() {
        return atributoC;
    }

    public void setAtributoC(int atributoC) {
        this.atributoC = atributoC;
    }

    @Override
    public String retornarDatos(){
        return super.retornarDatos() + "\nAtributo C: "+atributoC;

    }
}
