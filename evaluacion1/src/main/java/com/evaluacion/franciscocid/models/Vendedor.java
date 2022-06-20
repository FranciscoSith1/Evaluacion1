package com.evaluacion.franciscocid.models;

import javax.persistence.*;

@Entity
@Table(name="vendedor")

public class Vendedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Atributos
    private Long id;
    private String nombre;
    private String apellido;
    private String llegada;

    //Constructor vacia
    public Vendedor() {
    }

    //Constructor con parametros


    public Vendedor(String nombre, String apellido, String llegada) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.llegada = llegada;
    }

    //Getter and Setter
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
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

    public String getLlegada() {
        return llegada;
    }

    public void setLlegada(String llegada) {
        this.llegada = llegada;
    }
}
