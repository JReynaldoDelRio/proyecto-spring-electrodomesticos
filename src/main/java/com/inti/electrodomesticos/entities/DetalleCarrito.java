package com.inti.electrodomesticos.entities;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "detalle_carrito")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DetalleCarrito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "detail_id") // Nombre de la columna en la base de datos
    private int detailid;

    @Column(name = "cart_id")
    private int cartid;

    @Column(name = "product_id")
    private int productoid;

    @Column(name = "cantidad")
    private int cantidad;

    @Column(name = "sub_total")
    private BigDecimal subtotal;

    // Constructor
    public DetalleCarrito(int cartid, int productoid, int cantidad, BigDecimal precio) {
        this.cartid = cartid;
        this.productoid = productoid;
        this.cantidad = cantidad;
        this.subtotal = precio.multiply(BigDecimal.valueOf(cantidad));
    }
}
