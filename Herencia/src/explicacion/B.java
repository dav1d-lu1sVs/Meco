package explicacion;

public abstract class B extends A{
    private int atributoB;
    public B(){
        super(0,0);
        System.out.println("Constructor clase B");
    }
    public B(int atributo1, int atributo2, int atributoB){
        super(atributo1, atributo2);
        this.atributoB = atributoB;
    }

    public int getAtributoB() {
        return atributoB;
    }

    public void setAtributoB(int atributoB) {
        this.atributoB = atributoB;
    }
    @Override
    public String retornarDatos(){
        return super.retornarDatos()+"\nAtributoB: "+atributoB;
    }

}