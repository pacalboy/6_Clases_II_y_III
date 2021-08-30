import java.util.Calendar;

public class BonoJoven extends BonoReducido{

    private static final float PRECIO = 0.75f;
    
    public BonoJoven(String DNI, String nombre, String apellidos, int edad) {
        super(DNI, nombre, apellidos, edad, PRECIO);
        //El constructor de superclase da dos años para fechaValidez
        //Suma el resto en caso de ser joven
        if (edad < 25) {
            super.fechaValidez.add(Calendar.YEAR, 23-edad);
        }
    }

}
