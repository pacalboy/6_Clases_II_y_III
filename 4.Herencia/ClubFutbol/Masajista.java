public class Masajista extends Empleado{
    
    private final String TITULACION;
    private int aniosExperiencia;

    public Masajista(String TITULACION, String nombre, String apellidos) {
        super(nombre, apellidos);
        this.TITULACION = TITULACION;
    }

    public String getTITULACION() {
        return TITULACION;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }
    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }
    
    public void darMasaje(){
        System.out.println("El masajista con titulación " + this.TITULACION + 
                " y nombre " + super.getNombre() + " da masaje");
    }
    
    @Override
    public String concentrarse(){
        return "El masajista con titulación " + this.TITULACION + 
                " y nombre " + super.concentrarse();
    }
    
    @Override
    public String viajar(){
        return "El masajista con titulación " + this.TITULACION + 
                " y nombre " + super.viajar();
    }
    
}
