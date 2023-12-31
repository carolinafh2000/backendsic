package com.example.demo.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Persona")
@NoArgsConstructor
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "tipoidentificacion")
    private Long tipoidentificacion;

    @Column(name = "identificacion")
    private String identificacion;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "email")
    private String email;

    public Persona(Long tipoIdentificacion, String identificacion, String nombre, String apellido, String telefono, String direccion, String email) {
        this.tipoidentificacion = tipoIdentificacion;
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;

    }
}