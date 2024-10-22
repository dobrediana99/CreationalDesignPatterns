package SA_lab1_task2;

public class Main {
    public static void main(String[] args) {
        // Example 1: Custom configuration for a luxury car
        Car luxuryCar = new CarBuilder("BMW 7 Series", "V8", "Automatic")
                .setInterior("Leather")
                .setExteriorColor("Black")
                .setRims("Alloy")
                .setSunroof(true)
                .setGPS(true)
                .setSoundSystem(true)
                .setABS(true)
                .setAirbags(true)
                .setRearCamera(true)
                .build();

        System.out.println(luxuryCar);

        System.out.println("---");

        // Example 2: Custom configuration for a sports car
        Car sportsCar = new CarBuilder("Porsche 911", "V8", "Manual")
                .setExteriorColor("Red")
                .setRims("Sport")
                .setSunroof(false)
                .setGPS(true)
                .setABS(true)
                .setAirbags(true)
                .setRearCamera(false)
                .build();

        System.out.println(sportsCar);

        System.out.println("---");

        // Example 3: Custom configuration for an electric car
        Car electricCar = new CarBuilder("Tesla Model S", "Electric", "Automatic")
                .setInterior("Vegan Leather")
                .setExteriorColor("White")
                .setRims("19-inch")
                .setSunroof(true)
                .setGPS(true)
                .setSoundSystem(true)
                .setABS(true)
                .setAirbags(true)
                .setRearCamera(true)
                .build();

        System.out.println(electricCar);

        System.out.println("---");

        // Example 4: Minimal car configuration (only required attributes)
        Car basicCar = new CarBuilder("Honda Civic", "V4", "Manual")
                .build();  // No optional features

        System.out.println(basicCar);
    }
}


