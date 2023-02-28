package com.example.ej10practicaSpring.DAO;

import com.example.ej10practicaSpring.modelo.ModeloNotas;

import java.util.List;

// Aquí se definen los métodos que se van a usar en el controlador
public interface NotasDAO {

    List<ModeloNotas> getNotas();

    // Método que viene del controlador
    void agregarUsuario(ModeloNotas nuevoUsuario);
}
