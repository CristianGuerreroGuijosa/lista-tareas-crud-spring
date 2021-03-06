package com.cristianguerrerodev.listatareascrudspring.repositories;

import com.cristianguerrerodev.listatareascrudspring.model.Tarea;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TareaRepository extends CrudRepository<Tarea, Long> {
}
