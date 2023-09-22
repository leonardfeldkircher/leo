package plane;

public class FuelTank {

    public enum TYPE {Kerosin, Benzin};

    public TYPE type = TYPE.Kerosin;

    private int capacity;

    public FuelTank(TYPE type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public void full() {

        System.out.println("Fuel Tank is full");
    }

    public void empty() {

        System.out.println("Fuel Tank is empty");
    }


    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
