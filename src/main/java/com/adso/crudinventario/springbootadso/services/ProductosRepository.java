package com.adso.crudinventario.springbootadso.services;

import org.springframework.data.jpa.repository.JpaRepository;
import com.adso.crudinventario.springbootadso.model.Producto;



public interface ProductosRepository extends JpaRepository<Producto, Integer>{

}
