const array1 = [];

let x;
array1.push(0);


while(!array1.includes(x)){
  x = Math.floor(Math.random()*364);
  array1.push(x);
  x = Math.floor(Math.random()*364);

}


console.log(array1.length);
console.log(x)