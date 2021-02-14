package com.cristianguerrerodev.listatareascrudspring.controller;

import com.cristianguerrerodev.listatareascrudspring.model.Tarea;
import com.cristianguerrerodev.listatareascrudspring.service.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class TareaController {

    @Autowired
    private TareaService tareaService;

    @GetMapping({"/", "/index"})
    public String listar(Model model) {
        List<Tarea> listaTareas = tareaService.listar();
        model.addAttribute("listaTareas", listaTareas);
        model.addAttribute("tarea", new Tarea());

        return "index";
    }

    @PostMapping({"/guardar", "/editar/{id}"})
    public String insertar(@Validated Tarea t) {

        if (!t.getDescripcion().isEmpty()) {
            tareaService.insertar(t);
        }

        return "redirect:/index";
    }

    @GetMapping("/editar/{id}")
    public String actualizar(@PathVariable long id, Model model) {

        List<Tarea> listaTareas = tareaService.listar();
        model.addAttribute("listaTareas", listaTareas);
        model.addAttribute("tareaLista", new Tarea());

        Tarea tarea = tareaService.listarPorId(id).get();
        model.addAttribute("tarea", tarea);
        tareaService.insertar(tarea);

        return "formularioEdicion";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable long id) {
        tareaService.eliminar(id);
        return "redirect:/";
    }

}
