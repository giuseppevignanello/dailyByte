//Given two strings s and t return whether or not s is an anagram of t.

function validAnagram(s, t) {
  const sArray = s.split("");
  const tArray = t.split("");
  let = result = true;

  if (sArray.length != tArray.length) {
    result = false;
  } else if (sArray == tArray) {
    //two strings are not an anagram if are the same words
    result = false;
  } else {
    sArray.forEach((element) => {
      if (!tArray.includes(element)) {
        result = false;
      }
    });
  }

  return result;
}

//controllers
console.log(validAnagram("cat", "tac"));
console.log(validAnagram("prova", "gatto"));
