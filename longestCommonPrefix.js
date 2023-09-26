//Longest Common Prefix
//Given an array of strings, return the longest common prefix that is shared amongst all strings.
//Note: you may assume all strings only contain lowercase alphabetical characters.

function longestCommonPrefix(arrayOfStrings) {
  let prefix = "";
  let arrayOfChars = [];
  let stringAsArrayArray = [];
  let minLength = 1000;

  arrayOfStrings.forEach((string) => {
    if (string.length < minLength) {
      minLength = string.length;
    }
    stringAsArray = string.split("");
    stringAsArrayArray.push(stringAsArray);
  });

  for (let i = 0; i < minLength; i++) {
    stringAsArrayArray.forEach((stringAsArray) => {
      arrayOfChars.push(stringAsArray[i]);
    });

    if (arrayOfChars.every((val) => val === arrayOfChars[0])) {
      prefix += arrayOfChars[0];
    }
    arrayOfChars = [];
  }

  return prefix;
}

console.log(longestCommonPrefix(["colorado", "color", "col"]));
