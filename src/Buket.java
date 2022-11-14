public class Buket {
    private final Flower[] flowers;

    public Buket(Flower... flowers) {    //в конструктор передает сколько угодно значений. В скобки передается массив Flower[] flowers
        this.flowers = flowers;
    }

    public float getCost() {           //сумма букета
        float sum = 0;
        for (Flower flower : flowers) {
            if (flower != null) {
                sum += flower.getCost();
            }
        }
        return sum + sum * 0.1f;
    }

    public int getLifeSpan() {                       //поиск минимума
        int minLifeSpan = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower != null && flower.getLifeSpan() < minLifeSpan) {
                minLifeSpan = flower.getLifeSpan();
            }
        }
        return minLifeSpan;
    }


    //Напишите программу, с помощью которой можно посчитать стоимость букета
    // в зависимости от состава цветов в нем и узнать срок стояния букета.
    //
    //Стоимость букета рассчитывается в зависимости от состава + 10% надбавка за работу флориста.
    //Срок стояния букета считается по наименьшему сроку.
    // В консоль должна выводиться информация о составе букета, его стоимости и сроке стояния.
    // Например, букет, в котором есть роза обыкновенная — 3 , хризантема — 5, гипсофила — 1,
    // будет стоить 221,40 рублей и простоит 3 суток.
}
