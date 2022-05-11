
const text = 'Whether its color or colour, it is all the same.The human eye can see a wide gamut of colours, which makes us unique as a species.';

const pattern = /colou?rs?/g;

console.log(pattern.exec(text)[0]);
console.log(pattern.exec(text)[0]);
console.log(pattern.exec(text)[0]);

let results;
while ((results = pattern.exec(text)) !== null)
{
 console.log(results[0]);
}
conststring = "I love to write JavaScript programs";

letre = /[a-z]/;
let index = string.search(re);
console.log(index); // 2 -> matches 'l'

letre1 = /J[a-z]*/i;
letindex1 = string.search(re1);
console.log(index1); // 16 -> matches 'JavaScript'

letre2 = /[0-9]/;
let index2 = string.search(re2);
console.log(index2); // -1 -> No digit match


constmessage = "JavaScript is a fun programming language.";

// regular expression that checks if message contains 'programming'
constexp = /programming/;

// check if exp is present in message
letresult = message.match(exp);
console.log(result);



conststring = "My name is Albert. YOUR NAME is Soyuj.";

// expression matches case-insensitive "name is"+ any alphabets till period (.)
constre = /name\sis\s[a-zA-Z]+\./gi;

letresult = string.match(re);
console.log(result); // [ 'name is Albert.', 'NAME is Soyuj.' ]

// using named capturing groups
const re1 = /name\sis\s(?<name>[a-zA-Z]+)\./i;
letfound = string.match(re1);

console.log(found.groups); // {name: "Albert"}


const string = "I am learning JavaScript not Java.";
constre = /Java[a-z]*/gi;

let result = string.matchAll(re);

for (match of result) {
  console.log(match);
}


conststring = "My name is Albert. YOUR NAME is Soyuj.";

// expression matches case-insensitive "name is"+ any alphabets till period (.)
// using named capturing groups
const re = /name\sis\s(?<name>[a-zA-Z]+)\./gi;
let found = string.matchAll(re);

for (const match of found){
    console.log(`Found "${match[0]}" at index ${match.index}. Captured name = ${match.groups['name']}`)
}