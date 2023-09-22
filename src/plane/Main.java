package plane;

public class Main {
    public static void main(String[] args) {

        Plane p1 = new Plane(50, 80, 30, 10, 1000, 500, 200, new Engine(800,1,500,150,100,80));
        Engine e1 = new Engine(800, 1, 500, 150, 100, 80);
        FuelTank f1 = new FuelTank(FuelTank.TYPE.Kerosin,500);
        Hangar h1 = new Hangar(100,50,3,20,3);
        Airport a1 = new Airport(50,3,500,100,10);

        p1.start();
        p1.land();
        p1.flight();

        e1.start();
        e1.stop();
        e1.accelerate();
    }
}
