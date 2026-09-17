// class String1{
//     public static void main(String aargs[]){
//         String str1 = "hello";
//         String str2 = "hello";
//         String str3 = new String("hello");
//         System.out.println(str1 == str2); 
//         System.out.println(str1 == str3);
//         System.out.println(str1.equals(str3));
//     }
// }
// Reverse String
// Valid palidrome
// is anagram
// print first Unique character 
// reverse word in string
// print longest word

// Reverse String
// class String1{
//     public static void main(String args[]){
//         String str = "hello";
//         StringBuilder rev_str = new StringBuilder();

//         for(int i=str.length()-1; i>=0; i--){
//             rev_str.append(str.charAt(i));
//         }

//         System.out.println(rev_str);
//     }
// }
// valid palindrome
// class String1{
//     public static void main(String args[]){
//         String str = "hello";
//         StringBuilder rev_str = new StringBuilder();
//         for(int i=str.length()-1; i>=0; i--){
//             rev_str.append(str.charAt(i));
//         }
//         if (rev_str.toString().equals(str)==true){
//             System.out.println("this is valid palindrome");

//         }
//         else{
//             System.out.println("this is not valid palindrome");
//         }

//     }
// }
import java.util.*;
class String1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string to check ");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        String sorted_string_1 = new String(a);
        String sorted_string_2 = new String(b);

        if(sorted_string_1.equals(sorted_string_2) ){
            System.out.println("Anagram");
        }
        else{
            System.out.println("not angram");
        }

    }
}
