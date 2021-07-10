package task3.university;

public class Subject {

    private String name;

    private int hours;

    public Subject(String name, int hours) {
        this.name = name;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public int getHours() {
        return hours;
    }


    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", hours=" + hours +
                '}';
    }
}
