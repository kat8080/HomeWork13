import transport.Tasks;

public class Flower {
    private String title;   //название
    private String country;  //страна
    private Float cost;   //цена
    private int lifeSpan;  //срок стояния

    public Flower(String title,  String country, Float cost, int lifeSpan) {
        setTitle(title);
        setCountry(country);
        setCost(cost);
        setLifeSpan(lifeSpan);

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = Tasks.validOrDefault(title,"Роза");
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = Tasks.validOrDefault(country, "Россия");
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = Math.max(cost, 1);
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan>0 ? lifeSpan:3;   //если срок стояния больше 0, то ставится заданное значение. Иначе ставится 3
    }

    @Override
    public String toString() {
        return "Цветок: " +
                 title + ", цвет " +
                ", страна происхождения " + country +
                ", цена " + cost +
                " рублей, время стояния " + lifeSpan + " дней.";
    }
}
