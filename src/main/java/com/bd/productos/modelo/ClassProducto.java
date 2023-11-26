package com.bd.productos.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_productocl3")
public class ClassProducto {
	//declaramos sus atributos
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idproductocl3;
	private String nombrecl3;
	private double precioventacl3;
	private int stock;
	private double preciocompcl3;
	private String estadocl3;
	private String descripcl3;
	
	
	//metodo to string
	@Override
	public String toString() {
		return "ClassProducto [idproductocl3=" + idproductocl3 + ", nombrecl3=" + nombrecl3 + ", precioventacl3="
				+ precioventacl3 + ", stock=" + stock + ", preciocompcl3=" + preciocompcl3 + ", estadocl3=" + estadocl3
				+ ", descripcl3=" + descripcl3 + "]";
	}//fin del metodo tostring

	//constructores
	public ClassProducto() {
	}//fin del constructor vacio...
	
	public ClassProducto(int idproductocl3, String nombrecl3, double precioventacl3, int stock, double preciocompcl3,
			String estadocl3, String descripcl3) {
		super();
		this.idproductocl3 = idproductocl3;
		this.nombrecl3 = nombrecl3;
		this.precioventacl3 = precioventacl3;
		this.stock = stock;
		this.preciocompcl3 = preciocompcl3;
		this.estadocl3 = estadocl3;
		this.descripcl3 = descripcl3;
	}//fin de los constructores con parametors
	
	//setters y geters
	public int getIdproductocl3() {
		return idproductocl3;
	}
	public void setIdproductocl3(int idproductocl3) {
		this.idproductocl3 = idproductocl3;
	}
	public String getNombrecl3() {
		return nombrecl3;
	}
	public void setNombrecl3(String nombrecl3) {
		this.nombrecl3 = nombrecl3;
	}
	public double getPrecioventacl3() {
		return precioventacl3;
	}
	public void setPrecioventacl3(double precioventacl3) {
		this.precioventacl3 = precioventacl3;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public double getPreciocompcl3() {
		return preciocompcl3;
	}
	public void setPreciocompcl3(double preciocompcl3) {
		this.preciocompcl3 = preciocompcl3;
	}
	public String getEstadocl3() {
		return estadocl3;
	}
	public void setEstadocl3(String estadocl3) {
		this.estadocl3 = estadocl3;
	}
	public String getDescripcl3() {
		return descripcl3;
	}
	public void setDescripcl3(String descripcl3) {
		this.descripcl3 = descripcl3;
	}
	
	
} //fin de la clase
