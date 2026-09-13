public class Car {

    private String model;
    private String engine;
    private int seats;
    private boolean hasGps;
    private boolean hasTripComputer;

    Car() {
    }

    public String getModel() {
        return model;
    }

    void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    void setEngine(String engine) {
        this.engine = engine;
    }

    public int getSeats() {
        return seats;
    }

    void setSeats(int seats) {
        this.seats = seats;
    }

    public boolean hasGps() {
        return hasGps;
    }

    void setGps(boolean hasGps) {
        this.hasGps = hasGps;
    }

    public boolean hasTripComputer() {
        return hasTripComputer;
    }

    void setTripComputer(boolean hasTripComputer) {
        this.hasTripComputer = hasTripComputer;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", engine='" + engine + '\'' +
                ", seats=" + seats +
                ", hasGps=" + hasGps +
                ", hasTripComputer=" + hasTripComputer +
                '}';
    }
}