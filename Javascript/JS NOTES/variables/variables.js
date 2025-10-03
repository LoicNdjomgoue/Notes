// variable = A container that stores a value.
// Behaves as if it were the value it contains.

/* 
1. declaration let x;
2. assignment  x = 100;
*/

let x;
x = 100;
console.log(x);

let y = 200;
console.log(y);

// Use + to join strings (remember to add spaces manually)
// Use backticks ` ` with ${variable} for easier formatting and automatic spacing
// backticks are above left tab on the
let food = "steak";
console.log(`my favorite food is ${food}`);
console.log("I enjoy eating" + " " + food);

//output here is 100200 (no space in between)
console.log("100" + y);

let fullName = "Jeff Hardy";
let age = 23;
let isStudent = false;

document.getElementById("p1").textContent = `Your name is ${fullName}`;
document.getElementById("p2").textContent = `You are ${age} years old`;
document.getElementById("p3").textContent = `Enrolled: ${isStudent}`;
