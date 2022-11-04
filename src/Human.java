public class Human {
    String name;
    private int yearOfBirth;
    private String town;
    String job;


    public Human(String name, int yearOfBirth, String town, String job) {
        this.name = Tasks.validOrDefault(name, "Информация не указана");
        this.yearOfBirth = getYearOfBirth(yearOfBirth);
        this.town = getTown(town);
        this.job = Tasks.validOrDefault(job, "Информация не указана");
    }

    public int getYearOfBirth(int yearOfBirth) {
        yearOfBirth = Math.max(yearOfBirth, 0);
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getTown(String town) {
        town = Tasks.validOrDefault(town, "Информация не указана");
        return town;
    }

    public void setTown(String town) {
        this.town = Tasks.validOrDefault(town, "Информация не указана");
    }

    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + job + ". Будем знакомы!";
    }
}
