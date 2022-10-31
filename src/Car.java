public class Car {
    String brand;
    String model;
    String engineVolume;
    String color;
    int year;
    String country;

    public String toString() {
        return "Автомобиль: " + brand + " " + model + ", " + year + " год выпуска, сборка  в " + country + ", " + color + " цвета, объем двигателя — " + engineVolume + " л.";
}
}
