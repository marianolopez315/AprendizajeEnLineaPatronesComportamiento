package CoR;

public class Profesor extends Manejador{
    @Override
    protected boolean procesar(String problema, int nivel) {
        if (nivel ==2){
            System.out.println("Profesor resolvió: "+ problema);
            return true;
        }
        return false;
    }
}
