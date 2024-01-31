package BaiTap05;

import java.util.ArrayList;

public class Employee {


    private String name;
    private int year;

    public Employee(String name, int year) {
        super();
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setAge(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Employee@[name=" + name + ", year=" + year + "]";
    }


    public static void main(String[] args) {
        // Create listEmployee
        ArrayList<Employee> listEmployee = new ArrayList<Employee>();
        // Create students
        Employee employee1 = new Employee("Bac", 2002);
        Employee employee2 = new Employee("Nam", 2003);
        Employee employee3 = new Employee("Trung", 2010);
        // Add objects to listStudent
        listEmployee.add(employee1);
        listEmployee.add(employee2);
        listEmployee.add(employee3);
        // Show listStudent
        for (Employee employee : listEmployee) {
            System.out.println(employee.toString());
        }
    }

}
