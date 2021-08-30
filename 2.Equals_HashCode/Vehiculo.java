import java.util.Objects;

public class Vehiculo {
    
    public final int N_ASIENTOS;
    
    private int nPasajeros = 0;
    private float peso;
    private String matricula;
    private Motor motor;

    public Vehiculo() {
        this.N_ASIENTOS = 1;
    }

    public Vehiculo(String matricula, Motor motor) {
        this.N_ASIENTOS = 1;
        this.matricula = matricula;
        this.motor = motor;
    }
    

    public Vehiculo(int N_ASIENTOS, float peso, String matricula, Motor motor) {
        this.N_ASIENTOS = N_ASIENTOS;
        this.peso = peso;
        this.matricula = matricula;
        this.motor = motor;
    }
    
    public Vehiculo(String tipo) {
        switch (tipo) {
            case "coche":
                N_ASIENTOS = 5;
                break;
            case "bus":
                N_ASIENTOS = 30;
                break;
            default:
                N_ASIENTOS = 1;
        }
    }
    
    public String getMatricula() {
        return matricula;
    }
    
    public int getnPasajeros() {
        return nPasajeros;
    }
    public void setnPasajeros(int nPasajeros) {
        this.nPasajeros = nPasajeros;
    }
    
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }

    public Motor getMotor() {
        return motor;
    }
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public boolean descargarPasajeros(){
        if(nPasajeros != 0){
            nPasajeros = 0;
            return true;
        } else{
            return false;
        }
    }

    public int subirPasajeros(int n) {
        if(nPasajeros+n <= N_ASIENTOS){
            nPasajeros += n;
        } else{
            int aux = N_ASIENTOS - nPasajeros;
            nPasajeros = N_ASIENTOS;
            System.out.println("Solo han podido subir: " + aux + " pasajeros" + 
                    "\n Se quedan en la cola " + (n-aux) + " pasajeros");
        }
        return nPasajeros;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.N_ASIENTOS;
        hash = 97 * hash + this.nPasajeros;
        hash = 97 * hash + Float.floatToIntBits(this.peso);
        hash = 97 * hash + Objects.hashCode(this.matricula);
        hash = 97 * hash + Objects.hashCode(this.motor);
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
        
        //En este punto, sabemos que obj es un Vehículo
        final Vehiculo other = (Vehiculo) obj;
        if (this.N_ASIENTOS != other.N_ASIENTOS) {
            return false;
        }
        if (this.nPasajeros != other.nPasajeros) {
            return false;
        }
        if (Float.floatToIntBits(this.peso) != Float.floatToIntBits(other.peso)) {
            return false;
        }
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        if (!Objects.equals(this.motor, other.motor)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "N_ASIENTOS=" + N_ASIENTOS + ", nPasajeros=" + nPasajeros + ", peso=" + peso + ", matricula=" + matricula + ", motor=" + motor + '}';
    }
}
