// 1.⁠ ⁠Employee Management System
// Create an employee management system.
// Requirements:
// •⁠  ⁠Create an abstract Employee class.
// •⁠  ⁠Store employee name and salary using encapsulation.
// •⁠  ⁠Create a constructor to initialize them.
// •⁠  ⁠Create an abstract method calculateBonus().
// •⁠  ⁠Create a Manager class that inherits from Employee.
// •⁠  ⁠Manager should calculate a 20% bonus.
// •⁠  ⁠Create a method to display employee details.
abstract class Employee {

    private String name;
    private double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    abstract double calculateBonus();
}

class Manager extends Employee {

    Manager(String name, double salary) {
        super(name, salary);
    }

    double calculateBonus() {
        return 0.20 * getSalary();
    }

    public void display() {
        System.out.println("Employee Name: " + getName());
        System.out.println("Employee Salary: " + getSalary());
        System.out.println("Employee Bonus: " + calculateBonus());
    }
}
class EmployeeManagementSys {

    public static void main(String[] args) {

        Manager emp1 = new Manager("Vishal", 100000);
        Manager emp2 = new Manager("Rahul", 80000);
        emp1.display();
        emp2.display();
    }
}