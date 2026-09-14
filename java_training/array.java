import java.util.Arrays;
// class Array1{
//     public static void main(String args[]){
//         int[] x = {1, 2, 3, 4, 5};
//         System.out.println(Arrays.toString(x));
//         System.out.println(x.length);
//     }
// }

// class Array{
//     public static void main(String args[]){
//         int [] x = {3,5,9,2,1,0};
//         int max = -1;
//         for (int i =0;i<x.length;i++){
//             if (x[i]>max){
//                 max = x[i];
//             }
//         }
//         System.out.println(max);
//     }
// }


// find the sum of all the digits 
// class Array{
//    public static void main(String args[]){
//        int [] x = {3,5,9,2,1,0};
//        int sum =0;
//        for(int i=0;i<x.length;i++){
//             sum = sum + x[i];
//        }
//        System.out.println("sum of all numberds in array"+ " " + sum);
//    }
//

// sum of all elements 
// reverse 1d array 
// printh the element of the even idenx number
// print the even numbers
// array is palidrome or not
// rearraneg the array so that even numbers at even place or vice versa
 
import java.util.Arrays;

// class Array {
//     public static void main(String args[]) {

//         int[] arr = {3, 5, 9, 2, 1, 0};

//         int[] reversed_arr = new int[arr.length];

//         for (int i = arr.length - 1; i >= 0; i--) {
//             reversed_arr[arr.length - 1 - i] = arr[i];
//         }
//         System.out.println(Arrays.toString(reversed_arr));
//     }
// }

class Array {
    public static void main(String args[]){
        int[] arr = {3, 5, 9, 2, 1};
        int[] even_arr = new int [(arr.length + 1) / 2];
        for(int i = 0,j=0;i<arr.length;i += 2, j++){
            even_arr[j] = arr[i];
        }
        System.out.println(Arrays.toString(even_arr));
        }
}

