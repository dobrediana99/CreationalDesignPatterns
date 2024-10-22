package SA_lab1_task2;

public class CarBuilder {
    // Required attributes
    protected String model;
    protected String engine;
    protected String transmission;

    // Optional attributes
    protected String interior;
    protected String exteriorColor;
    protected String rims;
    protected boolean sunroof;
    protected boolean gps;
    protected boolean soundSystem;
    protected boolean abs;
    protected boolean airbags;
    protected boolean rearCamera;

    // Constructor for required parameters
    public CarBuilder(String model, String engine, String transmission) {
        this.model = model;
        this.engine = engine;
        this.transmission = transmission;
    }

    // Setter methods for optional parameters
    public CarBuilder setInterior(String interior) {
        this.interior = interior;
        return this;
    }

    public CarBuilder setExteriorColor(String exteriorColor) {
        this.exteriorColor = exteriorColor;
        return this;
    }

    public CarBuilder setRims(String rims) {
        this.rims = rims;
        return this;
    }

    public CarBuilder setSunroof(boolean sunroof) {
        this.sunroof = sunroof;
        return this;
    }

    public CarBuilder setGPS(boolean gps) {
        this.gps = gps;
        return this;
    }

    public CarBuilder setSoundSystem(boolean soundSystem) {
        this.soundSystem = soundSystem;
        return this;
    }

    public CarBuilder setABS(boolean abs) {
        this.abs = abs;
        return this;
    }

    public CarBuilder setAirbags(boolean airbags) {
        this.airbags = airbags;
        return this;
    }

    public CarBuilder setRearCamera(boolean rearCamera) {
        this.rearCamera = rearCamera;
        return this;
    }

    // The method that returns the final built Car object
    public Car build() {
        return new Car(this);
    }
}

