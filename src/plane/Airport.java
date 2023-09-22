package plane;

public class Airport {
    private int area;
    private int runways;
    private int capacity;
    private int employes;
    private int gates;

    public Airport(int area, int runways, int capacity, int employes, int gates) {
        this.area = area;
        this.runways = runways;
        this.capacity = capacity;
        this.employes = employes;
        this.gates = gates;
    }

    public void CheckIn() {

        System.out.println("Passenger is checking in");
    }

    public void CheckOut() {

        System.out.println("Passenger is checking out");
    }


    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getRunways() {
        return runways;
    }

    public void setRunways(int runways) {
        this.runways = runways;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getEmployes() {
        return employes;
    }

    public void setEmployes(int employes) {
        this.employes = employes;
    }

    public int getGates() {
        return gates;
    }

    public void setGates(int gates) {
        this.gates = gates;
    }
}
