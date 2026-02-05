package com.example.taller.controller;

import com.example.taller.model.Estudiante;
import com.example.taller.repository.EstudianteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")

public class EstudianteController {
    private final EstudianteRepository repository;

    public EstudianteController(EstudianteRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public String crearEstudiante(@RequestBody Estudiante estudiante) {
        repository.save(estudiante);
        return "Estudiante registrado correctamente";
    }

    @GetMapping
    public List<Estudiante> listarEstudiantes() {
        return repository.findAll();
    }

     @GetMapping("/test")
    public String test() {
        return "API estudiantes funcionando";
    }

    @GetMapping("/{id}")
    public Estudiante buscarPorId(@PathVariable String id) {
        return repository.findById(id);
    }

}
