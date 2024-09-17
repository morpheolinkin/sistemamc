package com.jefferson.sistemamc.resources;

import com.jefferson.sistemamc.domain.Categoria;
import com.jefferson.sistemamc.services.CategoriaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

    private final CategoriaService service;

    @GetMapping(value = "{id}")
    public ResponseEntity<Categoria> listar(@PathVariable("id") Integer id) {
        Categoria obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping
    public ResponseEntity<List<Categoria>> listAll() {
        return ResponseEntity.ok().body(service.listAll());
    }
}