// JS Closure Counter


// hard
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Complete the function countBy
// Such that it takes a initial number which is the defualt value of out counter. And returns
// a function which also takes a number and returns the initialCount + number supplied to second function.

// Ex:-

// const count = countBy(4) // initial value of counter 4, returns a function

// console. log(count(2)) // prints 6 because 4 + 2

// console. log(count(-4)) // prints 2 because 6 - 4

// console. log(count(8)) // prints 10 because 2 + 8



// You have to return implement countBy function such that it can be run like that.
// Input
// countBy will take one number as input which will be the initial count.
// Output
// countBy will return a function which can be run many times and takes a number as input and returns the sum of it with previously maintained counter values
// Example

// const count = countBy(4) // initial value of counter 4, returns a function

// console. log(count(2)) // prints 6 because 4 + 2

// console. log(count(-4)) // prints 2 because 6 - 4

// console. log(count(8)) // prints 10 because 2 + 8




function countBy(initial){

    // return the output using return keyword
    // do not console.log it
    return function(num){
        initial =initial+num;
        return initial;
    }

}