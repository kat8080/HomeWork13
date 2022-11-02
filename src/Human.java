public class Human {
    String name;
    int yearOfBirth;
    String town;
    String job;


    public Human(String name, int yearOfBirth, String town, String job) {
        this.name = Tasks.validOrDefault(name, "Информация не указана");
        this.yearOfBirth = Math.max(yearOfBirth, 0);
        this.town = Tasks.validOrDefault(town, "Информация не указана");
        this.job = Tasks.validOrDefault(job, "Информация не указана");
    }


    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + job + ". Будем знакомы!";
    }
}
