// Median of Two sorted Arrays

// medium
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Given two sorted arrays A and B of size n and m respectively, return the median of the two sorted arrays.
// Input
// The first line of input contains n, m the length of arrays A and B.
// The next two lines contain the input of arrays A and B.

// Constraints
// 1 ≤ n, m ≤ 1000
// -106 ≤ A[i], B[i] ≤ 106
// Output
// Print the median of two sorted arrays upto two decimal places.
// Example
// Sample Input :
// 2 1
// 1 3
// 2

// Sample Output :
// 2.00



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int A[] = new int[n];
        int B[] = new int[m];
        for(int i=0; i<n; i++){
          A[i]= sc.nextInt();
        }
        for(int j=0; j<m; j++){
          B[j] = sc.nextInt();        
        }
        int C[] = new int[n+m];
        for(int i=0; i<C.length; i++){
          if(i<n){
            C[i] = A[i];
          }
          else{
            C[i] =B[i-n];
          }
        }
        Arrays.sort(C);

        //for even
        if((n+m)%2==0){
          int x= ((n+m)/2);
          System.out.printf("%.2f ", ((double)C[x-1]+C[x])/2);
        }
        //for odd
        else{
          int x= ((n+m+1)/2);
          x = x-1;
          System.out.printf("%.2f ",(double)C[x]);
        }
    }
}