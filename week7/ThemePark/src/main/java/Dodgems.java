public class Dodgems extends Attraction implements ITicketed{

    public Dodgems(String name) {
        super(name);
    }


    public double defaultPrice() {
        return 4.50;
    }

    public double priceFor(Visitor visitor) {
        double modified_price = 4.50;

        if (visitor.getAge() < 12){modified_price = modified_price / 2;}
        return modified_price;
    }
}

//Dodgems implement ITicketed and charge half price to children under 12 years old