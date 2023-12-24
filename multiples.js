let array1 = []
let n = 1000
for (let i = 0; i < n; i++){ 
    array1.push(i)
}
let multiple3 = 3;
let multiple5 = 5;
let multiple15 = 15;
let sum = 0;
while(array1[multiple3] || array1[multiple5]){
    if(array1[multiple3]){
        sum+=multiple3;
        multiple3+=3;
}
   else if(array1[multiple5]){
       sum+=multiple5;
       multiple5+=5
    }
}
for(let i = 15; i < array1.length; i+=15){
    sum-=i;
}
console.log(sum)