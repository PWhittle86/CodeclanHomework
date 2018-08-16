public class Rollercoaster extends Attraction implements ITicketed{

    public Rollercoaster(String name) {
        super(name);
    }

    public boolean isAllowedTo(Visitor visitor){
        boolean can_ride_the_rollercoaster = false;

        if (visitor.getAge() > 12 && visitor.getHeight() > 145)
            {can_ride_the_rollercoaster = true;}
        return can_ride_the_rollercoaster;
    }

    public double defaultPrice() {
        return 8.40;
    }

    public double priceFor(Visitor visitor) {
        double modified_price = 8.40;

        if (visitor.getHeight() > 200){modified_price = modified_price * 2;}
        return modified_price;
    }




//    Rollercoaster implement ITicketed and charges tall people over 200cm double fee

}
