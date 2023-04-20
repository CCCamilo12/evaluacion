package com.prueba1.demo.entidad;

public class estudiantes {
    private double documento;
    private String nombre;
    private String apellido;
    private String curso;
    private double notafinal;


    public estudiantes(double documento, String nombre, String apellido, String curso, double notafinal) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.notafinal = notafinal;
    }

    public estudiantes() {

    }

    public double getDocumento() {
        return documento;
    }

    public void setDocumento(double documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNotafinal() {
        return notafinal;
    }

    public void setNotafinal(double notafinal) {
        this.notafinal = notafinal;
    }

    public void setNotaFinal(double notafinal) {
    }
}