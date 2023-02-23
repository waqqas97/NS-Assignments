Count arrays
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given two integers P and N, your task is to count the possible number of arrays which satisfies these Four rules:-
The size of the array is less than equal to N and greater 0.
Each array element is a prime number
Product of the value of all the array elements is less than or equal to P.
Array formed is palindromic
Input
The first line of input contains a single integer P, and the following line of input contains a single integer Q denoting the number of queries. The following line of input contains Q space-separated integers each depicting the value of N.

Constraints:-
1 <= P <= 105
1 <= N <= 105
1 <= Q <= 105
Output
Print Q space separated integers which donates the answer for the ith Query.
Example
Sample Input:-
10
2
3 6

Sample Output:-
7 7

Explanation:-
For N = 3
2
3
5
7
2 2
3 3
2 2 2

For N = 6
2
3
5
7
2 2
3 3
2 2 2