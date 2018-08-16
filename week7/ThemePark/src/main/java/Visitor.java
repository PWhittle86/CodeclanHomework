public class Visitor {

    private String name;
    private int height;
    private int age;
    private double money;


    public Visitor(String name, int height, int age, double money) {
        this.name = name;
        this.height = height;
        this.age = age;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public double getMoney() {
        return money;
    }
}
