import java.util.Calendar;

/**
 * Clase BonoBus para jóvenes.
 * @author Álvaro
 * @see BonoBus
 * @see BonoReducido
 */
public class BonoJoven extends BonoReducido{
    
    /**
     * Constructor. 
     * @param DNI
     * @param nombre
     * @param apellidos
     * @param edad 
     */
    public BonoJoven(String DNI, String nombre, String apellidos, int edad) {
        super(DNI, nombre, apellidos, edad);
        //El constructor de superclase da dos años para fechaValidez
        //Suma el resto en caso de ser joven
        if (edad < 25) {
            super.fechaValidez.add(Calendar.YEAR, 23-edad);
        }
    }
    
}
