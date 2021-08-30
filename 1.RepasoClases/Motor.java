public class Motor {
    
    private float potencia;
    public final int N_MOTOR;
    public final int N_CILINDROS;

    public Motor(float potencia, int nMotor, int cilindros) {
        this.potencia = potencia;
        this.N_MOTOR = nMotor;
        this.N_CILINDROS = cilindros;
    }

    public float getPotencia() {
        return potencia;
    }
    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Motor{" + "potencia=" + potencia + ", nMotor=" + N_MOTOR + ", cilindros=" + N_CILINDROS + '}';
    }
    
    
}
