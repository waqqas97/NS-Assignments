// Factorial - Recursion


// easy
// asked in interviews by 16 companies
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Find factorial of a given number N.
// Input
// User Task
// Since this is a functional problem, you don't have to worry about the input. You just have to complete the function Factorial() which contains the given number N.

// Constraints:
// 1 <= N <= 15
// Output
// Return the factorial of the given number.
// Example
// Sample Input:-
// 5

// Sample Output:-
// 120

// Sample Input:-
// 3

// Sample Output:-
// 6



// n is the input number
function factorial(n) {
    // write code here
    // do not console.log
    // return the answer as a number
    if (n>=1)
        return n* factorial(n-1);
    else
        return 1 ;
}