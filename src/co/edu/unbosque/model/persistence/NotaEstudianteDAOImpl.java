package co.edu.unbosque.model.persistence;

import java.io.IOException;
import java.util.ArrayList;

import co.edu.unbosque.model.NotaEstudiante;

public class NotaEstudianteDAOImpl implements IDAO {

    private String nombreArchivo = "NotasEstudiantes.txt";

    @Override
    public void guardar(NotaEstudianteDTO notaEstudianteDTO) throws IOException {
        String linea = convertirNotaATexto(notaEstudianteDTO);
        FileHandler.guardarLinea(nombreArchivo, linea);
    }

    /**
     * CONVERTIR NotaEstudiante → Texto (para guardar en archivo)
     * Formato: "id;valorNota;descripcion;fecha"
     */
    private String convertirNotaATexto(NotaEstudianteDTO notaEstudianteDTO) {
        return notaEstudianteDTO.getIdEstudiante() + ";" + 
               notaEstudianteDTO.getValorNota() + ";" + 
               notaEstudianteDTO.getDescripcionNota() + ";" + 
               notaEstudianteDTO.getFechaRegistro().toString();
    }

    @Override
    public ArrayList<NotaEstudiante> cargarTodas() throws IOException {
        ArrayList<NotaEstudiante> listaEstudiantes = new ArrayList<>();
        return listaEstudiantes;
    }
}