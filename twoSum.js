//Given an array of integers, return whether or not two numbers sum to a given target, k.
//Note: you may not sum a number with itself.

function twoSum(arrayNumbers, k) {
  let checkNumber = null;
  let sum = 0;
  let result = false;
  for (let i = 0; i < arrayNumbers.length; i++) {
    sum = 0;
    checkNumber = arrayNumbers[i];
    for (let j = 0; j < arrayNumbers.length; j++) {
      if (j != i) {
        sum = checkNumber + arrayNumbers[j];
      }
      if (sum === k) {
        result = true;
      }
    }
  }

  return result;
}

//controllers
const arrayCheck = [10, 7, 10, 1];
console.log(twoSum(arrayCheck, 17));
