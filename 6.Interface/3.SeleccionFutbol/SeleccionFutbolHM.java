public class SeleccionFutbolHM {
    private static int contador = 0;
    public final int id;
    protected String nombre;
    protected String apellidos;
    private int edad;

    public SeleccionFutbolHM(String nombre, String apellidos) {
        this.id = ++contador;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
    
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
