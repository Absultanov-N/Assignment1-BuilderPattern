public class CarDirector {

    public Car createCar(CarBuilder builder) {
        return builder
                .setGps(true)
                .setTripComputer(true)
                .build();
    }
}