package plane;

public class Engine {
    private int horespower;
    private int quantity;
    private int weight;
    private int hight;
    private int lenght;
    private int with;

    public Engine(int horespower, int quantity, int weight, int hight, int lenght, int with) {
        this.horespower = horespower;
        this.quantity = quantity;
        this.weight = weight;
        this.hight = hight;
        this.lenght = lenght;
        this.with = with;
    }

    public void start() {

        System.out.println("engine is starting");
    }

    public void stop() {

        System.out.println("engine is stopping");
    }

    public void accelerate() {

        System.out.println("plane is accelerating");
    }


    public int getHorespower() {
        return horespower;
    }

    public void setHorespower(int horespower) {
        this.horespower = horespower;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
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
}

