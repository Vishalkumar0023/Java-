
import java.util.*;
public class Palidrome{
    static String isPalidrome(String str ){
        int left = 0;
        int right = str.length() - 1;
         while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return str + " "+"is not a Palidrome";
            }
            left++;
            right--;
        }
        return str +" "+ "is a Palidrome";
    }
    public static void main(String args []){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string to check Plaidrome");
        String str =sc.nextLine();
        System.out.println(isPalidrome(str));
    }
}
// find the sum of the digits 
// find the square of given number 
// print the students details
// create method to deposit amount widthdraw and print the balance

