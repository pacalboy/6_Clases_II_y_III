import java.util.Calendar;

public class Contrato {
    
    public static final String N_EMPRESA = "MasterEmpresa S.L.";
    public final int N_CONTRATO;
    private static int cuentaContrato = 0;
    private float salarioBase;
    private int horasExtras = 0;
    private final Calendar F_INICIO;
    private String tipo;

    public Contrato(float salarioBase, String tipo) {
        this.salarioBase = salarioBase;
        this.F_INICIO = Calendar.getInstance();
        this.tipo = tipo;
        cuentaContrato ++;
        this.N_CONTRATO = cuentaContrato;
    }

    public static String getN_EMPRESA() {
        return N_EMPRESA;
    }

    public int getN_CONTRATO() {
        return N_CONTRATO;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public Calendar getF_INICIO() {
        return F_INICIO;
    }

    public static int getCuentaContrato() {
        return cuentaContrato;
    }

    public float getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(float salarioBase) throws Exception{
        if (salarioBase < 0) {
            throw new Exception("No puede ser negativo");
        }else
            this.salarioBase = salarioBase;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void sumarHorasExtras(int n)throws Exception{
        if (n < 0) {
            throw new Exception("No puede ser negativo");
        }else{
            this.horasExtras += n;
        }
    }
    
    public float calcularSueldoMes (float precioHorasExtras)throws Exception{
        if (precioHorasExtras < 0) {
            throw new Exception("No puede ser negativo");
        }else{
            float salarioTotal;
            float salarioExtra = precioHorasExtras * this.horasExtras;
            salarioTotal = this.salarioBase + salarioExtra;
            return salarioTotal;
        }
    }

    @Override
    public String toString() {
        return "Contrato{" + "N_CONTRATO=" + N_CONTRATO + ", salarioBase=" + 
                salarioBase + ", horasExtras=" + horasExtras + ", F_INICIO=" + 
                F_INICIO + ", tipo=" + tipo + '}';
    }
    
}
