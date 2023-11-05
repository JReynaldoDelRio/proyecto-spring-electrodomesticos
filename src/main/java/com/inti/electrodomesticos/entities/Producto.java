package com.inti.electrodomesticos.entities;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "producto")
@Data
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int productid;

    @Column(name = "nombre_producto")
    private String nombreproducto;

    @Column(name = "marca_id")
    private int marcaid;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "categoria_id")
    private int categoriaid;

    @Column(name = "proveedor_id")
    private int proveedorid;

    @Column(name = "precio")
    private BigDecimal precio;

    @Column(name = "peso")
    private double peso;

    @Column(name = "dimensiones")
    private String dimensiones;

    @Column(name = "capacidad")
    private double capacidad;

    @Column(name = "clasificacion_energetica")
    private String clasificacionenergetica;

    @Column(name = "consumo_energia")
    private double consumoenergia;

    @Column(name = "características_especiales")
    private String característicasespeciales;

    @Column(name = "descripción")
    private String descripción;

    @Column(name = "imagen")
    private String imagen;

}
