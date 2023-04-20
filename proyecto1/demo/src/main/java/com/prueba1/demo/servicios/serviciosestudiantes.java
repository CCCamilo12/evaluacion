package com.prueba1.demo.servicios;

import com.prueba1.demo.entidad.estudiantes;

import java.util.ArrayList;
import java.util.List;

public class serviciosestudiantes {

    private ArrayList<estudiantes> lista = new ArrayList<>();

    public serviciosestudiantes(){
        lista.add(new estudiantes(1073428852,"Vanesa","Gordillo","Decimo",3.5));
        lista.add(new estudiantes(2047856598,"Nicolas","Garzon","Decimo",3.9));
        lista.add(new estudiantes(1070548425,"Daniel","Ramirez","Decimo",2.8));
        lista.add(new estudiantes(1021543621,"Carlos","Damian","Decimo",4.5));
        lista.add(new estudiantes(1020154561,"Camilo","Cubides","Once",5.0));
        lista.add(new estudiantes(1045784526,"Karina","Barbosa","Once",3.9));
        lista.add(new estudiantes(1056986925,"Maicol","Ballen","Once",3.3));
        lista.add(new estudiantes(1068786899,"Camila","Barbosa","Once",4.9));
        lista.add(new estudiantes(1003739479,"Juan","Aldana","Septimo",3.1));
        lista.add(new estudiantes(1003655877,"Alejandra","Barbosa","Septimo",4.5));
        lista.add(new estudiantes(1077446991,"Daniel","Gonzales","Septimo",2.5));
        lista.add(new estudiantes(1023588741,"Sara","Prieto","Septimo",4.0));

    }
    public int cantidad(){
        return lista.size();/*muestra tamaño*/

    }
    public ArrayList<estudiantes> mostrar(){
        return lista;/*muestra toda la lista*/
    }

    public String agregarestudiante(double documento,String nombre,String apellido,String curso,double notafinal){

        lista.add(new estudiantes(documento,nombre,apellido,curso,notafinal));
        return "se registro el estudiante correctamente";
    }


    public List<estudiantes> buscarCurso(String curso){
        List<estudiantes> estudiantesEnCurso = new ArrayList<>();
        for(estudiantes p : lista){
            if(p.getCurso().equalsIgnoreCase(curso)){
                estudiantesEnCurso.add(p);
            }
        }
        return estudiantesEnCurso;
    }



}
