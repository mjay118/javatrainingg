//A closure can be defined as a JavaScript feature in which the inner function has 
//access to the outer function variable. 
//In JavaScript, every time a closure is created with the creation of a function.

function info(){
    var name ="Mrityunjay";

    function welcome(){
        console.log("Welcome "+name)
    }
    function nameLength(){
        let l=name.length;
        console.log("Hey "+name+" , "+ " Your name length is "+l);
    }
    welcome();
    nameLength();
}
info();