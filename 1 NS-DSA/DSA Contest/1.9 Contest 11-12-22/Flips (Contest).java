// Flips (Contest)



// easy
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// You have N coins with either an integer (between 0-9) written on one side and an english letter (a- z) written on the other side.

// The following statement must be true for all coins:
// If the coin has a vowel on one side, then it must have an even integer on other side.

// For example coin having 'b' and '3' is valid (since 'b' is not a vowel, other side can be anything), coin having 'a' and '4' is valid, but coin having 'a' and '5' is invalid.

// Now you're given just one side of each coin, find the minimum number of coins you need to flip to check the authenticity of the statement.
// Input
// The first and only line of input contains a string S, where each character in S depicts a side of the coin.


// Constraints:
// 1 ≤ |S| ≤ 50
// Output
// Output a single integer, the minimum number of coins you need to flip.
// Example
// Sample Input
// ee

// Sample Output
// 2

// Explanation: You need to flip both the coins to make sure an even integer is there on the other side of coin.

// Sample Input
// 0ay1

// Sample Output
// 2





import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int n= str.length();
    int ans =0;
    for(int i=0; i<n; i++){
        if(str.charAt(i)=='a'||
        str.charAt(i) == 'e' ||
        str.charAt(i) == 'i' ||
        str.charAt(i) == 'o' ||
        str.charAt(i) == 'u' ||
        str.charAt(i) == '1' ||
        str.charAt(i) == '3' ||
        str.charAt(i) == '5' ||
        str.charAt(i) == '7' ||
        str.charAt(i) == '9' ){
            ans++;
        }
    }
    System.out.print(ans);
    }
}