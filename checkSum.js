function checksum(n){
    let sum = 0
    for(let i = 0; i < n.length; i++){
      sum += ((n.length+1)-i) * Number(n[i]);
    }
    
    let value = 0;
    while(value <= 10){
     
      if((sum+(1*value)) % 11 === 0){
        console.log(value);
        return
      }
      else{
        value++
      }
    }
  }
  
  checksum("965448765")