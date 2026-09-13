public class SportsCarBuilder extends AbstractCarBuilder {

    public SportsCarBuilder() {
        car.setModel("Sports Car");
        car.setEngine("V8");
        car.setSeats(2);
    }

    @Override
    public Car build() {
        validateCommonFields();
        validateSportsCar();
        return car;
    }

    private void validateSportsCar() {
        if (car.getSeats() > 2) {
            throw new IllegalStateException(
                    "A sports car cannot have more than 2 seats."
            );
        }
    }
}