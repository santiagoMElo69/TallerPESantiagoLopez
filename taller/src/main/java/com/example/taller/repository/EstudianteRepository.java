package com.example.taller.repository;
import com.example.taller.model.Estudiante;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class EstudianteRepository {

    private List<Estudiante> estudiantes = new ArrayList<>();

    public List<Estudiante> findAll() {
        return estudiantes;
    }

    public void save(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public Estudiante findById(String id) {
        for (Estudiante e : estudiantes) {
            if (e.getId().equals(id)) {
                return e;
            }
        }
        return null;
    }
}


