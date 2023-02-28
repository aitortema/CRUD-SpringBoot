package com.example.ej10practicaSpring.controlador;

import com.example.ej10practicaSpring.DAO.NotasDAO;
import com.example.ej10practicaSpring.modelo.ModeloNotas;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

// Clase para manejar las peticiones HTTP

@RestController
public class NotasControlador {
    @Autowired
    private NotasDAO notasDAO;

    @GetMapping("/listarUsuarios")
    public List<ModeloNotas> getNotas() {
        return notasDAO.getNotas();
    }

    // 10 horas para esto 😡 Y luego agregar el método en la interfaz NotasDAO
    @PostMapping("/notas/agregar")
    public String agregarUsuario(@RequestParam("nombre") String nombre, @RequestParam("apellido") String apellido, @RequestParam("nota") int nota) {
        ModeloNotas nuevoUsuario = new ModeloNotas(nombre, apellido, nota);
        notasDAO.agregarUsuario(nuevoUsuario);
        return "redirect:/notas";
    }

}
