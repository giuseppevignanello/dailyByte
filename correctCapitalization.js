//Correct Capitalization
//Given a string, return whether or not it uses capitalization correctly. A string correctly uses capitalization if all letters are capitalized, no letters are capitalized, or only the first letter is capitalized.

const string = "COMSDDF";
const stringAsArray = string.split("");
let fromSecondLetterCap = false;

for (let i = 1; i < stringAsArray.length; i++) {
  if (stringAsArray[i] == stringAsArray[i].toUpperCase()) {
    fromSecondLetterCap = true;
  }
}

const onlyFirstLetterCap =
  stringAsArray[0] == stringAsArray[0].toUpperCase() && !fromSecondLetterCap;
const allCap = string == string.toUpperCase();
const allNoCap = string == string.toLowerCase();

if (onlyFirstLetterCap || allCap || allNoCap) {
  console.log(true);
} else {
  console.log(false);
}
