public class Empleado {
    
    private static int contador = 0;
    private final int ID;
    private final String nombre;
    private final String apellidos;
    private int edad;

    public Empleado(String nombre, String apellidos) {
        contador++;
        this.ID = contador;
        this.nombre = nombre;
        this.apellidos = apellidos;
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
    
    public String concentrarse(){
        return this.nombre + " se concentra";
    }
    
    public String viajar(){
        return this.nombre + " viaja";
    }
    
}
