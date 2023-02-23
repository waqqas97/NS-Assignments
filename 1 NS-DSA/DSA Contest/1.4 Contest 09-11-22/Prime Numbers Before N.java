// Prime Numbers Before N


// medium
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Find the number of prime numbers before N (Including that number too).
// Input
// The first line of the input contains the number of test cases T.
// Next T lines contain the value N.

// Constraints
// 1 <= T <= 1e5
// 1 <= N <= 1e5
// Output
// Print the number of primes number before that number.
// Example
// Sample Input 1:
// 2
// 3
// 11

// Sample Output 1:
// 2
// 5


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        boolean bool[] = new boolean[100001];
        for(int i=0; i<100001; i++){
            bool[i] = true;
        }
        int sqrt = (int)Math.sqrt(100001);
        for(int i=2; i<=sqrt; i++){
            if(bool[i] == true){
                for(int j=i*i; j<100001; j=j+i){
                    bool[j] = false;
                }
            }
        }
        int c[] = new int[100001];
        c[2] = 1;
        for(int i=3; i<100001; i++){
            if(bool[i]){
                c[i] = c[i-1] + 1;
            }
            else{
                c[i]= c[i-1];
            }
        }
        while(t-->0){
            int n = sc.nextInt();
            int count = c[n];
            System.out.println(count);
        }
    }
}