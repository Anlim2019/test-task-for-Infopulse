package task3.university;

import java.util.ArrayList;

public class University {

    private String name;

    private ArrayList<Faculty> faculties;

    private ArrayList<Subject> subjects;


    public University(String name, ArrayList<Faculty> faculties, ArrayList<Subject> subjects) {
        if(faculties.isEmpty() || subjects.isEmpty()) {
            System.out.println("University has to have at least 1 faculty and 1 subject");
        }
        this.name = name;
        this.faculties = faculties;
        this.subjects = subjects;
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
        System.out.println("Faculty " + faculty.getName() + " has successfully added to university");

    }

    public void deleteFacultyByName(String name) {
        if (faculties.size() == 1) {
            System.out.println("Can not delete faculty because this university has only 1 faculty");
            return;
        }
        for (Faculty faculty : faculties) {
            if (faculty.getName().equals(name)) {
                break;
            } else if (faculties.indexOf(faculty) == faculties.size() - 1) {
                System.out.println("Faculty with name " + name + " doesn't exist");
                return;
            }
        }
        faculties.removeIf(faculty -> faculty.getName().equals(name));
        System.out.println("Faculty " + name + " has successfully removed from university");
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
        System.out.println("Subject " + subject.getName() + " has successfully added to university");

    }

    public void deleteSubjectByName(String name) {
        if (subjects.size() == 1) {
            System.out.println("Can not delete subject because this university has only 1 subject");
            return;
        }
        for (Subject subject : subjects) {
            if (subject.getName().equals(name)) {
                break;
            } else if (subjects.indexOf(subject) == subjects.size() - 1) {
                System.out.println("Subject with name " + name + " doesn't exist");
                return;
            }
        }
        subjects.removeIf(subject -> subject.getName().equals(name));
        System.out.println("Subject " + name + " has successfully removed from university");

    }

    public String getName() {
        return name;
    }

    public ArrayList<Faculty> getFaculties() {
        return faculties;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", faculties=" + faculties +
                ", subjects=" + subjects +
                '}';
    }
}
