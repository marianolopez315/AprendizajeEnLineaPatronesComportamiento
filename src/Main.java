import CoR.*;

public class Main {
    public static void main(String[] args) {
        Manejador asistente = new Asistente();
        Manejador profesor = new Profesor();
        Manejador coordinador = new Coordinador();

        // Armo la cadena: Asistente -> Profesor -> Coordinador
        asistente.setSiguiente(profesor);
        profesor.setSiguiente(coordinador);

        // Ejemplos de solicitudes
        System.out.println("----------------------------------CoR----------------------------------");
        asistente.manejar("Problema con ejercicio de AM1",2);
        profesor.manejar("Problema con Grafos", 2);

    }
}