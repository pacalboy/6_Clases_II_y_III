import java.util.Random;

class Taquilla {
    String id;
    String codigo;

    public Taquilla(String id) {
        this.id = id;
        generarCodigoAcceso();
    }
    
    private void generarCodigoAcceso(){
        Random r = new Random();
        int aux;
        codigo = "";
        for(int i=0 ; i<4 ; i++){
            aux = r.nextInt(10);
            codigo += Integer.toString(aux);
        }
    }
    
    public void renovarCodigo(String actual){
        if(actual.equals(codigo)){
            generarCodigoAcceso();
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Taquilla{" + "id=" + id + ", codigo=" + codigo + '}';
    }
    
    
    
    
}
