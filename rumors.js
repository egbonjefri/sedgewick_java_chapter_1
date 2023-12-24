

function rumors(n){
    let guests = [];
    let heard = []
    for(let i = 0; i < n; i++){
      guests.push(i);
    }
    heard.push(1);
  	heard.push(2 + Math.floor(Math.random()*(guests.length - 2)));
    for(let i = 2; i < guests.length; i++){
      let r = i + Math.floor(Math.random()*(guests.length - i));
 	 if(!heard.includes(guests[r])){
        heard.push(guests[r]);
      }
    }
    return heard.length/(n-1)
  }
  
  
  console.log(rumors(10));