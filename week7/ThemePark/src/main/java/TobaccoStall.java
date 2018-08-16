public class TobaccoStall extends Stall implements  ISecurity{

    public TobaccoStall(String name, String ownername, String parkingspot) {
        super(name, ownername, parkingspot);
    }

    public boolean isAllowedTo(Visitor visitor){
        boolean allowed_to_smoke = false;
        if (visitor.getAge() > 17){allowed_to_smoke = true;}
        return allowed_to_smoke;
    }

}


