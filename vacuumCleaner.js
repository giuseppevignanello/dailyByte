// Vacuum cleaner Route
//Given a string representing the sequence of moves a robot vacuum makes, return whether or not it will return to its original position. The string will only contain L, R, U, and D characters, representing left, right, up, and down respectively.

function vacuumCleaner(string) {
  const stringAsArray = string.toUpperCase().split("");
  let upDownCounter = 0;
  let leftRightCounter = 0;
  for (let index = 0; index < stringAsArray.length; index++) {
    switch (stringAsArray[index]) {
      case "L":
        leftRightCounter++;
        break;
      case "R":
        leftRightCounter--;
        break;
      case "U":
        upDownCounter++;
        break;
      case "D":
        upDownCounter--;
        break;
    }
  }
  if (upDownCounter == 0 && leftRightCounter == 0) {
    return true;
  } else {
    return false;
  }
}

console.log(vacuumCleaner("LR"));
