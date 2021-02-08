//Promise handle asynchronous operations
//Pending, FullFilled and Rejected (3 States of a Promise)
//Promise chaining-->>to handle more than one asynchronous task
//(then,catch,finally) are methods used in promise chaining
//then is used when promise is fullfilled
//catch is used when promise is rejected
//finally wil exceute in both fulfiled and rejected state


const count = 5;
let countValue = new Promise(function (resolve, reject) {
    if (count==6) {
        resolve("There is a count value.");
    } else {
        reject("There is no count value");
    }
});
countValue.then(
    function suc(resultss){
        console.log(resultss);
    },
)
countValue.catch(
    function error(mjay){
console.log(mjay);
    },
)
