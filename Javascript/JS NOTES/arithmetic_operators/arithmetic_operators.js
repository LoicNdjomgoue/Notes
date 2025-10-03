// arithmetic operators = operands (values, variables, etc.)
//                                         operators (+ - * /)
//                                         ex. 11 = x + 5;

let students = 30;

students = students + 10;
students = students - 2;
students = students * 5;
students = students / 4;
students = students ** 2; // ( ** ) = exponent so the power to that number
students = students % 2; // ( % ) = remainder

//augmented assignment operators ( just another way to write whats above)
let teacher = 100;

teacher += 1;
teacher -= 1;
teacher *= 1;
teacher /= 1;
teacher **= 1;
teacher %= 1;

//increment/decrement operators
let school = 50;

school++;
school--;

//operator precedence
/*
    1. parenthesis()
    2. exponents ^
    3. multiplication & division & module
    4. addition & subtraction
*/

let result = 1 + 2 * 3 + 4 ** 2;

console.log(students);
console.log(teacher);
console.log(school);
console.log(result);
