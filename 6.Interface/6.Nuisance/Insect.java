public abstract class Insect {
    private final String species;

    public Insect(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    @Override
    public String toString() {
        return "Insect{" + "species=" + species + '}';
    }
    
}
