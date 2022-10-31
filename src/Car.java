public class Car {
    String brand;
    String model;
    String engineVolume;
    String color;
    int year;
    String country;

    Car(String brand, String model, int year, String country, String color, String engineVolume) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.color = color;
        this.engineVolume = engineVolume;
    }

    public String toString() {
        return "Автомобиль: " + brand + " " + model + ", " + year + " год выпуска, сборка  в " + country + ", " + color + " цвета, объем двигателя — " + engineVolume + " л.";
}
}
