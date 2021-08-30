import java.util.Calendar;

public class Empleado {

    private String nombre;
    private String apellido1;
    private String apellido2;
    private String dni;
    private char genero;
    private int nSS;
    private boolean activo = false;
    private Calendar fNacimiento;
    private Contrato contrato;
    private Taquilla nTaquilla;

    public Empleado(String dni, int nSS) {
        this.dni = dni;
        this.nSS = nSS;
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

    public String getDni() {
        return dni;
    }

    public int getnSS() {
        return nSS;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) throws Exception {
        genero = Character.toUpperCase(genero);
        if (genero == 'H' || genero == 'M') {
            this.genero = genero;
        } else {
            throw new Exception("Carácter no válido. Solo M o H");
        }
    }

    public Calendar getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(int dia, int mes, int anio) throws Exception {
        fNacimiento = Calendar.getInstance();
        fNacimiento.setLenient(false);
        fNacimiento.set(anio, mes, dia);
    }

    public boolean isActivo() {
        return activo;
    }

    public void darBaja() throws Exception {
        if (!activo) {
            throw new Exception("El empleado ya dado de baja");
        }
        activo = false;
        contrato = null;
    }

    public void darAlta(Contrato contrato) throws Exception {
        if (activo) {
            throw new Exception("El empleado ya está activo");
        }
        activo = true;
        this.contrato = contrato;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) throws Exception {
        if (!activo) {
            throw new Exception("No se puede asignar un contrato a un empleado de baja");
        }
        this.contrato = contrato;
    }

    public Taquilla getnTaquilla() {
        return nTaquilla;
    }

    public void setnTaquilla(Taquilla nTaquilla) {
        this.nTaquilla = nTaquilla;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", dni=" + dni + ", genero=" + genero + ", nSS=" + nSS + ", activo=" + activo + ", fNacimiento=" + fNacimiento + ", contrato=" + contrato + ", nTaquilla=" + nTaquilla + '}';
    }

}
