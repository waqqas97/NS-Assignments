// Fixing the Middle


// easy
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// You are given a number N. You need to Fix the middle bit of N in binary form and print the result in decimal form.

// If number of bits in binary form of N are odd then Fix the middle bit (Like 111 to 101).
// If number of bits in binary form of N are even then Fix both the middle bits (Like 1111 to 1001)

// Note: Fixing a bit means converting a 0 to 1 and vice versa.
// Input
// The first line of input contains T denoting the number of test cases. T test cases follow. Each test case contains a single number N.

// Constraints:
// 1 <= T <= 100
// 1 <= N <= 1000000
// Output
// For each test case, in a new line, print the decimal form after toggling the middle bit of N.
// Example
// Input:
// 5
// 1
// 2
// 3
// 4
// 5

// Output:
// 0
// 1
// 0
// 6
// 7

// Examples:
// Test case 3: N = 3. Binary is 11. Toggle the middle bits: 00. 00 in decimal is 0
// Test case 5: N = 5. Binary is 101. Toggle the middle bit: 111. 111 in decimal is 7


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int ans=0;
            int count=0;
            int m=n;
            while(m>0){
                m=(m>>1);
                count++;
            }
            if(n==1){
                System.out.println(0);
            }
            else if(n==2){
                System.out.println(1);
            }
            else if(count==2){
                System.out.println(0);
            }
            else if(count%2==1){
                count=count/2;
                ans=n^(1<<count);
                System.out.println(ans);
            }
            else{
                count=count/2;
                int x=1<<count;
                int y=1<<count-1;
                ans=n^(x|y);
                System.out.println(ans);
            }
        }
    }
}