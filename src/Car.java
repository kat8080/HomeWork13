public class Car {
    String brand;
    String model;
    Float engineVolume;
    String color;
    int year;
    String country;

    Car(String brand) {
        this.brand = "модель";
    }

    Car(String brand, String model, int year, String country, String color, Float engineVolume) {
        this.brand = Tasks.validOrDefault(brand, "default");
        this.model = Tasks.validOrDefault(model, "default");
        this.year = year >= 0 ? year : 2000;
        this.country = Tasks.validOrDefault(country, "default");
        this.color = Tasks.validOrDefault(color, "default");
        this.engineVolume = engineVolume >= 0.0f ? engineVolume : 1.5f;
    }

    public String toString() {
        return "Автомобиль: " + brand + " " + model + ", " + year + " год выпуска, сборка  в " + country + ", " + color + " цвета, объем двигателя — " + engineVolume + " л.";
}
}
