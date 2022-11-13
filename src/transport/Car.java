package transport;

import java.time.LocalDate;
import java.util.Locale;

public class Car {
    public static class Key {          //вложенный класс Ключ
        private final boolean remoteEngineStart;  //Удаленный запуск двигателя
        private final boolean keyLessAccess;     //Бесключевой доступ

        public Key(boolean remoteEngineStart, boolean keyLessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keyLessAccess = keyLessAccess;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeyLessAccess() {
            return keyLessAccess;
        }
    }

    public static class Insurance {         //вложенный класс Страховка
        private final LocalDate validUntil;  //Срок действия
        private final float cost;             //Стоимость
        private final String namber;        //номер

        public Insurance(LocalDate validUntil, float cost, String namber) {
            this.validUntil = validUntil != null ? validUntil : LocalDate.now().plusDays(10);
            this.cost = Math.max(cost, 1f);
            this.namber = Tasks.validOrDefault(namber, "default");
        }

        public boolean isNumberValid() {
            return namber.length() == 9;         //проверка длины номера страховки
        }

        public boolean isInsuranceValid() {                  //проверка действительности страховки
            return LocalDate.now().isBefore(this.validUntil);   //сегодняшняя дата раньше даты страховки
        }
    }


    private final String brand;         //марка   не изменяется
    private final String model;          //модель         не изменяется
    private Float engineVolume;    //объем двигателя
    private String color;         //цвет
    private final int year;               //год производства         не изменяется
    private final String country;         //страна сборки           не изменяется
    private String transmission;       //коробка передач
    private final String bodyType;              //Тип кузова          не изменяется
    private String registrationNumber;        //Регистрационный номер
    private final String numberSeats;          //Количество мест       не изменяется
    private boolean winterTires;          //зимаШины
    private Key key;
    private Insurance insurance;

    public Car(String brand, String model, int year, String country, String color, Float engineVolume,
               String transmission, String bodyType, String registrationNumber, String numberSeats,
               boolean winterTires) {

        this.brand=Tasks.validOrDefault(brand, "default");
        this.model = Tasks.validOrDefault(model, "default");
        this.year = year >= 0 ? year : 2000;
        this.country = Tasks.validOrDefault(country, "default");
        setColor(color);
        setEngineVolume(engineVolume);
        this.bodyType = Tasks.validOrDefault(bodyType, "default");
        this.numberSeats = Tasks.validOrDefault(numberSeats, "default");
        setTransmission(transmission);
        setRegistrationNumber(registrationNumber);
        setWinterTires(winterTires);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getNumberSeats() {
        return numberSeats;
    }

    public Float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(Float engineVolume) {
        this.engineVolume = engineVolume >= 0.0f ? engineVolume : 1.5f;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = Tasks.validOrDefault(color, "default");
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = Tasks.validOrDefault(transmission, "default");
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public boolean isWinterTires() {
        return winterTires;
    }

    public void setWinterTires(boolean winterTires) {
        this.winterTires = winterTires;
    }

    public void setSeasonTires() {                                         //замена шин в зависимости от месяца
        int currentMonth = LocalDate.now().getMonthValue();              //текущий месяц
        this.winterTires = currentMonth <= 4 || currentMonth >= 11;        //зимняя резина с ноября по апрель
    }

    public boolean isRegNumberValid() {                        //проверка регНомера
        if (this.registrationNumber.length() != 9) {                   //длина номера не больше 9
            return false;
        }
        char[] regNumberChars = this.registrationNumber.toCharArray();   //проверка каждого символа
        return isRegNumberLetter(regNumberChars[0])                      //соответствие цифре или букве
                && isNamber(regNumberChars[1])
                && isNamber(regNumberChars[2])
                && isNamber(regNumberChars[3])
                && isRegNumberLetter(regNumberChars[4])
                && isRegNumberLetter(regNumberChars[5])
                && isNamber(regNumberChars[6])
                && isNamber(regNumberChars[7])
                && isNamber(regNumberChars[8]);
    }

    private boolean isNamber(char symbol) {          //проверка на цифру
        return Character.isDigit(symbol);      //можно еще return symbol>='0' $$ symbol<='9'
    }


    private boolean isRegNumberLetter(char symbol) {        //проверка на букву
        String allowedSymbols = "АВЕКМНОРСТУХ";
        return allowedSymbols.contains("" + symbol);        //contains проверяет находится ли подстрока в строке
    }



    public String toString() {
        return "Автомобиль: " + brand + " " + model + ", " + year + " год выпуска, сборка  в " + country + ", " + color + " цвета, объем двигателя — " + engineVolume + " л.";
}
}
