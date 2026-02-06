package com.example.taller.controller;

import com.example.taller.model.Estudiante;
import com.example.taller.repository.EstudianteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<?> registrarEstudiante(@RequestBody Estudiante estudiante) {

        // validar
        if (repository.existsById(estudiante.getId())) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("Ya existe un estudiante con ese ID");
        }

        repository.save(estudiante);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(estudiante);
    }

    @GetMapping
    public ResponseEntity<List<Estudiante>> listarEstudiantes() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(repository.findAll());
    }
}
