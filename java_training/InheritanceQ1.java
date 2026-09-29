// cretae a parent class employee with attributes as name and salary derive manager and devloper classes with extra attributes (departemnt for manager and programming language for devloper)

class Employee
    {
        String name;
        int salary;
    }

class Manager extends Employee
    {
        String department;
        void display(String name,int salary,String department)
        {
            System.out.println(name + " "+ department + " " + salary);
        }

    }
class Devloper extends Employee
    {
        String programmingLanaguage;
         void display(String name,int salary,String programmingLanaguage)
        {
            System.out.println(name + " " + programmingLanaguage + " " + salary);
        }
    }    

class InheritanceQ1
    {
        public static void main(String args[])
        {
            Manager emp1 = new Manager();
            emp1.display("vishal",100000,"Manager");
            Devloper emp2 = new Devloper();
            emp2.display("rahul",50000,"python");
        }
    }    