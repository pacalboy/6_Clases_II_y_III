public class BonoEstandar extends Bono{

    private static final float PRECIO = 1.30f;
    
    public BonoEstandar() {
        super(PRECIO);
    }
    
    public boolean pagarNumViajes(int n)throws Exception{
        if (n < 0) {
            throw new Exception("No admite negativos");
        }
        if (getSaldo() >= n*PRECIO) {
            for (int i = 0; i < n; i++) {
                pagarViaje();
            }
            return true;
        }
        return false;
    }

}
