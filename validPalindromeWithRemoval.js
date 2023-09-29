//Given a string and the ability to delete at most one character, return whether or not it can form a palindrome.

//simple palindrome function
function palindrome(string) {
  let firstLetterIndex = 0;
  let lastLetterIndex = string.length - 1;
  let validator = true;

  for (let i = 0; i < string.length / 2; i++) {
    if (string[firstLetterIndex] != string[lastLetterIndex]) {
      validator = false;
    }
    firstLetterIndex++;
    lastLetterIndex--;
  }
  return validator;
}

//palindrome with removal function
function palindromeWithRemoval(string) {
  //check the simple palindrome function
  let result = palindrome(string);
  let newString = "";

  //if the simple palindrome function fail
  if (result == false) {
    //try to remove each letter
    for (let j = 0; j < string.length; j++) {
      //remove the letter
      newString = string.substring(0, j) + string.substring(j + 1);
      result = palindrome(newString);
      // if the word is palindrome without a letter break the for
      if (result == true) {
        break;
      }
    }
  }

  return result;
}

console.log(palindromeWithRemoval("abbca"));
