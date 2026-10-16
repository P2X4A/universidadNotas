package co.edu.unbosque.model.persistence;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;

public class FileHandler {

    public static void guardarLinea(String nombreArchivo, String linea) throws IOException {
        File archivo = new File(nombreArchivo);
        FileWriter archivoEscritor = new FileWriter(archivo, true);
        BufferedWriter archivoEscritorBufer = new BufferedWriter(archivoEscritor);
        archivoEscritorBufer.write(linea);
        archivoEscritorBufer.newLine(); 
        archivoEscritorBufer.close();
        archivoEscritor.close(); 
    }
}