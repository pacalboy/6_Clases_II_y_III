import java.util.Calendar;

public abstract class Bono {
    public static int contadorBonos = 0;
    private final int ID;
    private final float PRECIO;
    private float saldo = 0.0f;
    private final Calendar fechaCreacion;
    protected final Calendar fechaValidez;

    public Bono(float precio) {
        this.fechaCreacion = Calendar.getInstance();
        this.fechaValidez = this.fechaCreacion;
        this.fechaValidez.add(Calendar.YEAR, 2);
        this.ID = ++contadorBonos;
        this.PRECIO = precio;
    }

    public float getSaldo() {
        return saldo;
    }

    public Calendar getFechaValidez() {
        return fechaValidez;
    }
    
    public boolean pagarViaje(){
        if (saldo > PRECIO) {
            saldo -= PRECIO;
            return true;
        }
        return false;
    }
    
    public float recargarSaldo(float euros)throws Exception{
        if (euros > 0) {
            saldo += euros;
        }else{
            throw new Exception("No se puede recargar un saldo negativo o nulo");
        }
        return saldo;
    }
        
}
