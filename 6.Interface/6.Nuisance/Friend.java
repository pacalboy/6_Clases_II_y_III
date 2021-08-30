public class Friend extends Person {
    public EnumHobby hobby;

    public Friend(EnumHobby hobby, String name, int age) {
        super(name, age);
        this.hobby = hobby;
    }
    
    public String chill(){
        return super.getName() + " chilling";
    }
    
    public String play(Friend[] friends){
        String msj = super.getName() + " plays with ";
        
        for (Friend friend : friends) {
            msj += friend + " ";
        }
        return msj;
    }
    
}
