package task3.university;


import java.util.ArrayList;

public class Faculty {

    private String name;

    private ArrayList<Department> departments;

    public Faculty(String name, ArrayList<Department> departments) {
        if (departments.isEmpty()) {
            System.out.println("Faculty has to have at least 1 department");
            return;
        }
        this.name = name;
        this.departments = departments;
    }

    public void deleteDepartmentByName(String name) {
        if (departments.size() == 1) {
            System.out.println("Can not delete department because this faculty has only 1 department");
            return;
        }
        for (Department department : departments) {
            if (department.getName().equals(name)) {
                break;
            } else if (departments.indexOf(department) == departments.size() - 1) {
                System.out.println("Department with name " + name + " doesn't exist");
                return;
            }
        }
        departments.removeIf(department -> department.getName().equals(name));
        System.out.println("Department " + name + " has successfully removed from faculty");

    }


    public void addDepartment(Department department) {
        departments.add(department);
        System.out.println("Department " + department.getName() + " has successfully added to faculty");

    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                ", departments=" + departments +
                '}';
    }
}
