package com.jefferson.sistemamc.services;

import com.jefferson.sistemamc.domain.Categoria;
import com.jefferson.sistemamc.repositories.CategoriaRepository;
import com.jefferson.sistemamc.services.exceptions.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;

    public Categoria findById(Integer id) {
        Optional<Categoria> byId = categoriaRepository.findById(id);
        return byId.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
    }
}