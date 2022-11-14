import transport.Car;

import java.security.Key;
import java.time.LocalDate;


public class Main {

    public static void main(String[] args) {

        Human maksim = new Human("Максим",-1988,"Минск", "бренд-менеджером");

        Human anay = new Human("Аня",1993,"Москва","методистом образовательных программ");

        Human katay = new Human("Катя",1992,"Калининград","продакт-менеджером");

        Human artem = new Human("Артем",1995,"Москва","директором по развитию бизнеса");
        Human vladimir = new Human("Владимир", 1991, "Казань", "безработный");


//        System.out.println(maksim);
//        System.out.println(anay);
//        System.out.println(katay);
//        System.out.println(artem);
//
//        maksim.setTown("Ангарск");
//        System.out.println(maksim);


        Car lada = new Car("Lada", "Granta", 2015, "России", "желтого", 1.7f,
                "автомат", "универсал", "А125ДЛ564", "5", "зимняя",
                new Car.Key(true, true),
                new Car.Insurance(LocalDate.now().plusMonths(5), 2500.0f, "456789321"));
        System.out.println(lada);
        lada.isRegNumberValid(lada.getRegistrationNumber());
        lada.setSeasonTires();
        Car.Insurance.isInsuranceValid(LocalDate.now());



        Car audi = new Car("Audi","A8 50 L TDI quattro",2020,"Германии","черного",3.0f,
                "автомат", "хэчбэк", "п465уе", "5", "зимняя",
                new Car.Key(true, true),
                new Car.Insurance(LocalDate.now().plusMonths(5), 2500.0f, "454615411"));

        Car bmv = new Car("BMW","Z8o",2021,"Германии","черного",3.0f,
                "автомат", "хэчбэк", "к645ыа", "5", "зимняя",
                new Car.Key(true, true),
                new Car.Insurance(LocalDate.now().plusMonths(5), 2500.0f, "456789323"));

        Car kia = new Car("Kia","Sportage 4-го поколения",2018,"Южной Корее","красного",2.4f,
                "автомат", "седан", "в564ен", "5", "зимняя",
                new Car.Key(true, true),
                new Car.Insurance(LocalDate.now().plusMonths(5), 2500.0f, "456789324"));

        Car hyundai = new Car("Hyundai","Avante",2016,"Южной Корее","оранжевого",1.6f,
                "автомат", "минивэн", "к546гн", "8", "зимняя",
                new Car.Key(true, true),
                new Car.Insurance(LocalDate.now().plusMonths(5), 2500.0f, "456789325"));



//        System.out.println(audi);
//        System.out.println(bmv);
//        System.out.println(kia);
//        System.out.println(hyundai);
            //
//        Flower roza = new Flower("Роза обыкновенная",  "Голландия", 35.59f, 0);
//        Flower xrizantema = new Flower("Хризантема", null, 15.00f, 5);
//        Flower pion = new Flower("Пион", null, 69.90f, 1);
//        Flower gipsofila = new Flower("Гипсофила",  "Турция", 19.50f, 10);

//        System.out.println(roza);
//        System.out.println(xrizantema);
//        System.out.println(pion);
//        System.out.println(gipsofila);
//
//        Buket buket = new Buket(roza, roza, roza, xrizantema, xrizantema, xrizantema, xrizantema, xrizantema, gipsofila);  //в скобки передается массив (new Flowers[] {roza, roza, roza, xrizantema, xrizantema, xrizantema, xrizantema, xrizantema, gipsofila}
//        System.out.println(buket.getCost());
//        System.out.println(buket.getLifeSpan());


    }
}