// Get the display input element
const chicken = document.getElementById("display");

// Function to add numbers/operators to the display
function appendToDisplay(input) {
  chicken.value += input; // Append clicked button's value to current display
}

// Function to clear the display
function clearDisplay() {
  chicken.value = ""; // Reset display to empty string
}

// Function to calculate the result
function calculate() {
  try {
    // eval evaluates the string as a math expression
    chicken.value = eval(chicken.value);
  } catch (error) {
    // If input is invalid, show "Error"
    chicken.value = "Error";
  }
}
