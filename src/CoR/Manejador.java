package CoR;
//Handler
public abstract class Manejador {
    private Manejador siguiente;

    public void setSiguiente (Manejador siguiente){
        this.siguiente=siguiente;
    }
    public void manejar (String problema, int nivel){
        if (!procesar(problema, nivel)&&siguiente!=null){
            siguiente.manejar(problema,nivel);
        }
    }
    protected abstract boolean procesar (String problema, int nivel);
}
