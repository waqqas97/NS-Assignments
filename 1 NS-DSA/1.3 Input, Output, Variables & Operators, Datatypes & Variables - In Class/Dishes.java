// Problem Statement:
// Sheldon and Leonard are gone for lunch but none of them have money so they decided to wash dishes. In total, they washed T dishes from which N dishes are washed by Leonard. Now Leonard wants to know the number of dishes Sheldon washed. Help him to find it.

// Input:
// The first line of the input contains N and T

// Constraints:
// 1 <= N <= T <= 1000

// Output:
// Return the number of dishes Sheldon washed.

// Example:
// Sample Input: 1
// 3 6

// Sample Output: 1
// 3

// Sample Input: 2
// 2 4

// Sample Output: 2
// 2



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class Dishes 
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int S = T - N;
        System.out.println(S);
    }
}