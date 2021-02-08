function add(a,b){
    return a+b;
}
function sub(a,b){
    return a-b;
}
var ad=add;
var su=sub;
function mul(a,b,cb,de){
    return cb(a,b)*de(a,b);
}
let z=mul(3,2,ad,su)
console.log(z);