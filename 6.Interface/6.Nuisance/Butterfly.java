import java.util.List;

public class Butterfly extends Insect{
    private List<String> colors;

    public Butterfly(List<String> colors, String species) {
        super(species);
        this.colors = colors;
    }

    public Butterfly(Butterfly butterfly) {
        super(butterfly.getSpecies());
    }

    public List<String> getColors() {
        return colors;
    }

    @Override
    public String toString() {
        return "Butterfly{" + "colors=" + colors + '}';
    }
    
}
