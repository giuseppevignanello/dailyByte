//Given a string representing your stones and another string representing a list of jewels, return the number of stones that you have that are also jewels.
function jewelsAndStones(jewels, stones) {
  result = 0;
  stonesAsArray = stones.split("");
  stonesAsArray.forEach((letter) => {
    if (jewels.includes(letter)) {
      result++;
    }
  });
  return result;
}

//controllers

console.log(jewelsAndStones("abc", "ac"));
console.log(jewelsAndStones("Af", "AaaddfFf"));
console.log(jewelsAndStones("AYOPD", "ayopd"));
