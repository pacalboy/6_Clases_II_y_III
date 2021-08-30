public class Motor {
    
    private int potencia;
    public final int N_MOTOR;
    public final int N_CILINDROS;

    public Motor(int potencia, int N_MOTOR, int N_CILINDROS) {
        this.potencia = potencia;
        this.N_MOTOR = N_MOTOR;
        this.N_CILINDROS = N_CILINDROS;
    }

    public int getPotencia() {
        return potencia;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.potencia;
        hash = 89 * hash + this.N_MOTOR;
        hash = 89 * hash + this.N_CILINDROS;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Motor other = (Motor) obj;
        if (this.potencia != other.potencia) {
            return false;
        }
        if (this.N_MOTOR != other.N_MOTOR) {
            return false;
        }
        if (this.N_CILINDROS != other.N_CILINDROS) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Motor{" + "potencia=" + potencia + ", nMotor=" + N_MOTOR + ", nCilindros=" + N_CILINDROS + '}';
    }
}
