public abstract class AbstractCarBuilder implements CarBuilder {

    protected final Car car = new Car();

    @Override
    public CarBuilder setModel(String model) {
        car.setModel(model);
        return this;
    }

    @Override
    public CarBuilder setEngine(String engine) {
        car.setEngine(engine);
        return this;
    }

    @Override
    public CarBuilder setSeats(int seats) {
        car.setSeats(seats);
        return this;
    }

    @Override
    public CarBuilder setGps(boolean hasGps) {
        car.setGps(hasGps);
        return this;
    }

    @Override
    public CarBuilder setTripComputer(boolean hasTripComputer) {
        car.setTripComputer(hasTripComputer);
        return this;
    }

    protected void validateCommonFields() {
        if (car.getModel() == null || car.getModel().isBlank()) {
            throw new IllegalStateException("Car model must be specified.");
        }

        if (car.getEngine() == null || car.getEngine().isBlank()) {
            throw new IllegalStateException("Car engine must be specified.");
        }

        if (car.getSeats() <= 0) {
            throw new IllegalStateException("Car must have at least one seat.");
        }
    }
}