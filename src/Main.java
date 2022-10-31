public class Main {
    public static void main(String[] args) {

        Human maksim = new Human();
        maksim.name = "Максим";
        maksim.yearOfBirth = 1988;
        maksim.town = "Минск";

        Human anay = new Human();
        anay.name = "Аня";
        anay.yearOfBirth = 1993;
        anay.town = "Москва";

        Human katay = new Human();
        katay.name = "Катя";
        katay.yearOfBirth = 1992;
        katay.town = "Калининград";

        Human artem = new Human();
        artem.name = "Артем";
        artem.yearOfBirth = 1995;
        artem.town = "Москва";

        System.out.println(maksim);
        System.out.println(anay);
        System.out.println(katay);
        System.out.println(artem);

    }
}