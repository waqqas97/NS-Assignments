// Sum Subarray



// medium
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// You are given an array Arr of N integers. A subarray is good if the sum of elements of that subarray is greater than or equal to K. Print the length of good subarray of minimum length.
// Input
// First line of input contains N and K.
// Second line of input contains N integers representing the elements of the array Arr.

// Constraints
// 1 <= N <= 100000
// 1 <= Arr[i] <= 100000
// 1 <= K <= 1000000000000
// Output
// Print the length of good subarray of minimum length.
// Example
// Sample input
// 5 12
// 2 3 2 5 5

// Sample output
// 3

// Explanation :
// Subarray from index 3 to 5 has sum 12 and is therefore good and its length(3) is minimum among all possible good subarray.



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static int smallestSubWithSum(long arr[], int n, long x)
{
    //Initialize current sum and minimum length
    long curr_sum = 0; int min_len = n+1;
    //Initialize starting and ending indexes
    int start =0, end=0;
    while(end<n){
      //keep adding array element while current sum
      //is smaller than or equal to x
      while (curr_sum < x && end < n)
      curr_sum += arr[end++];

      //if current sum becomes greater than x.
      while (curr_sum >= x && start < n){
        //update minimum length if needed 
        if(end - start < min_len)
        min_len = end -start;
        
        //remove starting elements
        curr_sum -= arr[start++];
      }    
    }
    return min_len;
  }
public static void main (String[] args)throws IOException {
        // Your code here
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        long x = Long.parseLong(s[1]);

        long[] arr = new long[n];
        String[] d = br.readLine().split(" ");
        for(int i=0; i<n; i++){
          arr[i] = Long.parseLong(d[i]);
        }
        int min_len = smallestSubWithSum(arr,n,x);
        System.out.print(min_len);


    }
}