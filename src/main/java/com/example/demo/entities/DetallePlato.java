//Paquetes:
package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "detalleplato")

public class DetallePlato extends BaseEntity {

	// Atributos:
	@Column
	private int cantidad;
	private String articulo;

	// Constructor por defecto:
	public DetallePlato() {
	}

	// Getters:
	public int getCantidad() {
		return this.cantidad;
	}

	// Setters:
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getArticulo() {
		return articulo;
	}

	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}

	// Metodos:

}
