import java.util.*;
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

// class Array {
//     public static void main(String args[]){
//         int[] arr = {3, 5, 9, 2, 1};
//         int[] even_arr = new int [(arr.length + 1) / 2];
//         for(int i = 0,j=0;i<arr.length;i += 2, j++){
//             even_arr[j] = arr[i];
//         }
//         System.out.println(Arrays.toString(even_arr));
//         }
// }
//print the even numbers
// class Array{
//     public static void main(String args[]){
//         int[] arr = {3, 5, 9, 2, 1, 0};
//         System.out.print("Even numbers in the array: ");
//         for(int i = 0; i < arr.length; i++){
//             if(arr[i] % 2 == 0){
//                 System.out.print(arr[i] + " ");
//             }
//         }

//     }
// }
//array is palidrome or not

// class Array{
//     public static void main(String args[]){
//         int[] arr = {3, 5, 9, 2, 1, 0};
//         boolean isPalindrome = true;
//         for(int i = 0; i < arr.length / 2; i++){
//             if(arr[i] != arr[arr.length - 1 - i]){
//                 isPalindrome = false;
//                 System.out.println("The array is not a palindrome.");
//                 break;
//             }
//             
//         }
//         if(isPalindrome){
//             System.out.println("The array is a palindrome.");
//}
        
//     }
// }

// rearraneg the array so that even numbers at even place or vice versa
// class Array{
//     public static void main(String args[]){
//         int[] arr = {3, 5, 9, 2, 1, 0};
//         int[] rearranged_arr = new int[(arr.length)*2];
//         int even_index = 0;
//         int odd_index = 1;
//         for(int i = 0; i < arr.length; i++){
//             if(arr[i] % 2 == 0){
//                 rearranged_arr[even_index] = arr[i];
//                 even_index += 2;
//             }
//             else{
//                 rearranged_arr[odd_index] = arr[i];
//                 odd_index += 2;
//             }
//         }
//         System.out.println(Arrays.toString(rearranged_arr));
//     }
// }

// 2 sum of 2 numbers in an array
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int[] result = new int[2];
//         for(int i = 0; i < nums.length; i++) {
//             for(int j = i + 1; j < nums.length; j++) {
//                 if(nums[i] + nums[j] == target) {
//                     result[0] = i;
//                     result[1] = j;            
//                 }
//             }
//         }
//         return result;
//     }
// }

// check if array is sorted or not
// class Array {
//     public static void main(String args[]) {
//         int[] arr = {1, 2, 3, 4, 5};
//         boolean isSorted = true;
//         for (int i = 0; i < arr.length - 1; i++) {
//             if (arr[i] > arr[i + 1]) {
//                 isSorted = false;
//                 System.out.println("The array is not sorted.");
//                 break;
//             }    
//         }
//         if (isSorted) {
//             System.out.println("The array is sorted.");
//         }  
//     }
// }




// Find the second largest number in array

class Array{
    public static void main(String args[]){
        int[] arr = {3, 5, 9, 2, 1, 0};
        // for(int i =0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if (arr[i]>arr[j]){
        //             int temp = arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = temp;
        //         }
        //     }
        // }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int result = arr[(arr.length)-2];
        System.out.println(result);

    }
}