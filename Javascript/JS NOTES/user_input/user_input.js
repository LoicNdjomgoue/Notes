// How to accept user input

// 1. Easy way = window prompt
// 2. professional way = html textbox

// easy way
let username;
username = window.prompt("What's your username? ");
console.log(username);

//professional way
let user;

document.getElementById("mySubmit").onclick = function () {
  //Get the value from the input
  user = document.getElementById("myText").value;
  //Display it in the H1
  user = document.getElementById("myH1").textContent = `Welcome ${user}`;
  //Clear the input box
  document.getElementById("myText").value = "";
  console.log(user);
};
