// High Performers


// easy
// Problem Statement
// You are given an array of objects representing a group of students, each with a name and an array of test scores. Your task is to use map, filter, and reduce to calculate the average test score for each student, and then return an array of objects containing only the students who have an average score above 90.

// The array of objects that you will return should have the keys "name" and "average" which should contain the name and the average marks of the student if his average marks is greater than 90.
// Input
// The highPerformers function takes an array of objects as argument
// Output
// Return an array of objects containing only the students who have an average score above 90. The objects in the array should have the keys "name" and "average" which should contain the name and the average marks of the student if his average score is greater than 90.
// Example
// const students = [
// { name: "Ram", scores: [80, 95, 60] },
// { name: "Mohan", scores: [85, 70, 90] },
// { name: "Sai", scores: [60, 70, 80] },
// { name: "Hemang", scores: [95, 90, 94] },
// ];

// const res = highPerformers(students);
// console.log(res);
// // [ { name: 'Hemang', average: 93 } ]


function highPerformers(students){
    let finalPayload=students.filter((obj)=>{
        let averageScore = averageScoreCalculation(obj.scores);
        if(averageScore>90){
            return true;
        }
        else{
            return false;
        }
    }).map((obj)=>{
          return{
            name:obj.name,
            average:averageScoreCalculation(obj.scores)
          }
    });
    return finalPayload;
}
function averageScoreCalculation(input){
    let sum = input.reduce((a,b)=>{
               return a+b;
        });
     return sum/input.length
}



// <script>
//     const students = [
// { name: “Ram”, scores: [80, 95, 60] },
// { name: “Mohan”, scores: [85, 70, 90] },
// { name: “Sai”, scores: [60, 70, 80] },
// { name: “Hemang”, scores: [95, 90, 94] },
// ];
// function highPerformers(students){
//     let finalPayload=students.filter((obj)=>{
//         let sum = obj.scores.reduce((a,b)=>{
//                return a+b;
//         });
//         let averageScore = sum/obj.scores.length;
//         if(averageScore>90){
//             return true;
//         }
//         else{
//             return false;
//         }
//     });
//     return res;
// }
// const res = highPerformers(students);
// console.log(res);
// </script>