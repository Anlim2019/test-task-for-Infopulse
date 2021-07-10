package task3.university;

import task3.people.Lecturer;

import java.util.ArrayList;


public class Department {

    private String name;

    private ArrayList<Group> groups;

    private ArrayList<Lecturer> lecturers;

    public Department(String name, ArrayList<Group> groups, ArrayList<Lecturer> lecturers) {
        if(groups.isEmpty() || lecturers.size() < 3) {
            System.out.println("Department has to have at least 1 group and 3 lecturers");
            return;
        }
        this.name = name;
        this.groups = groups;
        this.lecturers = lecturers;
    }


    public void addGroup(Group group) {
        groups.add(group);
        System.out.println("Group " + group.getName() + " has successfully added to department");

    }

    public void deleteGroupByName(String name) {
        if (groups.size() == 1) {
            System.out.println("Can not delete group because this department has only 1 group");
            return;
        }
        for (Group group : groups) {
            if (group.getName().equals(name)) {
                break;
            } else if (groups.indexOf(group) == groups.size() - 1) {
                System.out.println("Group with name " + name + " doesn't exist");
                return;
            }
        }
        groups.removeIf(group -> group.getName().equals(name));
        System.out.println("Group " + name + " has successfully removed from department");
    }

    public void addLecturer(Lecturer lecturer) {
        lecturers.add(lecturer);
        System.out.println("Lecturer " + lecturer.getName() +  " " + lecturer.getSurname() + " has successfully added to department");
    }

    public void deleteLecturerByNameAndSurname(String name, String surname) {
        if (lecturers.size() <= 3) {
            System.out.println("Can not delete lecturer because department has to have at least 3 lecturers");
            return;
        }
        for (Lecturer lecturer : lecturers) {
            if (lecturer.getName().equals(name) && lecturer.getSurname().equals(surname)) {
                break;
            } else if (lecturers.indexOf(lecturer) == lecturers.size() - 1) {
                System.out.println("Lecturer " + name + " " + surname + " doesn't exist");
                return;
            }
        }
        lecturers.removeIf(lecturer -> lecturer.getName().equals(name) && lecturer.getSurname().equals(surname));
        System.out.println("Lecturer " + name +  " " + surname + " has successfully removed department");

    }

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public ArrayList<Lecturer> getLecturers() {
        return lecturers;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", groups=" + groups +
                ", lecturers=" + lecturers +
                '}';
    }
}
