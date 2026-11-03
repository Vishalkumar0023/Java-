import java.util.*;
public class HashMap1 {
    public static void main(String args[])
    {
        Map<Integer,String> students = new HashMap<>();

        students.put(101,"Shreyas");
        students.put(102,"Vishal");
        students.put(103,"Amit");
        System.out.println("After put():"+students);
        System.out.println(students.get(101));
        System.out.println(students.remove(103));
        System.out.println(students.containsKey(102));
        System.out.println(students.containsValue("Vishal"));
        System.out.println(students.isEmpty());
        System.out.println(students.size());
        students.clear();
        System.out.println("After clear students"+students);

        
    }
}
