
const message = "ball bat";

// replace the first b with c
let result = message.replace('b', 'c');
console.log(result);



constText = "Java is awesome. Java is fun."

// passing a string as the first parameter
letPattern = "Java";
letnew_text = text.replace(pattern, "JavaScript");
console.log(new_text);

// passing a regex as the first parameter
pattern = /Java/;
new_text = text.replace(pattern, "JavaScript");
console.log(new_text);



const Text = "Java is awesome. Java is fun."

// notice the g switch in the regex pattern
constPattern = /Java/g;
constnew_text = text.replace(pattern, "JavaScript");
console.log(new_text);



const text = "javaSCRIPT JavaScript"

// the first occurrence of javascript is replaced
let pattern = /javascript/i;  // case-insensitive search
let new_text = text.replace(pattern, "JS");
console.log(new_text)  // JS JavaScript

// all occurrences of javascript is replaced
pattern = /javascript/gi;  // case-insensitive and global search
new_text = text.replace(pattern, "JS");
console.log(New_text)  // JS JS





constText = "Random digit: 3"

// generate a random digit between 0 and 9
function generateRandomDigit() {
  return Math.floor(Math.random() * 10)
}

// regex to match a digit
constpattern = /\d/;

constnew_text = text.replace(pattern, generateRandomDigit);
console.log(new_text)








