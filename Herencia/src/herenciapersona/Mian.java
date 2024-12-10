package herenciapersona;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Mian {
    public static void main(String[] args) {
        List<Persona> lista = new ArrayList<Persona>();
        lista.add( new AlumnoProgrado("Carlitos", "1725890154","Udla","Ing Software"));
        lista.add( new AlumnoMagister("David","120849525","La Central","Robo","Cholo"));
        lista.add( new ProfesorHora("Marco","1002020202","Udla","Ing Software","Si",20));

        Iterator<Persona> it = lista.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        for(int i=0; i< lista.size();i++){
            if(lista.get(i)instanceof AlumnoMagister){
                AlumnoMagister am=(AlumnoMagister) lista.get(i);
                System.out.println("cedula: "+am.getCedula()+"\ntesis: "+am.getTesis()
                );
            }
        }
        /*System.out.println("Datos Pregrado\n"+ ap1);
        System.out.println("Datos Pregrado\n"+ am1);
        System.out.println("Datos Pregrado\n"+ ph1);*/
    }
}
