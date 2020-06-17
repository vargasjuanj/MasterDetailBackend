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
import javax.persistence.Table;

@Entity
@Table(name = "plato")

public class Plato extends BaseEntity {

	// Atributos:
	@Column
	private String denominacion;
	@Column
	private int tiempoPreparacion;
	@Column
	private String imagen;
	@Column
	private float precioVenta;

	// Relaciones:

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
	@JoinColumn(name = "detallePlato_plato")
	private List<DetallePlato> detallePlato = new ArrayList<DetallePlato>();

	// Constructor por defecto:
	public Plato() {
	}

	// Getters:
	public String getDenominacion() {
		return this.denominacion;
	}

	public int getTiempoPreparacion() {
		return this.tiempoPreparacion;
	}

	public String getImagen() {
		return this.imagen;
	}

	public float getPrecioVenta() {
		return this.precioVenta;
	}

	// Setters:
	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	public void setTiempoPreparacion(int tiempoPreparacion) {
		this.tiempoPreparacion = tiempoPreparacion;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}

	// Metodos:

	public void agregarDetallePlato(DetallePlato detallePlato) {
		this.detallePlato.add(detallePlato);
	}

	public void removerDetallePlato(DetallePlato detallePlato) {
		this.detallePlato.add(detallePlato);
	}

	public List<DetallePlato> getDetallePlato() {
		return detallePlato;
	}

	public void setDetallePlato(List<DetallePlato> detallePlato) {
		this.detallePlato = detallePlato;
	}

}
