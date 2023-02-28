// Resultant String


// easy
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// You are given two binary strings of length N. You have to output a resultant string. The resultant string will be calculated in the following way:

// - > For every position i, if the ith character of the first string is '1' and the second string is '0', the resultant string will have '1'. Also, for every position i, if the ith character of the first string is '0' and the second string is '1', the resultant string will have '1'. Rest, all the characters of the resultant string will be '0'. Find the resultant string;
// Input
// The first line of the input contains a single integer N.
// The next two lines of the input will contain a string of size N each.

// Constraints:
// 1 <= N <= 105
// All characters of the string will be either '1' or '0'
// Output
// Print the resultant string.
// Example
// Sample Input:
// 5
// 10110
// 01101

// Sample Output:
// 11011



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str1 = sc.next();
        String str2 = sc.next();
        int result[] = new int[n];
        for(int i=0; i<n; i++){
          if(str1.charAt(i) != str2.charAt(i)){
            result[i] =1;
          }
          else{
            result[i]=0;
          }
        }
        for(int i=0; i<n; i++){
          System.out.print(result[i]);
        }
  }
}