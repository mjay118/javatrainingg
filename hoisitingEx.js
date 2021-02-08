//Hoisting is a mechanism in javascript which allows us to use variables and functions before declaring them.
//variable
x=35;
console.log(x);
var x;

//function
console.log(sum(10,30));
function sum(a, b){
return a+b;
}