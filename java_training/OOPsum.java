import java.util.*;
class Sum1 {
    int sum(int num) {
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }
}
public class OOPsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        Sum1 obj = new Sum1();
        int result = obj.sum(num);
        System.out.println("Sum = " + result);
    }
}