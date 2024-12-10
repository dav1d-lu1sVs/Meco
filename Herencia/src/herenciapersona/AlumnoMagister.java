package herenciapersona;

public class AlumnoMagister extends AlumnoProgrado{
    private String tesis;

    public AlumnoMagister(String nombre, String cedula, String universidad, String carrera, String tesis) {
        super(nombre, cedula, universidad, carrera);
        this.tesis = tesis;
    }

    public String getTesis() {
        return tesis;
    }

    public void setTesis(String tesis) {
        this.tesis = tesis;
    }

    @Override
    public String toString() {
        return super.toString()+"\nTesis:" +tesis;
    }
}
