package CoR;

public class Asistente extends Manejador{
    @Override
    protected boolean procesar(String problema, int nivel) {
        if (nivel <=1){
            System.out.println("Asistente resolvió: "+ problema+".");
            return true;
        }
        return false;
    }
}
