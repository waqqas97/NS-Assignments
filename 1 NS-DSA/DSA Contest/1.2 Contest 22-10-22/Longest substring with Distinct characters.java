// Longest substring with Distinct characters


// medium
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Given a string S, you have to find the length of the longest substring of S such that all characters are unique in the substring i.e no character is repeating within that substring.

// For example, for input string S = "abcama", the output is 3 as "abc" is the longest substring with distinct characters.
// Input
// The first line of input contains an integer T denoting the number of test cases.
// The first and the only line of each test case contains the string S.

// Constraints:
// 1 ≤ T ≤ 100
// 1 ≤ length of S ≤ 1000
// Output
// Print length of longest substring having such that all characters are unique .
// Example
// Sample Input:
// 2
// abababcdefababcdab
// gccksfvrgccks

// Sample Output:
// 6
// 7


import java.util.*;
import java.io.*;

class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            int result = 0;
            for(int i=0; i<s.length(); i++){
                int count = 1;
                for(int j=i+1; j<s.length(); j++)
                if(s.substring(i, j).contains(String.valueOf(s.charAt(j))))
                break;
                else
                count++;
                result = Math.max(result, count);
            }
            System.out.println(result);
        }
    }
}