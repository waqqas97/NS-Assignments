// Tickets to college


// easy
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Classes at NITAP(the name of the college) are finally starting after the summer break, and students have to reach the campus to avoid the late fine of Rs 500 for semester registration. Mohan, Shreya, and Anuj live in the same town. They are deciding on a date to book their train ticket. Everyone has a demand.
// • Mohan wants the ticket at least on date A.
// • Shreya wants the ticket at most by date B.
// • Anuj wants the ticket at least on date C.
// If all three of them can get the ticket on the same day, then print "YES" otherwise "NO".
// Input
// The first line of input contains a single integer T, the number of test cases.
// Each test case contains three space-separated integers A, B, and C

// Constraints
// 1 ≤ T ≤ 105
// 1 ≤ A, B, C ≤ 31
// Output
// For each testcase, output a line containing YES or NO.
// Example
// Sample Input
// 4
// 13 16 12
// 14 15 16
// 13 16 16
// 15 13 17

// Sample Output
// YES
// NO
// YES
// NO


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(b>= Math.max(a,c))
            System.out.println("YES");
            else
            System.out.println("NO");
        }
    }
}