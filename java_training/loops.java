import java.util.*;
// class Loops{
//     public static void main(String args[]){
//         // Scanner sc = new Scanner(System.in);
//         // System.out.println("Enter number for table");
//         // int n = sc.nextInt();
//         // for (int i=1;i<=10;i++){
//         //     System.out.println(n + " " + "*" + " " + i +" " + "=" +" "+ n*i);
//         // }
//         int count = 0;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number for checking counts");
//         int n = sc.nextInt();
//         while(n > 0){
//             n = n/10;
//             count++;
//         }
//         System.out.println("Total digits in the number are: " + count);



//     }
// }

// class Loops {
//     public static void main(String args[]) {

//         for (int i = 1; i <= 4; i++) {

//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }

//             System.out.println();
//         }
//     }
// }

// class Loops {
//     public static void main(String args[]) {

//         for (int i = 1; i <= 4; i++) {

//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j + " ");
//             }

//             System.out.println();
//         }
//     }
// }


// class Loops {
//     public static void main(String args[]) {

//         for (int i = 1; i <= 4; i++) {

//             for (int j = 1; j <= 4; j++) {
//                 System.out.print("1 ");
//             }

//             System.out.println();
//         }
//     }
// }


// class Loops {
//     public static void main(String args[]) {

//         for (int i = 1; i <= 4; i++) {

//             for (int j = 1; j <= i; j++) {
//                 System.out.print("1 ");
//             }

//             System.out.println();
//         }
//     }
// }

// class Loops {
//     public static void main(String args[]) {

//         for (int i = 1; i <= 4; i++) {

//             for (int j = 1; j <= i; j++) {
//                 System.out.print(i + " ");
//             }

//             System.out.println();
//         }
//     }
// }

// class Loops {
//     public static void main(String args[]) {

//         int n = 5;
//         int sum = 0;

//         for (int i = 1; i <= n; i++) {
//             sum = sum + i;
//         }

//         System.out.println("Sum = " + sum);
//     }
// }

// class Loops {
//     public static void main(String args[]) {

//         int n = 1234;
//         int reverse = 0;

//         while (n > 0) {
//             int digit = n % 10;
//             reverse = reverse * 10 + digit;
//             n = n / 10;
//         }

//         System.out.println("Reverse = " + reverse);
//     }
// }

// class Loops {
//     public static void main(String args[]) {

//         int n = 5;
//         int fact = 1;

//         for (int i = 1; i <= n; i++) {
//             fact = fact * i;
//         }

//         System.out.println("Factorial = " + fact);
//     }
// }


// class Loops {
//     public static void main(String args[]) {

//         int n = 10;
//         int a = 0;
//         int b = 1;

//         for (int i = 1; i <= n; i++) {

//             System.out.print(a + " ");

//             int c = a + b;
//             a = b;
//             b = c;
//         }
//     }
// }


// class loops{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number of days to charity");
//         int n = sc.nextInt();
//         int total = 0;
//         for(int i=1;i<=n;i++){
//             total = total + i*i;
//     }
//         System.out.println("Total amount donated to charity = " + total);
//     }
// }


// class loops{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a year to check leap year ");
//         int n = sc.nextInt();
//         if ((n % 4 == 0 && n % 100 != 0)|| n % 400 == 0){
//             System.out.println(n + " is leap year");
//         }
//         else{
//             System.out.println(n + " is not leap year");
//         }
//     }
// }



// class loops{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a product id to check premuim or regular product");
//         int n = sc.nextInt();
//         int count = 0;

//         for(int i = 2;i<=n;i++){
//             if(n % i == 0){
//                 count++;
//             }            
//         }
//         if (n == 1){
//             System.out.println(n + " "+ "is a regular product");
//         }
//         else if (count < 2){
//                 System.out.println(n +" "+ "is premium product");
//             }
//             else{
//                 System.out.println(n + " "+ "is regular product");
//             }    
//         }
//     }

// class loops{
//     public static void main(String args[]){
//         for(int i=1 ; i<=3;i++){
//             System.out.print();
//         }
//         System.out.println("");
//     }
// }


// class Loops {
//     public static void main(String args[]) {

//         for (int i = 1; i <= 3; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//         for (int i = 2; i >= 1; i--) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

class Loops {
    public static void main(String args[]) {

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {

                if (i == 1 || i == 4 || j == 1 || j == 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
        
    
