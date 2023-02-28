// Divisibilty by 


// medium
// hint
// Hint

// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Given an n-digit large number in form of string, check whether it is divisible by 7 or not. Print 1 if divisible by 7, otherwise 0.
// Input
// There is a number num is given in input.

// Constraint:
// 1 ≤ |num| ≤ 10^5
// Output
// Print 1 if num is divisible by 7, otherwise 0.
// Example
// Sample Input:
// 8955795758

// Sample Output:
// 1




import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.math.*;

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        BigInteger num = new BigInteger(str);
        BigInteger seven = new BigInteger("7");
        BigInteger zero = new BigInteger("0");
        
        BigInteger remainder = num.mod(seven);
        // System.out.println(remainder);

        if(remainder.equals(zero))
            System.out.println(1);
        else
            System.out.println(0);

    }
}