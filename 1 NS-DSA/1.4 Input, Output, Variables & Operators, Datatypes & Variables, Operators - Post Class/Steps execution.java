// Problem Statement:
// Take 4 digit number input from the user, add 8 to it and then divide it by 3(Only take integer part) Now, 
// the modulus of that number is taken with 5 and then multiply the resultant value by 5. 
// Display the final result.

// Input:
// First line contains 4 digit number

// Constraints:
// 1000 <= number <= 9999

// Output:
// Print the final result

// Example:
// Sample Input : 1
// 2345

// Sample Output : 1
// 20



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class Stepsexecution 
{
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int r = n+8;
    r = r/3;
    r = r%5;
    r = r*5;
    System.out.println(r);
    }
}
