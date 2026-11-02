import java.util.*;
class TreeSet1 {
    public static void main(String args[])
    {
        Set<String> ts = new TreeSet<>();
        ts.add("ABC");
        ts.add("University1");
        ts.add("for");
        ts.add("Learning");
        for(String str: ts)
        {
            System.out.println(str);
        }
    }
}
