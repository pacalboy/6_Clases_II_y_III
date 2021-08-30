import java.util.Random;

public class Taquilla {
    
    private String identificador;
    private int codigo;

    public Taquilla(String identificador) {
        this.identificador = identificador;
        this.codigo = generarCodigo();
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
    
    private int generarCodigo(){
        Random r = new Random();
        int codigo = r.nextInt(9000)+1000;
        return codigo;
    }
    
    public void renovarCodigo(int codigoAntiguo){
        if (codigoAntiguo == this.codigo) {
            this.codigo = generarCodigo();
            System.out.println("El nuevo código es: " + this.codigo);
        }else{
            System.out.println("El codigo antiguo no es correcto");
        }
    }

    @Override
    public String toString() {
        return "Taquilla{" + "identificador=" + identificador + ", codigo=" + codigo + '}';
    }
    
}
