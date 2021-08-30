import java.util.Calendar;

/**
 * SuperClase BonoBus.
 * @author Álvaro.
 */
public class BonoBus {
    
    public static int contadorBonos = 0;
    public static final float PRECIO = 1.30f;
    private final int ID;
    private float saldo = 0.0f;
    private final Calendar fechaCreacion;
    protected final Calendar fechaValidez;

    /**
     * Constructor por defecto.
     * Usa la fecha actual para el cálculo de fecha de validez.
     * Usa un contador para poner ID al objeto.
     */
    public BonoBus() {
        this.fechaCreacion = Calendar.getInstance();
        this.fechaValidez = this.fechaCreacion;
        this.fechaValidez.add(Calendar.YEAR, 2);
        contadorBonos++;
        this.ID = contadorBonos;
    }

    /**
     * Método get Saldo.
     * @return Saldo.
     */
    public float getSaldo() {
        return saldo;
    }

    /**
     * Método get Fecha de Validez.
     * @return Fecha de validez.
     */
    public Calendar getFechaValidez() {
        return fechaValidez;
    }
    /**
     * Método para pagar el viaje. 
     * Depende del tipo de bono para el cálculo del precio.
     * @return booleano que expresa si ha realizado la acción.
     * @throws Exception e.
     */
    public boolean pagarViaje()throws Exception{
        if (!comprobarFechaValidez()) {
            throw new Exception("Bono con fecha inválida");
        }    
        float precio;
        
        if (this.getClass() == BonoJoven.class) {
            precio = PRECIO/2;
        }else if(this.getClass() == BonoJubilado.class) {
            precio = PRECIO/3;
        }else
            precio = PRECIO;
        
        if (saldo >= precio) {
            saldo -= PRECIO;
            return true;
        }
        return false;
    }
    
    /**
     * Método para pagar varios viajes. 
     * Depende del tipo de bono para permitir realizar la acción.
     * @param n número de viajes.
     * @return booleano que expresa si ha realizado la acción.
     * @throws Exception e.
     */
    public boolean pagarNViajes(int n) throws Exception{
        if(!comprobarFechaValidez()){
            throw new Exception ("Bono con fecha inválida");
        }
        if (n > 0) {
            if (this.getClass() != BonoJoven.class){
                if (saldo >= (n*PRECIO)) {
                saldo -= n*PRECIO;
                return true;
                }
            }else{
                throw new Exception ("El BonoJoven no puede pagar más de 1 billete");
            }
        }else{
            throw new Exception ("No se permiten cifras negativas");
        }
        return false;
    }
    
    /**
     * Métod para recargar saldo.
     * @param e cantidad de euros.
     * @return Saldo.
     * @throws Exception e
     */
    public float recargarSaldo(float e)throws Exception{
        if(!comprobarFechaValidez()){
            throw new Exception ("Bono con fecha inválida");
        }
        if (e > 0) {
            saldo += e;
        }else{
            throw new Exception("No se puede recargar un saldo negativo o nulo");
        }
        return saldo;
    }
        
    /**
     * Método para comprobar la fecha de validez.
     * @return booleano que expresa si es válido.
     */
    public boolean comprobarFechaValidez(){
        return fechaValidez.compareTo(Calendar.getInstance()) >= 0;
    }
    
}
