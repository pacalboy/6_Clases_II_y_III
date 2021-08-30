public class Entrenador extends Empleado{
    
    private final String ID_FEDERACION;

    public Entrenador(String ID_FEDERACION, String nombre, String apellidos) {
        super(nombre, apellidos);
        this.ID_FEDERACION = ID_FEDERACION;
    }

    public String getID_FEDERACION() {
        return ID_FEDERACION;
    }
    
    public void dirigirPartido(){
        System.out.println("El entrenador con ID " + this.ID_FEDERACION + 
                " y nombre " + super.getNombre() + " dirige el partido");
    }
    
    public void dirigirEntrenamiento(){
        System.out.println("El entrenador con ID " + this.ID_FEDERACION + 
                " y nombre " + super.getNombre() + " dirige el entrenamiento");
    }    
    
    @Override
    public String concentrarse(){
        return "El entrenador con ID de federación " + this.ID_FEDERACION + 
                " y nombre " + super.concentrarse();
    }
    
    @Override
    public String viajar(){
        return "El entrenador con ID " + this.ID_FEDERACION + 
                " y nombre " + super.viajar();
    }
    
}
