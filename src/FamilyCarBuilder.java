public class FamilyCarBuilder extends AbstractCarBuilder {

    public FamilyCarBuilder() {
        car.setModel("Family Car");
        car.setEngine("V6");
        car.setSeats(5);
    }

    @Override
    public Car build() {
        validateCommonFields();
        validateFamilyCar();
        return car;
    }

    private void validateFamilyCar() {
        if (car.getSeats() < 4) {
            throw new IllegalStateException(
                    "A family car must have at least 4 seats."
            );
        }
    }
}