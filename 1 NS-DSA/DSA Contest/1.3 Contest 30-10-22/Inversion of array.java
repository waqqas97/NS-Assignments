// Inversion of array


// medium
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Given an array of positive integers. The task is to find inversion count of array.

// Inversion Count : For an array, inversion count indicates how far (or close) the array is from being sorted. If array is already sorted then inversion count is 0. If array is sorted in reverse order that inversion count is the maximum.
// Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.

// Asked in Adobe, Amazon, Microsoft.
// Input
// The first line of each test case is N, the size of the array. The second line of each test case contains N elements.

// Constraints:-
// 1 ≤ N ≤ 10^5
// 1 ≤ a[i] ≤ 10^5
// Output
// Print the inversion count of array.
// Example
// Sample Input:
// 5
// 2 4 1 3 5

// Sample Output:
// 3

// Explanation:
// Testcase 1: The sequence 2, 4, 1, 3, 5 has three inversions (2, 1), (4, 1), (4, 3).



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static long merge(int a[], int l, int mid, int r){
        int temp[]= new int[r-l+1];
        int i=l;
        int j= mid+1;
        int k= 0;
        long count =0;
        while(i<=mid && j<=r){
            if(a[i]<= a[j]){
                temp[k++]= a[i++];
            }
            else{
                temp[k++]= a[j++];
                count+= mid-i+1;
            }
        }
        while(i<= mid){
            temp[k++]=a[i++];
        }
        while(j<=r){
            temp[k++]=a[j++];
        }
        for(k=0,i=l; k<temp.length; i++,k++){
            a[i]=temp[k];
        }
        return count;
    }
    static long mergeSort(int a[], int l, int r){
        long count =0;
        int mid=l+(r-l)/2;
        if(l>=r){
            return 0;
        }
        count+=mergeSort(a,l,mid);
        count+=mergeSort(a,mid+1,r);
        count+=merge(a,l,mid,r);
        return count;
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i]= sc.nextInt();
        }
        long count = mergeSort(a,0,a.length-1);
        System.out.println(count);
        }
}