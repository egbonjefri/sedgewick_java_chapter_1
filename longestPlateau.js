function longestPlateau(array1){
    let dict = [];
    for(let i = 0; i < array1.length; i++){

        let length = 1;
        let j = 0;
        let k = i;

        while(array1[i]===array1[i+j+1]){
          length++;
          j++;
        }
        i+=j;

        if(array1[i+1]<array1[i]&&array1[k-1]<array1[k]){
          dict.push({location:k, length: length});
        }
          
        else{
          if(array1[i]===array1[array1.length-1]&&j>0||array1[i]===array1[array1.length-1]&&array1[i]>array1[i-1]){
          dict.push({location:k, length: length})
          }
          else{
           continue
          }
        }

    }
            return dict.reduce((prev, current) => {
      return (prev.length > current.length) ? prev : current;
    })

  }
  
console.log(longestPlateau([1,2,2,2,2,1]));
console.log(longestPlateau([3, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 0, 1, 1, 1, 1, 0]))
console.log(longestPlateau([1,2,2,2,2,3]));
console.log(longestPlateau([3 ,2 ,2 ,2 ,2 ,2 ,2 ,1 ,2 ,1 ,1 ,1 ,2 ,2 ,0 ,1 ,1 ,1 ,1]));