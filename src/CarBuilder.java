public interface CarBuilder {

    CarBuilder setModel(String model);

    CarBuilder setEngine(String engine);

    CarBuilder setSeats(int seats);

    CarBuilder setGps(boolean hasGps);

    CarBuilder setTripComputer(boolean hasTripComputer);

    Car build();
}