import java.util.*;

// class If_else {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enetr temperature in degreee celcius");
//         int n = sc.nextInt();
//         if (n > 0){
//             System.out.println("safe for outside play");
//         }
//         else{
//             System.out.println("Not safe for outdoor activites");
//         }
//     }
// }



// class If_else {
//     public static void main(String args[]) {
//         String A;
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter your move");
//         String M = sc.nextLine();

//         if (M.equals("rock")) {
//             A = "scissors";
//             System.out.println("Winning from Player B");
//             System.out.println("Player A chooses: " + A);
//         }
//         else if (M.equals("scissors")) {
//             A = "paper";
//             System.out.println("Winning from Player B");
//             System.out.println("Player A chooses: " + A);
//         }
//         else if (M.equals("paper")) {
//             A = "rock";
//             System.out.println("Winning from Player B");
//             System.out.println("Player A chooses: " + A);
//         }   
//         else {
//             System.out.println("Invalid move");
//         }
//     }
// }


// class If_else {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a character: ");
//         char ch = sc.next().charAt(0);
//         ch = Character.toLowerCase(ch);

//         if ( ch >= 'a' && ch <= 'z'){

//             if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
//                 {
//                 System.out.println("Vowel");
//             } else {
//                 System.out.println("Consonant");
//             }

//         } else {
//             System.out.println("Not an alphabet");
//         }
//     }
// }

class If_else{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character to check vowel or consonant");
        char ch = sc.next().charAt(0);
        ch = Character.toLowerCase(ch);
        if (ch >= 'a' && ch <= 'z'){
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                System.out.println("Vowel");
            }
            else
            {
                System.out.println("Consonant");
               
            }
        }
        else 
        {
            System.out.println("Not an alphabet");
        }

    }
}