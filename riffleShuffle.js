const SUITS = ["Clubs", "Diamonds", "Hearts", "Spades" ];
const RANKS = ["2", "3", "4", "5", "6", "7", "8", "9", "10","Jack", "Queen", "King", "Ace"];

const deck = [];
for (let i = 0; i < RANKS.length; i++){
        for (let j = 0; j < SUITS.length; j++){
           deck.push(RANKS[i] + " of " + SUITS[j]);   
        }
}

let r = 0;
for(let i = 0; i < deck.length; i++){
if(Math.random()>0.5){r++}
}
let pileA = [];
let pileB = [];
let shuffledDeck = [];
for(let i = 0; i < r; i++){
pileA.push(deck[i])
}
for(let i = r; i < deck.length; i++){
pileB.push(deck[i])
}
while(pileA.length > 0 || pileB.length > 0){
let n1 = pileA.length;
let n2 = pileB.length;
let prob1 = n1/(n1+n2);
let prob2 = n2/(n1+n2);
if(prob1 > prob2){
shuffledDeck.push(pileA.shift())
}
else{
shuffledDeck.push(pileB.shift())
}
}
console.log(shuffledDeck)