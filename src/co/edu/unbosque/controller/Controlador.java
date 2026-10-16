package co.edu.unbosque.controller;
import co.edu.unbosque.view.Consola;
import java.time.LocalDateTime;
import co.edu.unbosque.model.Brighstpace;
import java.io.IOException;

public class Controlador {
    private Consola consola;
    private Brighstpace sistema;
    
    public Controlador() {
        consola = new Consola();
        sistema = new Brighstpace();
    }
    
    public void ejecutar() {
        int opcion;
        do {
            opcion = consola.mostrarMenu();
            switch(opcion) {
                case 1: 
                    registrarEstudiante();
                    break;
                case 2:
                    consola.mostrarMensaje("Cerrando El Programa");
                    break;
                default:
                    consola.mostrarMensaje("Opcion No Valida, Intente De Nuevo: ");
                    break;
            }
        } while (opcion != 2);
    }
    
    public void registrarEstudiante() {
        try {
            int idEstudiante = consola.pedirIDEstudiante();
            double valorNota = consola.pedirNotaEstudiante();
            String descripcionNota = consola.pedirDescripcionNota();
            LocalDateTime fechaRegistro = LocalDateTime.now(); 
            
            sistema.GuardarNotaEstudiante(idEstudiante, valorNota, descripcionNota, fechaRegistro);
            consola.mostrarMensaje("Nota guardada exitosamente");
            
        } catch (IOException e) {
            consola.mostrarMensaje("Error guardando la nota: " + e.getMessage());
        }
    }
}