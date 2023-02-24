// Array Properties


// easy
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Complete the function convertTheArray which accepts two parameters which are an array and a word.
// It returns a new array where all the array elements are converted to lowercase and then the second parameter which is a string word is concatenated to each element of the array.

// Note for passing input in Sample Output generator

// Type the word
// Hit Enter
// Type words separated by space
// Input
// The function will take two arguments

// 1) 1st argument will be a string
// 2) 2nd argument will be strings separated by space containing a combination of upper case and lower case letters in it
// Output
// The function will return an array of strings
// Example



// const word="KHAN"

// const arr=[ 'SaifAli', 'ShahRukh', 'Salman' ]

// const answer=convertTheArray(arr,word)

// //returns an array of concatenated words with array elements converted to lower case

// console.log(answer)

// //[ 'saifaliKHAN', 'shahrukhKHAN', 'salmanKHAN' ]





// const word="World"

// const arr=[ 'HeLLo', 'Bye', 'Bonjour' ]

// const answer=convertTheArray(arr,word)

// //returns an array of concatenated words with array elements converted to lower case

// console.log(answer)

// //[ 'helloWorld', 'byeWorld', 'bonjourWorld' ]




function convertTheArray(array,word){
    return array.map(element=> element.toLowerCase().concat(word));  
}