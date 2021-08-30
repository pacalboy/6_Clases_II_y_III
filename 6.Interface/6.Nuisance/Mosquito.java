public class Mosquito extends Insect implements Nuisance {

    public Mosquito(String species) {
        super(species);
    }
    
    public String buzz(){
        return " BZZZZZZ";
    }

    @Override
    public String annoy() {
        return super.getSpecies() + buzz() + " flying over your ear";
    }
    
}
