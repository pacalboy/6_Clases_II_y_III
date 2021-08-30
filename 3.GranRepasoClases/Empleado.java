import java.util.GregorianCalendar;

public class Empleado {
    
    private final String DNI;
    private final int NSS;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private char genero;
    private GregorianCalendar fNac;
    private boolean activo = false;
    private Contrato contrato;
    private Taquilla taquilla;

    public Empleado(String dni, int nss) {
        this.DNI = dni;
        this.NSS = nss;
    }

    public String getDNI() {
        return DNI;
    }

    public int getNSS() {
        return NSS;
    }

    public boolean isActivo() {
        return activo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public char getGenero() {
        return genero;
    }
    public void setGenero(char genero) throws Exception{
        if (genero != 'H' && genero != 'M'){
            throw new Exception("Solo se admite H o M");
        }else{
            this.genero = genero;
        }
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
        darAlta();
    }

    public Taquilla getTaquilla() {
        return taquilla;
    }

    public void setTaquilla(Taquilla taquilla) {
        this.taquilla = taquilla;
    }

    public GregorianCalendar getfNac() {
        return fNac;
    }

    public void setfNac(int dia, int mes, int año){
        GregorianCalendar cal = new GregorianCalendar(año, mes, dia);
        this.fNac = cal;
    }
   
    public void darAlta(){
        this.activo = true;
    }

    public void darBaja(){
        this.contrato = null;
        this.activo = false;
    }    

    @Override
    public String toString() {
        return "Empleado{" + "DNI=" + DNI + ", NSS=" + NSS + ", nombre=" + nombre +
                ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + 
                ", genero=" + genero + ", fNac=" + fNac + ", activo=" + activo +
                ", contrato=" + contrato + ", taquilla=" + taquilla + '}';
    }
    
}
