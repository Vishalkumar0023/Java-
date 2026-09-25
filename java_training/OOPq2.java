class Student {
    String name;
    int rollNo;
    static String college;
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
    static void setCollege(String collegeName) {
        college = collegeName;
    }
    static void displayCollege() {
        System.out.println("College: " + college);
    }
}
class OOPq2 {
    public static void main(String args[]) {
        Student s1 = new Student("Vishal", 247012);
        Student.setCollege("ABC College");
        System.out.println("Name: " + s1.name);
        System.out.println("Roll No: " + s1.rollNo);
        Student.displayCollege();
    }
}