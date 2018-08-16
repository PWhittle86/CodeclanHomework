public class Playground extends Attraction implements ISecurity{

    public Playground(String name) {
        super(name);
    }

    public boolean isAllowedTo(Visitor visitor){
        boolean allowed_in = false;
        if (visitor.getAge() < 16){allowed_in = true;}
        return allowed_in;}



}










//    Playground implements ISecurity because it has a maximum age of 15


