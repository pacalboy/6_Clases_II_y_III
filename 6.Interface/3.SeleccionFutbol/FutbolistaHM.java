public class FutbolistaHM extends SeleccionFutbolHM implements DeprotistaInterface, IntegranteInterface{
    private int dorsal;
    private String demarcacion;

    public FutbolistaHM(String nombre, String apellidos, int dorsal, String demarcacion) {
        super(nombre, apellidos);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
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
    
    @Override
    public void entrenar() {
        System.out.println("El futbolista " + super.nombre + " con dorsal " 
                + this.dorsal + " entrena");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El futbolista " + super.nombre + " con dorsal " 
                + this.dorsal + " juega partido");
    }

    @Override
    public void concentrarse() {
        System.out.println("El futbolista " + super.nombre + " con dorsal " 
                + this.dorsal + " se concentra");
    }

    @Override
    public void viajar() {
        System.out.println("El futbolista " + super.nombre + " con dorsal " 
                + this.dorsal + " viaja");
    }
    
}
