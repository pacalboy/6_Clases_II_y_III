public class Fish extends Animal implements Pet{
    private String name;
    
    public Fish() {
        super(0);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String n) {
        this.name = n;
    }

    @Override
    public String play() {
        return "el pez juega";
    }
    
    @Override
    public String walk(){
        return " nada por la pecera";
    }
    
    @Override
    public String eat() {
        return "el pez come gusanos";
    }
}
