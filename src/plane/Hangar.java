package plane;

import java.util.List;

public class Hangar {
    private int lenght;
    private int with;
    private int capacity;
    private int height;
    private int quantity;
    private Plane plane;

    public Hangar(int lenght, int with, int capacity, int height, int quantity) {
        this.lenght = lenght;
        this.with = with;
        this.capacity = capacity;
        this.height = height;
        this.quantity = quantity;
    }

    private List<Plane> planes;

    public void addPlane(Plane plane) {this.planes.add(plane);}
    
    public void OpenDoor() {

        System.out.println("Door is open");
    }

    public void ClosedDoor() {

        System.out.println("Door is closed");
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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
