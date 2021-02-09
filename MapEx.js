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
let emp=arr.map(function(item) {
    return item.name;
})
let emp1=arr.map(function(item){
    return item.salary;
})
let emp2=arr.map(function (item) {
    return item.dept;
})
console.log(emp);
console.log(emp1);
console.log(emp2);


