// Maximum Frequency Character


// easy
// asked in interviews by 2 companies
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// You are given a string S of length N. Find the character which occurs the most number of times in this string. If there are mutliple such characters present, print -1.
// Input
// The first line of the input contains a single integer N.
// The second line of the input contains a string S.

// Constraints:
// 2 ≤ N ≤ 105
// All characters in string S are lowercase english letters.
// Output
// Print the character which occurs the most number of times in this string. If there are mutliple such characters present, print -1.
// Example
// Sample Input:
// 7
// abadcar

// Sample Output:
// a



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        sc.nextLine();
        String str=sc.nextLine();
        int a[]=new int[26];
        for(int i=0; i<n; i++){
            char ch =str.charAt(i);
            int idx=ch- 'a';
            a[idx]++;
        }
        int maxcount=0;
        int secondmax=0;
        int count=0;
        int idx = 0;
        for(int i=0; i<26; i++){
            if(a[i]>maxcount){
            secondmax= maxcount;
            maxcount=a[i];
            idx=i;
        }
        else if(a[i]>secondmax){
            secondmax=a[i];
        }
    }
    if(secondmax==maxcount){
        System.out.println(-1);
    }
    else
    {
        for(int i=0; i<n; i++){
            char ch =str.charAt(i);
            if(ch- 'a'== idx){
                System.out.println(ch);
                break;
            }
        }
    }
}
}