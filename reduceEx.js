var arr=[
    {
        "name":"Amit",
        "salary":25000,
        "dept":"IT"
    },
    {
        "name":"Ram",
        "salary":35000,
        "dept":"CSE"
    },
    {
        "name":"Subhash",
        "salary":45000,
        "dept":"MECH"
    },
];
//sum of salary
let c=arr.reduce(function(sum,item){
    return sum+item.salary;
},0)
console.log(c);

//multiplication of salary
let d=arr.reduce(function(mul,item){
    return mul*item.salary;
},1)
console.log(d);