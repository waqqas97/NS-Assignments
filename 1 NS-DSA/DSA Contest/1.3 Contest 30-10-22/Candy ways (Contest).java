// Candy ways (Contest)


// medium
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Given N candies of different colors. Find the number of different ways of selecting 1 or more candies such that the number of candies you select is not A or B.
// Note:Two selecting ways are different if there is a candy of a particular color in only one of the selections.
// As the answer can be the huge print answer 109+7.
// Input
// The input contains three integers: N, A, and B.

// Constratins:
// 3 ≤ N ≤ 109
// 1 ≤ A < B ≤ min(N, 105)
// Output
// Print answer 109+7.
// Example
// Sample Input:
// 4 2 4

// Sample Output:
// 8

// Explanation:
// (1) (2) (3) (4) (1, 2, 3) (1, 3, 4) (1, 2, 4) (2, 3, 4)


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static long mod=1000000007L;
    static long modpow(long a,long n){
       if (n == 0) return 1;
       if (n == 1) return a % mod;
       if (n%2==1) return (a*modpow(a,n-1))%mod;
       long t = modpow(a,n/2);
       return (t*t)%mod;
    }
    static long modcmb(long l, long r) {
        long x=1,y=1;
        for(int i = 0; i < (int)(r); i++){
            x=(x*(l-i))%mod;
            y=(y*(i+1))%mod;
        }
        return (x*modpow(y,mod-2))%mod;
    }
    
	public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        long ans=modpow(2,n)-1;
        long c=modcmb(n,a);
        long d=modcmb(n,b);
        ans=(ans-c+mod)%mod;
        ans=(ans-d+mod)%mod;
        System.out.println(ans);
	}
}