public class Main {

    public static void main(String[] args) {

        CarDirector director = new CarDirector();

        Car sportsCar = director.createCar(new SportsCarBuilder());
        Car familyCar = director.createCar(new FamilyCarBuilder());

        System.out.println("Sports Car:");
        System.out.println(sportsCar);

        System.out.println();

        System.out.println("Family Car:");
        System.out.println(familyCar);
    }
}