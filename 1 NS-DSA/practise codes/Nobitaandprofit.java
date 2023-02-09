// Problem Statement:
// Nobita wants to become rich so he came up with some ideas. 
// Nobita buys some gadgets from the future at a price of C and sells them at a price of S to his friends. 
// Now Nobita wants to know how much he gains by selling 1 gadget. 
// As we all know Nobita is weak in maths help him to find the profit he gets

// Input:
// The input contains two integer C and S separated by spaces.

// Constraints:-
// 1 <= C <= S <= 1000

// Output:
// Print the profit Nobita gets from selling one gadget.

// Example:
// Sample Input: 1
// 3 5

// Sample Output: 1
// 2

// Sample Input: 2
// 9 15

// Sample Output: 2
// 6



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class Nobitaandprofit
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        int S = sc.nextInt();
        int P = S - C;
        System.out.println(P);
    }
}