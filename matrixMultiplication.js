let array1 = [[0.70,0.20,0.1],[0.3,0.6,0.1],[0.5,0.4,0.1]];
let array2 = [[0.2,0.3,0.5],[0.1,0.2,0.1],[0.1,0.3,0.4]];
let array3 = [[0.0,0.0,0.0],[0.0,0.0,0.0],[0.0,0.0,0.0]];

for (let i = 0; i < array1.length; i++){
  for(let j = 0; j < array2.length; j++){
   for(let k = 0; k < array2.length; k++){
      array3[i][j] += array1[i][k] * array2[k][j] ; 
   }
  }
}

console.log(array3)
