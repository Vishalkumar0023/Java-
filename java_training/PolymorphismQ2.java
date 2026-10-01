// in a company emplyees are of the two types :parmanent and Contractual.
// Bonus Calculation depends on the employee type
// permanent = 20%
// contractual = 10%
// print the salary (salary +bonus ),employee name

class Employee 
    {
        String name;
        double salary;

        void display() 
        {
            System.out.println("Employee Name: " + name);
            System.out.println("Salary: " + salary);
        }
    }

class Permanent extends Employee 
    {

        void display(String name, double salary) 
        {
            this.name = name;
            this.salary = salary;

            double bonus = salary * 0.20;
            double totalSalary = salary + bonus;

            System.out.println("Employee Name: " + name);
            System.out.println("Total Salary: " + totalSalary);
        }
    }

class Contractual extends Employee 
    {

        void display(String name, double salary)
        {
            this.name = name;
            this.salary = salary;

            double bonus = salary * 0.10;
            double totalSalary = salary + bonus;

            System.out.println("Employee Name: " + name);
            System.out.println("Total Salary: " + totalSalary);
        }
    }

class PolymorphismQ2 
    {
        public static void main(String[] args) 
        {

            Permanent p = new Permanent();
            p.display("Rahul", 50000);

            System.out.println();

            Contractual c = new Contractual();
            c.display("Aman", 50000);
        }
    }