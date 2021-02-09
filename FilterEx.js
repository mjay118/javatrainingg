var movie=[
    {
        "name":"War",
        "budget": 200 
    },
    {
        "name":"Avtaar",
        "budget": 500 
    },
    {
        "name":"Avengers",
        "budget": 2000 
    },
];

let mapObj=movie.filter(function(item){
    return item.budget>1000
})
let map2=movie.filter(function(item){
    return item.budget<700;
}

)
let map3=movie.filter(function(item){
    return item.name=="War";
})

let map4=movie.filter(function(item){
    return item.name.length==6;
})

let map5=movie.filter(function(item){
    return item.name.startsWith("Av");
})
console.log(mapObj);
console.log(map2);
console.log(map3);
console.log(map4);
console.log(map5);



