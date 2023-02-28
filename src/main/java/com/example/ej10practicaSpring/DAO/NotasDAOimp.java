package com.example.ej10practicaSpring.DAO;

import com.example.ej10practicaSpring.modelo.ModeloNotas;
import org.springframework.stereotype.Repository;
import jakarta.transaction.Transactional;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

@Repository
@Transactional

public class NotasDAOimp implements NotasDAO {

    @PersistenceContext
    EntityManager entityManager; // Para hacer consultas

    @Override
    public List<ModeloNotas> getNotas() {

        String query = "FROM usuarios";
        // String query = "FROM ModeloNotas";
        // String query = "SELECT * FROM usuarios";
        // String query = "SELECT nota FROM usuarios";
        // String query = "SELECT nota FROM usuarios WHERE nota = 5";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    // Try catch creado tras 37.432 intentos de agregar usuarios
    public void agregarUsuario(ModeloNotas nuevoUsuario) {
        try {
            entityManager.persist(nuevoUsuario); // Creado después de agregar el método en la interfaz NotasDAO
        } catch (Exception e) {
            throw new RuntimeException("Error al agregar el usuario: " + e.getMessage());
        }
    }

    public List<ModeloNotas> listarUsuarios() {
        String query = "FROM usuarios";
        return entityManager.createQuery(query).getResultList();
    }
}

