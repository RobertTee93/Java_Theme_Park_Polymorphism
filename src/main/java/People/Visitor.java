package People;

public class Visitor extends Person {

    private int wallet;


    public Visitor(String name, int age, double height, int wallet) {
        super(name, age, height);
        this.wallet = wallet;
    }

    public double countMoney() {
        return this.wallet;
    }
}
