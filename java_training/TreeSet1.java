import java.util.*;
public class TreeSet1 {

    public static void main(String args[])
    {
        Set<String> ts = new TreeSet<>();
        ts.add("ABC");
        ts.add("University");
        ts.add("For");
        ts.add("Learning");
        for(String str: ts)
        {
            System.out.println(str);
        }
    }
}


