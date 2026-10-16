package co.edu.unbosque.model.persistence;

import java.io.IOException;
import java.util.ArrayList;

import co.edu.unbosque.model.NotaEstudiante;

public interface IDAO {
    void guardar(NotaEstudianteDTO dto) throws IOException;
    ArrayList<NotaEstudiante> cargarTodas() throws IOException;
}