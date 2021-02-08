//Anonymous function is also called as function Expression
//A function expression can be stored in a variable
var y = function(a,b){
    return a*b;
}
var z=y(3,4);
console.log(z);

//Function expressions can be made "self-invoking" if the expression is followed by ().
var x= function(){
    console.log("hello");
}();

//Argument Length
var d=function(){
    return arguments.length;
}
var e =d(2,3);
console.log(e)
