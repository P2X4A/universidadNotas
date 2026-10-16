package co.edu.unbosque.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import co.edu.unbosque.model.persistence.NotaEstudianteDAOImpl;
import co.edu.unbosque.model.persistence.DataMapper;
import co.edu.unbosque.model.persistence.NotaEstudianteDTO;
import java.io.IOException;

public class Brighstpace {

    private ArrayList<NotaEstudiante> notasEstudiante = new ArrayList<>();
    private NotaEstudianteDAOImpl notaDAO = new NotaEstudianteDAOImpl();
    
    public void GuardarNotaEstudiante(int idEstudiante, double valorNota, String descripcionNota, LocalDateTime fechaRegistro) throws IOException {
        // Crear el objeto NotaEstudiante (Entidad)
        NotaEstudiante nuevaNota = new NotaEstudiante(idEstudiante, valorNota, descripcionNota, fechaRegistro);
        
        // Agregar a la lista en memoria
        notasEstudiante.add(nuevaNota);
        
        // Convertir Entidad → DTO usando DataMapper
        NotaEstudianteDTO dto = DataMapper.toDTOFromEntity(nuevaNota);
        
        // Guardar en archivo usando el DAO (con DTO)
        notaDAO.guardar(dto);
    }
    
    public ArrayList<NotaEstudiante> getNotasEstudiante() {
        return notasEstudiante;
    }
}