/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.cliente.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author SISTEMAS
 */
@Entity
@Table(name="Clients")
@JsonPropertyOrder({"idClient", "email", "password", "name", "age", "messages", "reservations"})
public class Client implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Integer id;
    @Column(nullable=false, length=45)
    private String primerNombre;
    @Column(nullable=false, length=45)
    private String segundoNombre;
    @Column(nullable=false, length=45)
    private String primerApellido;
    @Column(nullable=false, length=45)
    private String segundoApellido;
    @Column(nullable=false, length=30)
    private String documentoTipo;
    @Column(nullable=false)
    private Double documentoNumero;
    @Column(nullable=false)
    private Double telefono;
    @Column(nullable=false, length=30)
    private String direccion;
    @Column(nullable=false, length=30)
    private String correo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getDocumentoTipo() {
        return documentoTipo;
    }

    public void setDocumentoTipo(String documentoTipo) {
        this.documentoTipo = documentoTipo;
    }

    public Double getDocumentoNumero() {
        return documentoNumero;
    }

    public void setDocumentoNumero(Double documentoNumero) {
        this.documentoNumero = documentoNumero;
    }

    public Double getTelefono() {
        return telefono;
    }

    public void setTelefono(Double telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

      
}
