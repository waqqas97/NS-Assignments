// Max-Min addition


// easy
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// You are given a positive integer A. You have to apply the following operation on it N times:
// Let the maximum and minimum digits in the decimal representation of A be mx and mn respectively.
// Add mx*mn to A, i. e, convert A to A + mx*mn.
// Find the value of A after applying this operation N times.
// Input
// First and the only line of the input contains two integers A and N.

// Constraints:
// 1 <= A <= 1018
// 1 <= N <= 1016
// Output
// Print the value of A after applying the above operation N times.
// Example
// Sample Input
// 8 3

// Sample Output
// 134

// Explaination:
// During the first operation, mx = 8, mn = 8.
// A = 8 + (8*8) = 8 + 64 = 72
// During the second operation, mx = 7, mn = 2
// A = 72 + (7*2) = 72 + 14 = 86
// During the final operation, mx = 8, mn = 6
// A = 86 + (8*6) = 86 + 48 = 134



import java.util.*; // contains Collections framework
// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
		long num = sc.nextLong();
		long op = sc.nextLong();
	
		System.out.println(num(num, op));
	}
public static long num(long N, long K)
{
    if (K == 1)
    {
        return N;
    }
    K--;
    long answer = N;
    while(K != 0)
    {
        long current = prod(answer);
        if (current == 0)
            break;
        answer += current;
    }
    return answer;
}
static long prod(long n)
{
    long mx = 0;
    long mn = 10;
    while(n != 0)
    {
        long r = n % 10;
        mx = Math.max(r, mx);
        mn = Math.min(r, mn);
        n = n / 10;
    }
    return mx * mn;
}
	
}