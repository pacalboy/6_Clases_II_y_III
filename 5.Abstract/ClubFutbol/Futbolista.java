public class Futbolista extends Empleado{
    private int dorsal;
    private String demarcacion;

    public Futbolista(int dorsal, String nombre, String apellidos) {
        super(nombre, apellidos);
        this.dorsal = dorsal;
    }

    public int getDorsal() {
        return dorsal;
    }
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }
    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    
    public void entrenar(){
        System.out.println("El futbolista con dorsal " + this.dorsal + 
                " y nombre " + super.getNombre() + " entrena");
    }
    
    public void jugarPartido(){
        System.out.println("El futbolista con dorsal " + this.dorsal + 
                " y nombre " + super.getNombre() + " juega el siguiente partido");
    }

    @Override
    public String concentrarse() {
        return "El futbolista con dorsal " + this.dorsal + 
                " y nombre " + super.nombre + " se concentra";
    }

    @Override
    public String viajar() {
        return "El futbolista con dorsal " + this.dorsal + 
                " y nombre " + super.nombre + " viaja";
    }
    
}
