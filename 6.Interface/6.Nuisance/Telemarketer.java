public class Telemarketer extends Person implements Nuisance{

    public Telemarketer(String name, int age) {
        super(name, age);
    }

    public String giveSalesPitch(){
        return "bla bla bla";
    }
    @Override
    public String annoy() {
        return super.getName() + " telephone you at 14:00";
    }
    
}
