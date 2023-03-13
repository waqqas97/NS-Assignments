// Sum of Product of Digits of a given number



// easy
// Problem Statement
// You are given two numbers n1 and n2. You need to find the sum of the products of their corresponding digits. So, for a number n1= 6 and n2 = 34, you'll do (6*4)+(0*3) = 24.
// Input
// User Task:
// Since this will be a functional problem, you don't have to take input. You just have to complete the function sumOfProductOfDigits() that takes the integers n1 and n2 as a parameter.

// To custom test the function, provide input in the following manner:
// 1st line will contain the number of test cases, let's say t
// Then there will be t lines, each line having two numbers n1 and n2, separated by space

// Constraints:
// 1 <= T <= 100
// 0 <= n1, n2 <= 10^6
// Output
// Return the sum of product of corresponding digits of n1 and n2.
// Example
// Sample Input:
// 2
// 9 0
// 35 6798

// Sample Output:
// 0
// 67

// Explanation:-
// For test 2:-
// (8*5) + (9*3) + (7*0) + (6*0) = 67



function sumOfProductOfDigits(n1, n2)
{
         // Your code here
         let str1=n1.toString();
         let str2=n2.toString();
         let size=Math.max(str1.length,str2.length);
         let str3=str1.padStart(size,'0');
         let str4=str2.padStart(size,'0');
         let sum=0;
         for(let i=size-1;i>=0;i--){
             sum+=str3.charAt(i)*str4.charAt(i);
         }
         return sum;
}