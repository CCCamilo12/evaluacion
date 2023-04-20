package com.prueba1.demo.controlador;

import com.prueba1.demo.entidad.estudiantes;
import com.prueba1.demo.servicios.serviciosestudiantes;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*",maxAge = 3600)


@RestController


public class controladorestudiantes {
    serviciosestudiantes servicio = new serviciosestudiantes();
    @RequestMapping("/saludar")
        public String hola(){ return "hola mundo";}


    @GetMapping("/lista")
    public ArrayList<estudiantes> serviciosestudiantes(){
            return servicio.mostrar();

    }

    @PostMapping("/agregarestudiante/{documento}/{nombre}/{apellido}/{curso}/{notafinal}")
    public String agregarestudiante(@PathVariable("documento") double documento,
                                    @PathVariable("nombre") String nombre,
                                    @PathVariable("apellido") String apellido,
                                    @PathVariable("curso") String curso,
                                    @PathVariable("notafinal") double notafinal) {

        return servicio.agregarestudiante(documento,nombre,apellido,curso,notafinal);
    }


    @GetMapping("/buscarCurso/{dato}")
    public List<estudiantes> buscar (@PathVariable("dato") String curso){
            return  servicio.buscarCurso(curso);
    }



}
