// Three way partitioning



// easy
// Problem Statement
// Given an array A[] and a range [a, b]. The task is to partition the array around the range such that array is divided into three parts.
// 1) All elements smaller than a come first.
// 2) All elements in range a to b come next.
// 3) All elements greater than b appear in the end.
// The individual elements of three sets can appear in any order. You are required to return the modified arranged array.

// Note:-
// In the case of custom input, you will get 1 if your code is correct else get a 0.
// Input
// User Task:
// Since this is a functional problem you don't have to worry about the input. You just have to complete the function threeWayPartition() which contains following arguments.

// A: input array list
// low: starting integer of range
// high: ending integer of range

// Constraints:
// 1 <= T <= 100
// 1 <= N <= 104
// 1 <= A[i] <= 105
// 1 <= low <= high <= 105

// The Sum of N over all test case doesn't exceed 10^5
// Output
// For each test case return the modified array.
// Example
// Sample Input:
// 2
// 5
// 1 8 3 3 4
// 3 5
// 3
// 1 2 3
// 1 3

// Sample Output:
// 1 3 3 4 8
// 1 2 3

// Explanation:
// Testcase 1: First, the array has elements less than or equal to 3. Then, elements between 3 and 5. And, finally elements greater than 5. So, one of the possible outputs is 1 3 3 4 8.
// Testcase 2: First, the array has elements less than or equal to 1. Then, elements between 1 and 3. And, finally elements greater than 3. So, the output is 1 2 3.



public static ArrayList<Integer> threeWayPartition(ArrayList<Integer> A, int lowVal, int highVal)
{
	// Your code here
  int low =0, mid=0, high = A.size() -1;

  while (mid<=high){
    int value;

    //satisfying condition 1
    if(A.get(mid) < lowVal)
      value =0;

    //satisfying condition 2
    else if (A.get(mid)>= lowVal && A.get(mid)<= highVal)
    value =1;

    //satisfying condition 3
    else 
      value =2;

    switch (value){

      //incase of first condition, do this
      case 0:
        Collections.swap(A, mid, low);
        mid++;
        low++;
        break;

      //incase of second condition, do this
      case 1:
        mid++;
        break;

      // incase of third condition, do this
      case 2:
      Collections.swap(A,mid,high);
      high--;
      break;
    }
  }
  return A;
}