// Count arrays

// easy
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Given two integers P and N, your task is to count the possible number of arrays which satisfies these Four rules:-
// The size of the array is less than equal to N and greater 0.
// Each array element is a prime number
// Product of the value of all the array elements is less than or equal to P.
// Array formed is palindromic
// Input
// The first line of input contains a single integer P, and the following line of input contains a single integer Q denoting the number of queries. The following line of input contains Q space-separated integers each depicting the value of N.

// Constraints:-
// 1 <= P <= 105
// 1 <= N <= 105
// 1 <= Q <= 105
// Output
// Print Q space separated integers which donates the answer for the ith Query.
// Example
// Sample Input:-
// 10
// 2
// 3 6

// Sample Output:-
// 7 7

// Explanation:-
// For N = 3
// 2
// 3
// 5
// 7
// 2 2
// 3 3
// 2 2 2

// For N = 6
// 2
// 3
// 5
// 7
// 2 2
// 3 3
// 2 2 2


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
      public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.valueOf(br.readLine());
        br.readLine();
        ArrayList<Integer> primes = prime(N);
        int[] arr = Arrays.stream(br.readLine().split(" ")).
        mapToInt(Integer::parseInt).toArray();
        int[] val = new int[21];
        for(int i=1;i<21;i++)
        {
            val[i] = fun((i+1)/2,i%2,1,N,primes);
        }
        for(int i=1;i<21;i++)
        {
            val[i] += val[i-1];
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<21) System.out.print(val[arr[i]]+" ");
            else System.out.print(val[20]+" ");
        }
    }
 
    public static int fun(int a, int b, int m, int p, ArrayList<Integer> list)
    {
        if(a==0) return 1;
        int out = 0;
        for(int i=0;i<list.size();i++)
        {
            if(b==1)
            {
                if(m*list.get(i)<=p) {out+=fun(a-1,0,m*list.get(i),p,list);}
                else {break;}
            }
 
            else
            {
                if(m*list.get(i)*list.get(i)<=p) 
                {out+=fun(a-1,0,m*list.get(i)*list.get(i),p,list);}
                else {break;}
            }
        }
        return out;
    }
 
    public static ArrayList<Integer> prime(int x)
    {
        int[] arr = new int[x+1];
        ArrayList<Integer> out = new ArrayList<Integer>();
        for(int i=2;i<=x;i++)
        {
            if(arr[i]==0)
            { 
                out.add(i);
                for(int j=i;j<=x;j+=i)
                {
                    arr[j] = 1;
                }
            }
        }
        return out;
    }
}