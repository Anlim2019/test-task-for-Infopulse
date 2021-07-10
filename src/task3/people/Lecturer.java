package task3.people;

import task3.abstracts.Person;
import task3.university.Subject;

import java.util.ArrayList;

public class Lecturer extends Person {

    private ArrayList<Subject> subjects;

    public Lecturer(int age, String name, String surname, ArrayList<Subject> subjects) {
        super(age, name, surname);
        this.subjects = subjects;
    }

    public String teach(Subject subject) {
        for (Subject s : subjects) {
            if(s.equals(subject)) {
                return "Lecturer " + getName() + " " + getSurname() + " teach " + subject.getName();
            }
        }
        return "Lecturer " + getName() + " " + getSurname() + " can not teach " + subject.getName();
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "subjects=" + subjects +
                '}';
    }
}
