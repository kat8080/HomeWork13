public class Main {
    public static void main(String[] args) {

        Human maksim = new Human();
        maksim.name = "Максим";
        maksim.yearOfBirth = 1988;
        maksim.town = "Минск";
        maksim.job = "бренд-менеджером";

        Human anay = new Human();
        anay.name = "Аня";
        anay.yearOfBirth = 1993;
        anay.town = "Москва";
        anay.job = "методистом образовательных программ";

        Human katay = new Human();
        katay.name = "Катя";
        katay.yearOfBirth = 1992;
        katay.town = "Калининград";
        katay.job = "продакт-менеджером";

        Human artem = new Human();
        artem.name = "Артем";
        artem.yearOfBirth = 1995;
        artem.town = "Москва";
        artem.job = "директором по развитию бизнеса";

        System.out.println(maksim);
        System.out.println(anay);
        System.out.println(katay);
        System.out.println(artem);


        Car lada = new Car();
        lada.brand = "Lada";
        lada.model = "Granta";
        lada.year = 2015;
        lada.country = "России";
        lada.color = "желтого";
        lada.engineVolume = "1,7";

        Car audi = new Car();
        audi.brand = "Audi";
        audi.model = "A8 50 L TDI quattro";
        audi.year = 2020;
        audi.country = "Германии";
        audi.color = "черного";
        audi.engineVolume = "3,0";

        Car bmv = new Car();
        bmv.brand = "BMW";
        bmv.model = "Z8";
        bmv.year = 2021;
        bmv.country = "Германии";
        bmv.color = "черного";
        bmv.engineVolume = "3,0";

        Car kia = new Car();
        kia.brand = "Kia";
        kia.model = "Sportage 4-го поколения";
        kia.year = 2018;
        kia.country = "Южной Корее";
        kia.color = "красного";
        kia.engineVolume = "2,4";

        Car hyundai = new Car();
        hyundai.brand = "Hyundai";
        hyundai.model = "Avante";
        hyundai.year = 2016;
        hyundai.country = "Южной Корее";
        hyundai.color = "оранжевого";
        hyundai.engineVolume = "1,6";

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmv);
        System.out.println(kia);
        System.out.println(hyundai);

    }
}