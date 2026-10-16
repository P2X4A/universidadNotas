package co.edu.unbosque.model.persistence;

import co.edu.unbosque.model.NotaEstudiante;

public class DataMapper {
    
    public static NotaEstudianteDTO toDTOFromEntity(NotaEstudiante entidad) {
        return new NotaEstudianteDTO(
            entidad.getIdEstudiante(),
            entidad.getValorNota(),
            entidad.getDescripcionNota(),
            entidad.getFechaRegistro()
        );
    }
    
    public static NotaEstudiante toEntityFromDTO(NotaEstudianteDTO dto) {
        return new NotaEstudiante(
            dto.getIdEstudiante(),
            dto.getValorNota(),
            dto.getDescripcionNota(),
            dto.getFechaRegistro()
        );
    }
}