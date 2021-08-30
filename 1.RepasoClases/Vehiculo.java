public class Vehiculo {
    
    public final int MAX_PASAJEROS;
    
    private int nPasajeros = 0;
    private int peso;
    private Motor motor;
    private String matricula;

    public Vehiculo() {
        this.MAX_PASAJEROS = 1;
    }

    public Vehiculo(Motor motor, String matricula) {
        this.MAX_PASAJEROS = 1;
        this.motor = motor;
        this.matricula = matricula;
        
    }

    public Vehiculo(int N_ASIENTOS, int peso, Motor motor, String matrícula) {
        this.MAX_PASAJEROS = N_ASIENTOS;
        this.peso = peso;
        this.motor = motor;
        this.matricula = matrícula;
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
    
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Motor getMotor() {
        return motor;
    }
    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    
    public int transportar(int n){
        if (nPasajeros + n <= MAX_PASAJEROS) {
            nPasajeros += n;
        } else{
            int aux = MAX_PASAJEROS - nPasajeros;
            nPasajeros = MAX_PASAJEROS;
            System.out.println("Suben : "+aux+ " pasajeros\n"
                    + "Esperan: "+(n-aux)+ " pasajeros");
        }
        return nPasajeros;
    }
    
    public boolean descargarPasajeros(){
        if (nPasajeros != 0) {
            nPasajeros = 0;
            return true;
        }else
            return false;
    }
 
    @Override
    public String toString() {
        return "Vehiculo{" + "maxPasajeros=" + MAX_PASAJEROS + ", actualPasajeros=" + nPasajeros + ", peso=" + peso + ", motor=" + motor + ", matricula=" + matricula + '}';
    }
    
}
