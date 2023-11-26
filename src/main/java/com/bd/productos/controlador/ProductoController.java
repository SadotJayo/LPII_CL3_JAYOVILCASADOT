package com.bd.productos.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bd.productos.modelo.ClassProducto;
import com.bd.productos.servicios.IProductoServicio;


@Controller
@RequestMapping("/ControlProducto")
public class ProductoController {
	//aplicamos una inyeccion de dependencia
	@Autowired
	private IProductoServicio iproductoservicio;
	
	//creamos un metodo para listar autos..
	@GetMapping("/ListadoProductos")
	public String ListadoProducto(Model modelo) {
		List<ClassProducto> listar=iproductoservicio.ListadoProductos();
		//para probar si recupera datos hasta el controlador
		/*for(ClassProducto lis:listar) {
			System.out.println("codigo producto "+lis.getIdproductocl3()+" nombre "+lis.getNombrecl3());
		}//fin del bucle for...*/
		
		//enviamos datos a la vista
		modelo.addAttribute("listadoproductos",listar);
		//retornar la vista
		return "Vistas/Producto/ListadoProducto";
		
	} //fin del metodo listado
	
	//creamos el metodo registrar...
	@GetMapping("/RegisProducto")
	public String RegistrarProducto(Model model) {
		//realizamos la respectiva instancia
		ClassProducto clproducto=new ClassProducto();
		//enviamos el objeto a la vista
		model.addAttribute("regproducto",clproducto);
		//retornar a la vista
		return "Vistas/Producto/FrmRegProducto";
	} //fin del metodo registrar
	
	@PostMapping("/GuardarProducto")
	public String GuardarAuto(@ModelAttribute ClassProducto clproducto) {
		//aplicamos una inyeccion de dependencia
		//e invocamos el metodo registrar producto
		iproductoservicio.RegistrarProducto(clproducto);	
		//retornamos al listado
		return "redirect:/ControlProducto/ListadoProductos";
	}  //fin del metodo guardar auto
	
	//********creamos el metodo editar..
	@GetMapping("/Editar/{id}")
	public String Editar(@PathVariable("id") Integer idproducto,Model modelo) {
		//buscamos el codigo para asignarlo en el formulario
		ClassProducto busproducto=iproductoservicio.BuscarPorId(idproducto);
		//enviamos a la vista
		modelo.addAttribute("regproducto",busproducto);
		//retornar  a la vista(formulario registrar )
		return "Vistas/Auto/FrmRegProducto";
			
	}  //fin del metodo editar..
	@GetMapping("/Eliminar/{id}")
	public String Eliminar(@PathVariable("id") Integer idproducto,Model modelo) {
		//aplicamos inyeccion de dependencia..
		iproductoservicio.EliminarProducto(idproducto);
		List<ClassProducto> listado=iproductoservicio.ListadoProductos();
		//enviamos a la vista...
		modelo.addAttribute("listadoproductos",listado);
		//retornamos a la vista
		//return "/Vistas/Auto/ListadoAutos";
		//retornamos al listado
		return "redirect:/ControlProducto/ListadoProductos";
		
	}  //fin del metodo eliminar...
	
	
	
} //fin del controlador
