public class Main {
    public static void main(String[] args) {

        Human maksim = new Human("Максим",1988,"Минск","бренд-менеджером");

        Human anay = new Human("Аня",1993,"Москва","методистом образовательных программ");

        Human katay = new Human("Катя",1992,"Калининград","продакт-менеджером");

        Human artem = new Human("Артем",1995,"Москва","директором по развитию бизнеса");


        System.out.println(maksim);
        System.out.println(anay);
        System.out.println(katay);
        System.out.println(artem);


        Car lada = new Car("Lada","Granta",2015,"России","желтого","1,7");

        Car audi = new Car("Audi","A8 50 L TDI quattro",2020,"Германии","черного","3,0");

        Car bmv = new Car("BMW","Z8o",2021,"Германии","черного","3,0");

        Car kia = new Car("Kia","Sportage 4-го поколения",2018,"Южной Корее","красного","2,4");

        Car hyundai = new Car("Hyundai","Avante",2016,"Южной Корее","оранжевого","1,6");
        
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmv);
        System.out.println(kia);
        System.out.println(hyundai);

    }
}