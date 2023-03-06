// Inversion count


// medium
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Calculate inversion count of array of integers.
// Inversion count of an array is quantisation of how much unsorted an array is. A sorted array has inversion count 0, while an unsorted array has maximum inversion count.
// Formally speaking inversion count = number of pairs i, j such that i < j and a[i] > a[j].
// Input
// The first line contain integers N.
// The second line of the input contains N singly spaces integers.

// 1 <= N <= 100000
// 1 <= A[i] <= 1000000000
// Output
// Output one integer the inversion count.
// Example
// Sample Input
// 5
// 1 1 3 2 2

// Sample Output
// 2

// Sample Input
// 5
// 5 4 3 2 1

// Sample Output
// 10




import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class Main {
    static long merge(int a[], int l, int m, int h){

        long count = 0;

        int n1 = m-l+1;
        int n2 = h-m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        //Copy values from a to L
        for(int i=0; i<n1; i++){
            L[i] = a[l+i];
        }

        //Copy values from a to R
        for(int i=0; i<n2; i++){
            R[i] = a[m+1+i];
        }

        //Merge back the values from L and R to a
        int i=0;
        int j=0;
        int k=l;

        while(i<n1 && j<n2){
            if(L[i] <= R[j]){
                a[k++] = L[i++];
            }
            else{
                a[k++] = R[j++];
                count = count + n1 - i;
            }
        }

        while(i<n1){
            a[k++] = L[i++];
        }

        while(j<n2){
            a[k++] = R[j++];
        }

        return count;
    }

    static long divide(int a[], int l, int h){
        int m = l + (h-l)/2;
        long count = 0;

        if(l < h){
            count += divide(a, l, m);
            count += divide(a, m+1, h);
            count += merge(a, l, m, h);
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++)
            a[i] = sc.nextInt();

        long inversionCount = divide(a, 0, n-1);
        
        System.out.println(inversionCount);
    }
}