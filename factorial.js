function factorial(n) {
    let result = BigInt(1); 
    for (let i = 2; i <= n; i++) {
        result *= BigInt(i); 
    }
    return result;
}

function sumDigits(bigNumber) {
    let sum = 0;
    let digits = bigNumber.toString(); 
    for (let digit of digits) {
        sum += parseInt(digit, 10); 
    }
    return sum;
}

let number = 100;
let factorialResult = factorial(number);
let sum = sumDigits(factorialResult);
console.log(`The sum of the digits in the number 100! is: ${sum}`);
