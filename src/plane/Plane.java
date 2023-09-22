package plane;

public class Plane {
    private int span;
    private int lenght;
    private int with;
    private int hight;
    private int speed;
    private int weight;
    private int capacity;
    private Engine engine;
    private FighterJet fighterJet;

    public Plane(int span, int lenght, int with, int hight, int speed, int weight, int capacity, Engine engine) {
        this.span = span;
        this.lenght = lenght;
        this.with = with;
        this.hight = hight;
        this.speed = speed;
        this.weight = weight;
        this.capacity = capacity;
        this.engine = engine;
    }


    public void start() {

        System.out.println("plane is starting");
    }

    public void land() {

        System.out.println("plane is landing");
    }

    public void flight() {

        System.out.println("plane is flying");
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getSpan() {
        return span;
    }

    public void setSpan(int span) {
        this.span = span;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getWith() {
        return with;
    }

    public void setWith(int with) {
        this.with = with;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
