package herenciapersona;

public class Persona {
    private String cedula;
    private String nombre;

    public Persona( String nombre, String cedula) {
        this.nombre = nombre;
        validarCedula(cedula);
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void validarCedula(String cedula){
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Cedula: "+ cedula+"\nNombre: "+ nombre;
    }
}
