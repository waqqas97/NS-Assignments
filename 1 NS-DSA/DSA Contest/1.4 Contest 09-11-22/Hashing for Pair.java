// Hashing for Pair


// easy
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// You are given an array A (distinct integers) of size N, and you are also given a sum. You need to find if two numbers in A exists that have sum equal to the given sum.
// Input
// The first line of input contains T denoting the number of testcases. T testcases follow. Each testcase contains two lines of input. The first line contains N denoting the size of the array A and target sum. The second line contains N elements of the array.

// Constraints:
// 1 <= T <= 100
// 1 <= N <= 10^4
// 1 <= sum <= 10^5
// 1 <= A[i] <= 10^4
// Output
// For each testcase, in a new line, print "1"(without quotes) if any pair found, othwerwise print "0"(without quotes) if not found.
// Example
// Sample Input
// 2
// 10 14
// 1 2 3 4 5 6 7 8 9 10
// 2 10
// 2 5

// Sample Output
// 1
// 0

// Explanation:
// Testcase 1: arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} and sum = 14. There is a pair {4, 10} with sum 14.
// Testcase 2: arr[] = {2, 5} and sum = 10. There is no pair with sum 10.



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main 
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int  t = sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            HashMap<Integer, Integer>map=new HashMap<>();
            for(int i=0; i<n; i++)
            {
                int a=sc.nextInt();
                map.put(i,a);
            }
            boolean flag=false;
            for(int i=0; i<n; i++)
            {
            int def=k-map.get(i);
            if(map.containsValue(def) && def!=map.get(i))
            {
                flag= true;
                break;
            }
            }
        if(flag) System.out.println(1);
        else
        System.out.println(0);
        }
    }
}