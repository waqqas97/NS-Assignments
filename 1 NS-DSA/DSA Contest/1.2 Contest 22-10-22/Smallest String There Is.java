// Smallest String There Is


// easy
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Given a positive integer N, construct a string of length N such that no two adjacent characters are the same. Among all possible strings, find the lexicographically minimum string.
// Note: You can use only lowercase characters from 'a' to 'z'.
// Input
// The first and only line of input contains an integer N.

// Constraints:
// 1 <= N <= 105
// Output
// Print the required string.
// Example
// Sample Input 1:
// 1

// Sample Output 1:
// a

// Sample Input 2:
// 2

// Sample Output 2:
// ab

import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        StringBuilder str = new StringBuilder("a");

        if(n>1){
            for(int i=1; i<n; i++){
                if(str.charAt(str.length()-1) =='a'){
                    str.append("b");
                }
                else{
                    str.append("a");
                }
            }
        }
        System.out.print(str);
    }
}