package com.jefferson.sistemamc.resources;

import com.jefferson.sistemamc.domain.Categoria;
import com.jefferson.sistemamc.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {
    @Autowired
    private CategoriaService service;

    @GetMapping(value = "{id}")
    public ResponseEntity<Categoria> listar(@PathVariable("id") Integer id) {
        Categoria obj = service.findById(id);

        return ResponseEntity.ok().body(obj);
    }
}