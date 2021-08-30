public class EntrenadorHM extends SeleccionFutbolHM implements DeprotistaInterface, IntegranteInterface{
    public final int idFederacion;

    public EntrenadorHM(String nombre, String apellidos, int idFederacion) {
        super(nombre, apellidos);
        this.idFederacion = idFederacion;
    }
    
    @Override
    public void entrenar() {
        System.out.println("El entrenador " + super.nombre 
                + " con número de federación " + this.idFederacion + " entrena");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El entrenador " + super.nombre 
                + " con número de federación " + this.idFederacion + " entrena para el partido");
    }

    @Override
    public void concentrarse() {
        System.out.println("El entrenador " + super.nombre 
                + " con número de federación " + this.idFederacion + " se concentra");
    }

    @Override
    public void viajar() {
        System.out.println("El entrenador " + super.nombre 
                + " con número de federación " + this.idFederacion + " viaja");
    }
    
}
