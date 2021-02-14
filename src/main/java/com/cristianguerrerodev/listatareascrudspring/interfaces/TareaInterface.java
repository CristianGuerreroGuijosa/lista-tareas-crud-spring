package com.cristianguerrerodev.listatareascrudspring.interfaces;

import com.cristianguerrerodev.listatareascrudspring.model.Tarea;

import java.util.List;
import java.util.Optional;

public interface TareaInterface {
    public List<Tarea> listar();

    public Optional<Tarea> listarPorId(long id);

    public void insertar(Tarea t);

    public void eliminar(long id);
}
