// Substring Reversal


// easy
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Given a string S. The letters are numbered from 1 to |S| from left to right. You have to perform M operations. In each operation, you will be given a number Pi. You need to reverse the substring from Pi to |S| - Pi + 1. Print the final string after all the operations.

// It is guaranteed that 2*Pi <= |S|

// |S| denotes the length of string S
// Input
// The first line contains a string S. Second line contains a single integer M. Third line contains M space separated integers denoting the value of Pi.

// 1 <= |S| <= 100000
// 1 <= M <= 100000
// 1 <= Pi <= ceil(|S|/2)
// Output
// Print a single line containing the final string after all the operations
// Example
// Sample Input:
// abcdef
// 3
// 1 2 3

// Sample Output:
// fbdcea

// Explanation:
// After 1st step, S = fedcba
// After 2nd step, S = fbcdea
// After 3rd step, S = fbdcea


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n= sc.nextInt();
        int a1[]= new int[n];
        for(int i=0; i<n; i++){
            a1[i] = sc.nextInt();
        }
        char ch[] = str.toCharArray();
        int a2[] = new int[ch.length/2];
        for(int i=0; i<n; i++){
            for(int j=a1[i]-1; j<a2.length; j++){
                a2[j]++;
            }
        }
        int chlen = ch.length;
        for(int i=0; i<chlen/2; i++){
            if(a2[i] % 2 !=0){
                char temp = ch[i];
                ch[i] = ch[chlen-i-1];
                ch[chlen-i-1] = temp;
            }
        }
        String str2 = String .valueOf(ch);
        System.out.print(str2);
    }
}