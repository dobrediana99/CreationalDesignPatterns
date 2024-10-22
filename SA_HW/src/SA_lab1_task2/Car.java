package SA_lab1_task2;

public class Car {
    // Required attributes
    private String model;
    private String engine;
    private String transmission;

    // Optional attributes
    private String interior;
    private String exteriorColor;
    private String rims;
    private boolean sunroof;
    private boolean gps;
    private boolean soundSystem;
    private boolean abs;
    private boolean airbags;
    private boolean rearCamera;

    // Private constructor to ensure the car is only built via the Builder
    Car(CarBuilder builder) {
        this.model = builder.model;
        this.engine = builder.engine;
        this.transmission = builder.transmission;
        this.interior = builder.interior;
        this.exteriorColor = builder.exteriorColor;
        this.rims = builder.rims;
        this.sunroof = builder.sunroof;
        this.gps = builder.gps;
        this.soundSystem = builder.soundSystem;
        this.abs = builder.abs;
        this.airbags = builder.airbags;
        this.rearCamera = builder.rearCamera;
    }

    @Override
    public String toString() {
        return "Car [Model=" + model +
                ", Engine=" + engine +
                ", Transmission=" + transmission +
                ", Interior=" + (interior != null ? interior : "None") +
                ", Exterior Color=" + (exteriorColor != null ? exteriorColor : "None") +
                ", Rims=" + (rims != null ? rims : "None") +
                ", Sunroof=" + sunroof +
                ", GPS=" + gps +
                ", Sound System=" + soundSystem +
                ", ABS=" + abs +
                ", Airbags=" + airbags +
                ", Rear Camera=" + rearCamera +
                "]";
    }
}

