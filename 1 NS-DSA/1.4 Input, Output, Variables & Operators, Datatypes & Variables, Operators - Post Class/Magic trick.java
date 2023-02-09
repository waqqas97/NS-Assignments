// Problem Statement:
// Sara is trying a new magic trick on you, The magic trick goes in 6 steps:-
// 1. Think of a number X(don't tell Sara)
// 2. Add A(Given by Sara) to it.
// 3. Double the sum in your mind.
// 4. Add an even number B(Given by Sara) to it.
// 5. Half the amount
// 6. Subtract the initial number which you had taken from the sum
// After this Sara will tell the resulting amount without knowing the initial number, 
// can you print the result for her?

// Input:
// Input Contains two integers A and B separated by spaces.

// Constraints:
// 1 <= A, B <= 1000

// Output:
// Print the resulting amount

// Example:
// Sample Input: 1
// 3 4

// Sample Output: 1
// 5

// Sample Input: 2
// 8 4

// Sample Output: 2
// 10



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       int X = sc.nextInt();
       int A = sc.nextInt();
       int S = X+A;
       S = 2*S;
       int B = sc.nextInt();
       B = (B%2==0);
       S = S+B;
       S = S/2;
       S = S-X;
       System.out.println(S);
       
    }
}