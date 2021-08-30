/**
 * Clase BonoBus para jubilados
 * @author Álvaro
 * @see BonoBus
 * @see BonoReducido
 */
public class BonoJubilado extends BonoReducido{

    /**
     * Constructor.
     * @param DNI
     * @param nombre
     * @param apellidos
     * @param edad 
     */
    public BonoJubilado(String DNI, String nombre, String apellidos, int edad){
        super(DNI, nombre, apellidos, edad);
        
    }
    
}
