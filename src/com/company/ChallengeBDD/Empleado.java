package com.company.ChallengeBDD;

import java.util.ArrayList;
import java.util.List;

public class Empleado {
    private String nombre;
    private String apellido;
    private String telefono;
    private String mail;
    private float salario;
    private int antiguedad;
    private String puesto;

    public Empleado() {
        this.nombre = nombreRandom();
        this.apellido = apellidoRandom();
        this.telefono = telefonoRandom();
        this.mail = emailRandom();
        this.salario = salarioRandom();
        this.antiguedad = antiguedadRandom();
        this.puesto = puestosRandom();
    }


    public String nombreRandom(){
        List<String> nombRand = new ArrayList<>();
        nombRand.add("MATIAS");
        nombRand.add("ELIAS");
        nombRand.add("SEBASTIAN");
        nombRand.add("LUCRECIA");
        nombRand.add("ESTELA");

     return nombRand.get((int) (Math.random() * nombRand.size()));
    }

    public String apellidoRandom() {
        List<String> apellidoRand = new ArrayList<>();
        apellidoRand.add("GONZALES");
        apellidoRand.add("ELISTRA");
        apellidoRand.add("PIREZ");
        apellidoRand.add("MALDONADO");
        apellidoRand.add("JURIC");

        return apellidoRand.get((int) (Math.random() * apellidoRand.size()));
    }

    public String telefonoRandom() {
        List<String> telefonoRandom = new ArrayList<>();
        telefonoRandom.add("08(0271)832-62-46");
        telefonoRandom.add("265(9951)810-84-58");
        telefonoRandom.add("48(104)366-61-23");
        telefonoRandom.add("98(98)145-25-37");
        telefonoRandom.add("1(50)601-64-82");

        return telefonoRandom.get((int) (Math.random() * telefonoRandom.size()));
    }

    public String emailRandom() {
        List<String> telefonoRandom = new ArrayList<>();
        telefonoRandom.add("prettattinaleu-7677@yopmail.com");
        telefonoRandom.add("quoidibrafrecou-8453@yopmail.com");
        telefonoRandom.add("nuddeutissammi-3617@yopmail.com");
        telefonoRandom.add("foxicafite-7455@yopmail.com");
        telefonoRandom.add("lulatettuwoi-1995@yopmail.com");

        return telefonoRandom.get((int) (Math.random() * telefonoRandom.size()));
    }

    public float salarioRandom() {
        List<Float> salarioRandom = new ArrayList<>();
        salarioRandom.add(236321f);
        salarioRandom.add(157343f);
        salarioRandom.add(260324f);
        salarioRandom.add(268645f);
        salarioRandom.add(147226f);

        return salarioRandom.get((int) (Math.random() * salarioRandom.size()));
    }

    public int antiguedadRandom() {
        List<Integer> antiguedadRandom = new ArrayList<>();
        antiguedadRandom.add(13);
        antiguedadRandom.add(11);
        antiguedadRandom.add(12);
        antiguedadRandom.add(14);

        return antiguedadRandom.get((int) (Math.random() * antiguedadRandom.size()));
    }

    public String puestosRandom(){
        List<String> puestosRandom = new ArrayList<>();
        puestosRandom.add("CONSERJE");
        puestosRandom.add("ADMINISTRADOR");
        puestosRandom.add("SECRETARIO");
        puestosRandom.add("VOCAL");
        puestosRandom.add("GUARDIA");

        return puestosRandom.get((int) (Math.random() * puestosRandom.size()));
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

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getAntiguedad() {
        return antiguedad;
    }
    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getPuesto() {
        return puesto;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", mail='" + mail + '\'' +
                ", salario=" + salario +
                ", antiguedad=" + antiguedad +
                ", puesto='" + puesto + '\'' +
                '}';
    }
}
