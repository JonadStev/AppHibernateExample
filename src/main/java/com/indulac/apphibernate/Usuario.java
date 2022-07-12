package com.indulac.apphibernate;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "prioridad")
    private int prioridad;

    public Usuario() {
        
    }

    public Usuario(Long id, String email, String nombre, int prioridad) {
        this.id = id;
        this.email = email;
        this.nombre = nombre;
        this.prioridad = prioridad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
    
    
}
