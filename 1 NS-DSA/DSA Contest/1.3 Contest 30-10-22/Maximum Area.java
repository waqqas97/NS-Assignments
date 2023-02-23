// Maximum Area


// medium
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Saurabh has a paper of size N*M and some horizontal and vertical lines in the form of arrays. Saurabh wants to know the maximum area which is trapped inside the lines.

// Note:- Consider the boundary of the paper to be vertical and horizontal lines. Also consider 0 indexing
// Input
// The first line of input contains 4 space separated integers depicting N, M, size of array contains horizontal lines(H), size of array containing vertical lines(V). The second line contains H space separated integers depicting horizontal lines. Last lines contains V space separated integers depicting vertical lines.

// Constraints:-
// 1 <= N, M <= 1000000000
// 1 <= H, V <= 100000
// 0 <= horizontal lines <= N
// 0 <= vertical lines <= M
// Output
// Print the maximum area trapped between the lines
// Example
// Sample Input:-
// 5 4 3 2
// 1 2 4
// 1 3

// Sample Output:-
// 4

// Explanation:-
// The area is- (2,1), (2,3) (4,1) (4,3)

// Sample Input:-
// 5 4 2 1
// 3 1
// 1

// Sample Output:-
// 6


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int w=sc.nextInt();
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] horizontal=new int[n];
        int[] vertical = new int[m];
        for(int i=0;i<n;i++){
            horizontal[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            vertical[i]=sc.nextInt();
        }
        int result = maxArea(h,w,horizontal,vertical);
            System.out.print(result);
    }
    public static int maxArea(int h,int w,int[] horizontalCuts,int[] verticalCuts){
        Arrays.sort(horizontalCuts);
        int maxHor=horizontalCuts[0];
        for(int i=1;i<horizontalCuts.length;i++){
            maxHor=Math.max(maxHor,(horizontalCuts[i]-horizontalCuts[i-1]));
        }
        maxHor = Math.max(maxHor,(h-horizontalCuts[horizontalCuts.length-1]));
        Arrays.sort(verticalCuts);
        int maxVer = verticalCuts[0];
        for(int i=1;i<verticalCuts.length;i++){
            maxVer=Math.max(maxVer,(verticalCuts[i]-verticalCuts[i-1]));
        }
        maxVer= Math.max(maxVer,(w-verticalCuts[verticalCuts.length-1]));
        long mod= 1_000_000_007;
        return (int)(((long)maxHor*(long)maxVer)%mod);
    }
}
