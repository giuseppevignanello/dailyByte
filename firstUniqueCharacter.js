// Given a string, return the index of its first unique character. If a unique character does not exist, return -1.

function firstUniqueCharacter(string) {
  for (let i = 0; i < string.length; i++) {
    let counter = 0;
    for (let j = 0; j < string.length; j++) {
      if (string[i] == string[j]) {
        counter++;
      }
    }
    if (counter == 1) {
      return i;
    }
  }
  return -1;
}

console.log("0", firstUniqueCharacter("prova"));
console.log("3", firstUniqueCharacter("abbcda"));
console.log("-1", firstUniqueCharacter("aabb"));
