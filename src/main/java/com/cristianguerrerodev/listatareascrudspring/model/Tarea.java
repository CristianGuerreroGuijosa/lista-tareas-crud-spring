package com.cristianguerrerodev.listatareascrudspring.model;

import javax.persistence.*;

@Entity
@Table(name = "tarea")
public class Tarea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String descripcion;
    private boolean urgente;

    public Tarea() {
    }

    public Tarea(String descripcion, boolean urgente) {
        this.descripcion = descripcion;
        this.urgente = urgente;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isUrgente() {
        return urgente;
    }

    public void setUrgente(boolean urgente) {
        this.urgente = urgente;
    }

    public void setUrgenteTrue(){
        this.urgente = true;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", urgente=" + urgente +
                '}';
    }
}
