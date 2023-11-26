package com.bd.productos.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.bd.productos.modelo.ClassProducto;

public interface IProducto extends CrudRepository<ClassProducto,Integer> {

}//fin de la interface...
