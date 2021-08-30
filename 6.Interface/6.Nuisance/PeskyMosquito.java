public class PeskyMosquito extends Mosquito{
    
    public PeskyMosquito() {
        super("PeskyMosquito");
    }
    
    public String bite(){
        return super.getSpecies() + " bites you";
    }
}
