package task3.university;

import task3.people.Student;

import java.util.ArrayList;

public class Group {

    private String name;

    private String specializationCode;

    private ArrayList<Student> students;

    private ArrayList<Subject> subjects;


    public Group(String name, String specializationCode, ArrayList<Student> students, ArrayList<Subject> subjects) {
        if(subjects.isEmpty() || students.size() < 6) {
            System.out.println("Group has to have at least 1 subject and 6 students");
        }
        this.name = name;
        this.specializationCode = specializationCode;
        this.students = students;
        this.subjects = subjects;
    }

    public void addStudent(Student student) {
        if(students.size() >= 30) {
            System.out.println("Can not add student, group must not have more than 30 students");
            return;
        }
        students.add(student);
        System.out.println("Student " + student.getName() + " " + student.getSurname() + " has successfully added to group");

    }

    public void deleteStudentByNameAndSurname(String name, String surname) {
        if (students.size() <= 3) {
            System.out.println("Can not delete lecturer because department has to have at least 3 lecturers");
            return;
        }
        for (Student student : students) {
            if (student.getName().equals(name) && student.getSurname().equals(surname)) {
                break;
            } else if (students.indexOf(student) == students.size() - 1) {
                System.out.println("Lecturer " + name + " " + surname + " doesn't exist");
                return;
            }
        }
        students.removeIf(student -> student.getName().equals(name) && student.getSurname().equals(surname));
        System.out.println("Student " + name + " " + surname + " has successfully removed from group");

    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
        System.out.println("Subject " + subject.getName() + " has successfully added to group");

    }

    public void deleteSubjectByName(String name) {
        if (subjects.size() == 1) {
            System.out.println("Can not delete subject because this group has only 1 subject");
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
        System.out.println("Subject " + name + " has successfully removed from group");

    }

    public String getName() {
        return name;
    }

    public String getSpecializationCode() {
        return specializationCode;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }



    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", specializationCode='" + specializationCode + '\'' +
                ", students=" + students +
                ", subjects=" + subjects +
                '}';
    }
}
