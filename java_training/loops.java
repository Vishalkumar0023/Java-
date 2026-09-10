import java.util.*;
class Loops{
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number for table");
        // int n = sc.nextInt();
        // for (int i=1;i<=10;i++){
        //     System.out.println(n + " " + "*" + " " + i +" " + "=" +" "+ n*i);
        // }
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for checking counts");
        int n = sc.nextInt();
        while(n > 0){
            n = n/10;
            count++;
        }
        System.out.println("Total digits in the number are: " + count);



    }
}
