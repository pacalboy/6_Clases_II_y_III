public abstract class BonoReducido extends Bono{

    protected final String DNI;
    private final String nombre;
    private final String apellidos;
    private final int edad;  
    
    
    protected BonoReducido(String DNI, String nombre, String apellidos,
            int edad, float precio) {
        super(precio);
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
    public boolean pagarViajeReducido(String dni)throws Exception{
        if (this.DNI.equals(dni)) {
            pagarViaje();
            return true;
        }else{
            throw new Exception("DNI no coincide");
        }
    }

}
