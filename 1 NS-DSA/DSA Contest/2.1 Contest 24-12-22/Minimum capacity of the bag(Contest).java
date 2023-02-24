// Minimum capacity of the bag(Contest)


// medium
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// There are N coins arranged in a row. Each coin has some values denoted by the array val where vali is value of the ith coin, 1 ≤ i ≤ N.
// Bob wants to collect some continuous set of coins so that the total value of all coins is at least X . Bob collects coins in a bag which has limited capacity and to get bag with more capacity the cost is more.
// Capacity of the bag is defined as the number of coins it can store.
// Bob wants to know the minimum capacity of bag which he can use to collect coins and achieve the target X.
// Input
// First line contains N and X.
// Next line contains N space separated integers.

// Constraints
// 1 ≤ N ≤ 105
// 1 ≤ val[i] ≤ 109
// 1 ≤ X ≤ sum of all coins
// Output
// A single integer denoting the minimum capacity of the bag.
// Example
// Input:
// 6 9
// 4 1 8 3 3 7

// Output:
// 2

// Explanation:
// He can take a bag with capacity 2 and collect coins { 3, 4 }.
// Total value = 8 + 3 = 11 ≥ 9



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long x=sc.nextInt();
        long arr[]=new long[n];
        for(int i=0; i<n; i++){
            arr[i] =sc.nextLong();
        }
        int p=0;
        long z=0;
        for(int i=n-1; i>=0; i--){
            if(z<x){
                z+=arr[i];
                p++;
            }
            else{
                break;
            }
        }
        int ans=1000000;
        for(int i=0; i<n-p;i++){
            int count=0;
            long max=0;
            for(int j=i; j<n; j++){
                if(max>=x){
                    break;
                }
                else{
                    max+=arr[j];
                    count++;
                }
            }
            ans=Math.min(ans,count);
        }
        System.out.println(ans);
    }
}