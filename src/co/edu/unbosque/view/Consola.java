package co.edu.unbosque.view;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Consola {

    private Scanner consola = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("""
                1. Registrar Estudiante
                2. Salir Del Programa
                """);
        return consola.nextInt();
    }
    
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public int pedirIDEstudiante() {
        System.out.println("Ingrese El ID Del Estudiante: ");
        return consola.nextInt();
    }
    
    public double pedirNotaEstudiante() {
        while (true) {
            try {
                System.out.println("Ingrese La Nota Del Estudiante: ");
                double nota = consola.nextDouble();
                consola.nextLine(); // Limpiar buffer
                return nota;
            } catch (InputMismatchException e) {
                System.out.println("Error, Debe ingresar un número válido. Intente nuevamente.");
                consola.nextLine(); // Limpiar el buffer incorrecto
            }
        }
    }
    
    public String pedirDescripcionNota() {
        System.out.println("Ingrese La Descripcion De La Nota: ");
        return consola.nextLine();
    }
}