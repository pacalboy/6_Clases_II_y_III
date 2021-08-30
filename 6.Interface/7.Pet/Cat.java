public class Cat extends Animal implements Pet{
    private String name;

    public Cat() {
        super(4);
    }

    public Cat(String name) {
        super(4);
        this.name = name;
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
        return "el gato juega";
    }

    @Override
    public String eat() {
        return "el gato come atún";
    }
    
}
