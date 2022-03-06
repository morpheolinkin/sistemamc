package com.jefferson.sistemamc.services;

import com.jefferson.sistemamc.domain.Categoria;
import com.jefferson.sistemamc.repositories.CategoriaRepository;
import com.jefferson.sistemamc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria findById(Integer id) {
        Optional<Categoria> byId = categoriaRepository.findById(id);
        return byId.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
    }
}