public class Human {
    String name;
    int yearOfBirth;
    String town;
    String job;

    Human(String name, int yearOfBirth, String town, String job) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.town = town;
        this.job = job;
    }

    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + job + ". Будем знакомы!";
    }
}
