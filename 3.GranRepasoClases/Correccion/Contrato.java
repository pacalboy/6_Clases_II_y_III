import java.util.Calendar;

public class Contrato {
    private static int contadorContratos = 0;
    public final static String NOMBRE_EMPRESA = "PONIENTE";
    public final int nContrato;
    private float salarioBase;
    private int horasExtra = 0;
    public final Calendar fInicio;
    private String tipo;

    public Contrato(float salarioBase, Calendar fInicio, String tipo) {
        nContrato = ++contadorContratos;
        this.salarioBase = salarioBase;
        this.fInicio = fInicio;
        this.tipo = tipo;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public static int getContadorContratos() {
        return contadorContratos;
    }

    public int getHorasExtras() {
        return horasExtra;
    }
    
    public void sumarHorasExtra(int n) throws Exception{
        if(n<1){
            throw new Exception("No se aceptan horas extra negativas");
        }
        horasExtra += n;
    }
    
    public float calcularSueldoMes(float precioHora) throws Exception{
        if(precioHora<0){
            throw new Exception("precio hora extra no puede ser negativo");
        }
        return salarioBase + horasExtra * precioHora;
    }

    @Override
    public String toString() {
        return "Contrato{" + "nContrato=" + nContrato + ", salarioBase=" + salarioBase + ", horasExtra=" + horasExtra + ", fInicio=" + fInicio + ", tipo=" + tipo + '}';
    }
}
