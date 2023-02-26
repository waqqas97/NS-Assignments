// Sum of several arrays


// easy
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// You will be given an array of several arrays that each contain integers and your goal is to write a function that
// will sum up all the numbers in all the arrays. For example, if the input is [[3, 2], [1], [4, 12]] then your
// program should output 22 because 3 + 2 + 1 + 4 + 12 = 22
// Input
// An array containing arrays which can contain any number of elements.
// Output
// Sum of all the elements in all of the arrays.
// Example
// Sample input:-
// [[3, 2], [1], [4, 12]]

// Sample output:-
// 22

// Explanation:-
// 3 + 2 + 1 + 4 + 12 = 22


function sum_array(array){
    let result = 0;
    for(let i=0;i<array.length;i++){
        for(let j=0;j<array[i].length;j++){
            result+=array[i][j];
        }
    }
    console.log(result);
}