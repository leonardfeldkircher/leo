package plane;

public class FighterJet extends Plane {
    public FighterJet(int span, int lenght, int with, int hight, int speed, int weight, int capacity, Engine engine) {
        super(span, lenght, with, hight, speed, weight, capacity, engine);
    }

    public void shoot() {

        System.out.println("F22 Fighter Jet is shooting some enemys");
    }

    public void enlighten() {

        System.out.println("F22 Fighter Jet is scanning in russia");
    }
}
