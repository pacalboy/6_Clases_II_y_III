public class MasajistaHM extends SeleccionFutbolHM implements IntegranteInterface{
    private String titulacion;
    private int aniosExperiencia;

    public MasajistaHM(String nombre, String apellidos, String titulacion) {
        super(nombre, apellidos);
        this.titulacion = titulacion;
    }

    public String getTitulacion() {
        return titulacion;
    }
    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }
    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public void concentrarse() {
        System.out.println("El masajista " + super.nombre 
                + " con titulación " + this.titulacion + " se concentra");
    }

    @Override
    public void viajar() {
        System.out.println("El masajista " + super.nombre 
                + " con titulación " + this.titulacion + " viaja");
    }
    
}
