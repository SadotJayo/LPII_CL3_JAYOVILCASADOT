package com.bd.productos.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bd.productos.modelo.ClassProducto;
import com.bd.productos.repositorio.IProducto;

@Service
public class ClassProductoServicioImp implements IProductoServicio {
	//implementamos la inyeccion de dependencia
	@Autowired
	private IProducto iproductorepository;
	
	@Override
	public List<ClassProducto> ListadoProductos() {
		// TODO Auto-generated method stub
		return (List<ClassProducto>) iproductorepository.findAll();
	} //fin del metodo listado

	@Override
	public void RegistrarProducto(ClassProducto clproducto) {
		// registramos todos los datos a la bd
		iproductorepository.save(clproducto);
	} //fin del metodo registrar

	@Override
	public ClassProducto BuscarPorId(Integer id) {
		// buscamos un registro por codigo
		return iproductorepository.findById(id).orElse(null) ;
	} //fin del metodo buscar por id

	@Override
	public void EliminarProducto(Integer id) {
		// eliminamos registro por codigo
		iproductorepository.deleteById(id);
	} //fin del metodo eliminar
	
}//fin de la clase
