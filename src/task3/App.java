package task3;

import task3.people.Lecturer;
import task3.people.Student;
import task3.university.Department;
import task3.university.Faculty;
import task3.university.Group;
import task3.university.Subject;

import java.util.ArrayList;
import java.util.Arrays;

public class App {

    ArrayList<Student> students = new ArrayList<>(Arrays.asList(
            new Student(18, "Student1", "1"),
            new Student(19, "Student2", "2"),
            new Student(20, "Student3", "3"),
            new Student(21, "Student4", "4"),
            new Student(21, "Student5", "5"),
            new Student(21, "Student6", "6")));


    ArrayList<Subject> subjects = new ArrayList<>(Arrays.asList(
            new Subject("Subject1", 90),
            new Subject("Subject2", 120),
            new Subject("Subject3", 50)));

    ArrayList<Lecturer> lecturers = new ArrayList<>(Arrays.asList(
            new Lecturer(45, "Lecturer", "1", subjects),
            new Lecturer(43, "Lecturer", "2", subjects),
            new Lecturer(47, "Lecturer", "3", subjects)));

    ArrayList<Group> groups = new ArrayList<>(Arrays.asList(
            new Group("Group1", "1A", students, subjects),
            new Group("Group2", "2A", students, subjects) ));

    ArrayList<Department> departments = new ArrayList<>(Arrays.asList(
            new Department("Department1", groups, lecturers),
            new Department("Department2", groups, lecturers)));

    ArrayList<Faculty> faculties = new ArrayList<>(Arrays.asList(
            new Faculty("Faculty1", departments),
            new Faculty("Faculty1", departments)));

    public static void main(String[] args) {
        App app = new App();
        app.departmentCheck();
    }

    public void departmentCheck() {
        System.out.print("1. Should return a warning message: ");
        Department departmentWithEmptyGroupAndEmptyLecturers = new Department("D1", new ArrayList<>(), new ArrayList<>()); // should return a warning message

        System.out.print("2. Should successfully add a group: ");
        Department department = new Department("D2", groups, lecturers);
        department.addGroup(new Group("G1", "1A", students, subjects)); // should add a group

        System.out.println("________________________");


        department.deleteGroupByName("Group1");  // deleting groups
        department.deleteGroupByName("Group2");
        System.out.print("3. Should return a warning message while deleting last group: ");
        department.deleteGroupByName("G1");

        System.out.print("4. Should successfully add a lecturer: ");
        department.addLecturer(new Lecturer(50, "Sasha", "Tsikalov", subjects));

        System.out.print("5. Should return a warning message while deleting lecturer because of it doesn't exist: ");
        department.deleteLecturerByNameAndSurname("O", "B");

        System.out.println("________________________");

        department.deleteLecturerByNameAndSurname("Sasha", "Tsikalov");

        System.out.print("6. Should return a warning message while deleting a " +
                "lecturer because of department has to have at least 3 lecturers: ");
        department.deleteLecturerByNameAndSurname("Lecturer", "1");


    }
}
