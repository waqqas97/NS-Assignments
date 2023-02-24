// Max arrangement score (Contest )


// medium
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// There are N numbers arranged in a queue. Score of the arrangement is defined as the sum of first K numbers of the queue.
// You can remove one number from the front of the queue and move it to the end of the queue. You can do this as many times as you want. What is the maximum score of any arrangement you can achieve?
// Input
// First line contains N and K.
// Next line contains N space separated integers denoting the current arrangement of the queue.

// Constraints
// 1 ≤ K ≤ N ≤ 105
// 1 ≤ arr[i] ≤ 109
// Output
// Print a single integer denoting the maximum score of any arrangement.
// Example
// Input:
// 6 3
// 2 5 6 2 6 1

// Output:
// 14

// Explanation:
// initial => 2 5 6 2 6 1 => score = 2 + 5 + 6 = 13
// 1st operation => 5 6 2 6 1 2 => score = 5 + 6 + 2 = 13
// 2nd operation => 6 2 6 1 2 5 => score = 6 + 2 + 6 = 14



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k= sc.nextInt();
        long a[] = new long[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextLong();
        }
        long sum =0;
        for(int i=0; i<k; i++){
            sum+=a[i];
        }
        long max=sum;
        for(int i=0; i<n; i++){
            long temp = a[0];
            for(int j=0; j<n-1; j++){
                a[j] = a[j+1];
            }
            a[n-1]=temp;
            sum=0;
            for(int l=0; l<k; l++){
                sum+=a[l];
            }
            if(sum>max){
                max=sum;
            }
        }
        System.out.println(max);
    }
}