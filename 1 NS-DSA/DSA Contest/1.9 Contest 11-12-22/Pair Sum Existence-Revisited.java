// Pair Sum Existence-Revisited


// easy
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// You are given an array A of size N, and you are also given a sum. You need to find if two numbers in A exists such that their sum is equal to the given sum. If yes, print 1, else print 0.
// Input
// The first line contains N denoting the size of the array A and target sum. The second line contains N elements of the array. The third line contains element sum.

// Constraints:
// 1 <= N <= 100000
// 1 <= A[i] <= 1000000
// Output
// Print 1, if there is an occurrence of the sum, else print 0.
// Example
// Sample Input
// 10 14
// 1 2 3 4 5 6 7 8 9 10

// Sample Output
// 1

// Explanation
// 10 + 4 = 14, so pair exists

// Sample Input
// 5 9
// 1 2 3 4 5

// Sample Output
// 1




import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }    

           boolean check = false;

           Arrays.sort(arr);
           int i=0;
           int j=n-1;
           while(i<j){
               if(arr[i] + arr[j] == sum){
                   check = true;
                   break;
               }
               else if(arr[i] + arr[j] < sum){
                   i++;
               }
               else{
                   j--;
               }
           }
           if(check ==true){
               System.out.println(1);
           }
           else{
               System.out.println(0);
           }
        }
}