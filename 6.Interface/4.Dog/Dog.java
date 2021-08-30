public class Dog extends Mammal implements Nameable{
    private String name;
    private final Head head;

    public Dog(String name) {
        super("dog");
        this.name = name;
        
        Head h = new Head();
        this.head = h;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String n) {
        this.name = n;
    }
    
}
