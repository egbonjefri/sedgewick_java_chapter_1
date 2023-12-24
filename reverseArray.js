for (let i = 0; i < Math.floor(array1.length/2); i++){
    let tmp = array1[array1.length-1-i]
    array1[array1.length-1-i] = array1[i];
    array1[i] =  tmp
   
  }
  