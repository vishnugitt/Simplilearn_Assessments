// calling x after definition
var x = 5;
document.write(x, "\n");

// calling y after definition 
let y = 10;
document.write(y, "\n");

// calling var z before definition will return undefined
document.write(z, "\n");
var z = 2;

// calling let a before definition will give error
document.write(a);
let a = 3;

for (let i = 0; i < 5; i++) {
console.log("Inside the loop:", i);
}

console.log("Outside the loop:", i);

for (var i = 0; i < 5; i++) {
console.log("Inside the loop:", i);
}

console.log("Outside the loop:", i);