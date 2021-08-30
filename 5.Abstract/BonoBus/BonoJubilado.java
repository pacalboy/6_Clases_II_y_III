public class BonoJubilado extends BonoReducido{
    public static final float PRECIO = 0.65f;

    public BonoJubilado(String DNI, String nombre, String apellidos, int edad)throws Exception {
        super(DNI, nombre, apellidos, edad, PRECIO);
        if (edad < 65) {
            throw new Exception("Ha de ser mayor de 64 años");
        }
    }

}
