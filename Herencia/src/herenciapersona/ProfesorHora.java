package herenciapersona;

public class ProfesorHora extends AlumnoMagister{
    private int hora;

    public ProfesorHora(String nombre, String cedula, String universidad, String carrera, String tesis, int hora) {
        super(nombre, cedula, universidad, carrera, tesis);
        this.hora = hora;


    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return super.toString()+"\nHoras: "+hora;
    }
}
