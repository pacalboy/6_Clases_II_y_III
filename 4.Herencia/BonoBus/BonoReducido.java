/**
 * Clase BonoBus de precio reducido. 
 * @author Álvaro
 */
public class BonoReducido extends BonoBus{
    
    protected final String DNI;
    private final String nombre;
    private final String apellidos;
    private final int edad;  
    
    /**
     * Constructor.
     * @param DNI
     * @param nombre
     * @param apellidos
     * @param edad 
     */
    protected BonoReducido(String DNI, String nombre, String apellidos, int edad) {
        super();
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
    public boolean pagarViajeReducido(String dni) throws Exception {
        if (this.DNI.equals(dni)) {
            try {
                return super.pagarViaje();
            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            throw new Exception("El DNI no es correcto");
        }
        return false;
    }
    
}
