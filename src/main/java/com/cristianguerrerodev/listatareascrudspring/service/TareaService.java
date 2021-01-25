package com.cristianguerrerodev.listatareascrudspring.service;

import com.cristianguerrerodev.listatareascrudspring.interfaces.TareaInterface;
import com.cristianguerrerodev.listatareascrudspring.model.Tarea;
import com.cristianguerrerodev.listatareascrudspring.repositories.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TareaService implements TareaInterface {

    @Autowired
    private TareaRepository repository;

    @Override
    public List<Tarea> listar() {
        return (List<Tarea>) repository.findAll();
    }

    @Override
    public Optional<Tarea> listarPorId(long id) {
        return repository.findById(id);
    }

    @Override
    public void insertar(Tarea t) {
        repository.save(t);
    }

    @Override
    public void eliminar(long id) {
        Optional<Tarea> t = repository.findById(id);
        repository.delete(t.get());
    }
}
