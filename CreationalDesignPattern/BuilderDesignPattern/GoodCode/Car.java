package CreationalDesignPattern.BuilderDesignPattern.GoodCode;

public class Car {
    private String engine;
    private int wheels;
    private int seats;
    private String color;
    private boolean sunroof;
    private boolean navigationSystem;

    private Car(Carbuilder builder) {
        this.engine = builder.engine;
        this.wheels = builder.wheels;
        this.seats = builder.seats;
        this.color = builder.color;
        this.sunroof = builder.sunroof;
        this.navigationSystem = builder.navigationSystem;
    }

    private String getEngine() {
        return engine;
    }

    private int getWheels() {
        return wheels;
    }

    private int getSeats() {
        return seats;
    }

    private String getColor() {
        return color;
    }

    private boolean hasSunroof() {
        return sunroof;
    }

    private boolean hasNavigationSystem() {
        return navigationSystem;
    }

    @Override
    public String toString() {
        return "Car [ engine = " + engine + ", wheels = " + wheels + ", seats = " + seats + ", color = " + color + 
        ", sunroof = " + sunroof + ", navigationSystem = " + navigationSystem + "]";
    }

    public static class Carbuilder {
        private String engine;
        private int wheels = 4;
        private int seats = 5;
        private String color = "Black";
        private boolean sunroof = false;
        private boolean navigationSystem = true;

        public Carbuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public Carbuilder setWheels(int wheels) {
            this.wheels = wheels;
            return this;
        }

        public Carbuilder setSeats(int seats) {
            this.seats = seats;
            return this;
        }

        public Carbuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public Carbuilder setSunroof(boolean sunroof) {
            this.sunroof = sunroof;
            return this;
        }

        public Carbuilder setNavigationSystem(boolean navigationSystem) {
            this.navigationSystem = navigationSystem;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

}
