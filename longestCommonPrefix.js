//Longest Common Prefix
//Given an array of strings, return the longest common prefix that is shared amongst all strings.
//Note: you may assume all strings only contain lowercase alphabetical characters.

function longestCommonPrefix(arrayOfStrings) {
  let prefix = "";
  let arrayOfChars = [];
  let minLength = arrayOfStrings.reduce(function (a, b) {
    return a.length <= b.length ? a : b;
  }).length;

  for (let i = 0; i < minLength; i++) {
    arrayOfStrings.forEach((string) => {
      arrayOfChars.push(string[i]);
    });

    if (arrayOfChars.every((val) => val === arrayOfChars[0])) {
      prefix += arrayOfChars[0];
    }
    arrayOfChars = [];
  }

  return prefix;
}

console.log(longestCommonPrefix(["colorado", "color", "colo"]));
