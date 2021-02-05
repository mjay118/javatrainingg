//let is block level
let a = 5;
console.log(a);
//var is global level which we can use anywhere in our program
var str1 = "javascript";
function show() {
    console.log(str1);
}
//function
function prime() {
    var num = 5;
    let count = 0;
    for (let i = 2; i < num; i++) {
        if (num % i == 0) {
            count++
        }
    }
    if (count > 0) {
        console.log("Not Prime")
    }
    else {
        console.log("Prime")
    }
}
prime();

//const
//it will throw error because variable declared with const keyword cant be changed again
const d = 5;
//d = 6;
//console.log(d);cls

