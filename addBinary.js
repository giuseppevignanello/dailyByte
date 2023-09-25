//addBinary
//Given two binary strings (strings containing only 1s and 0s) return their sum (also as a binary string).
//Note: neither binary string will contain leading 0s unless the string itself is 0

const number1 = "1101";
const number2 = "101";
const result = [];
let carry = 0;

const numb1Array = number1.split("").reverse();
const numb2Array = number2.split("").reverse();

const maxLenght = Math.max(numb1Array.length, numb2Array.length);

for (let i = 0; i < maxLenght; i++) {
  digit1 = parseInt(numb1Array[i] || "0");
  digit2 = parseInt(numb2Array[i] || "0");

  let sum = digit1 + digit2 + carry;

  if (sum >= 2) {
    sum = sum % 2;
    carry = 1;
  } else {
    carry = 0;
  }

  result.unshift(sum);
}

if (carry === 1) {
  result.unshift(1);
}
const resultAsString = result.join("");
console.log(resultAsString);
