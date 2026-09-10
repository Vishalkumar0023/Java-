import java.util.*;

// class Input {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println("value of n " + n);
//     }
// }



// class Input{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter your roll no: ");
//         int n = sc.nextInt();
//         sc.nextLine();
//         System.out.println("enter your name: ");
//         String s1 = sc.nextLine();
//         System.out.println("Your roll no " + n + " and name " + s1);   
//     }
// }

// Developing a Student Information Management System for a school or university.
//
// This system allows administrators or teachers to enter and display student
// details easily. Each student has specific attributes, including their name,
// age, CGPA, and grade.
//
// The system will print these details in a user-friendly format after the
// information is entered.
//
// In this scenario, the program prompts the user to enter the following
// student details:
// Name (String)
// Age (Integer)
// CGPA (Float)
// Grade (Character)
//
// After collecting this information, the program will display the student
// details in a structured and easy-to-read format.

class Input{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Enter your CGPA: ");
        float cgpa = sc.nextFloat();
        sc.nextLine();
        System.out.println("Enter your grade: ");
        String grade = sc.nextLine();
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);  
        System.out.println("Grade: " + grade);      
    }
}

