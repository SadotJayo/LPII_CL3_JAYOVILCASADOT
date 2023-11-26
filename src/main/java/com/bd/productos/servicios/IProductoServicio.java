package com.bd.productos.servicios;

import java.util.List;

import com.bd.productos.modelo.ClassProducto;

public interface IProductoServicio {

	//declaramos los metodos
	public List<ClassProducto>ListadoProductos();
	public void RegistrarProducto(ClassProducto clproducto);
	public ClassProducto BuscarPorId(Integer id);
	public void EliminarProducto(Integer id);
	
} //fin de la interface iautoservicio...
