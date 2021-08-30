public abstract class Animal {
    private int legs;

    public Animal(int legs) {
        this.legs = legs;
    }
    
    public String walk(){
        return " camina";
    }
    
    abstract public String eat();
}
