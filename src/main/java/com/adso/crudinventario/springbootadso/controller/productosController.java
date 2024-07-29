package com.adso.crudinventario.springbootadso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import com.adso.crudinventario.springbootadso.model.Producto;
import com.adso.crudinventario.springbootadso.services.ProductosRepository;



@Controller
@RequestMapping("/productos")
public class productosController {
	
	@Autowired
	private ProductosRepository repo;
	
	@GetMapping({"","/"})
	public String mostrarListaProductos(Model model) {
		List<Producto> productos =repo.findAll();
		model.addAttribute("productos", productos);
		return "productos/index";
	}

}
