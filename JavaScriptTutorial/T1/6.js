// numbers
// declaring and initializing variable to a number value in a regular way
var myVar = 1000;
console.log(myVar);

// or using new number constructor to declare and initialize variable to a number value
var myVar = new Number(1000);
console.log(myVar.valueOf()); // but for this we will have to use the valueOf() function to get the value of the variable

// string value passed in the number constructor to handle the type conversion
var myStringNumber = "123456789";

var myVar = new Number(myStringNumber);
console.log(myVar.valueOf());

// if the string value passed in the number constructor is not a number value it will give initialized to constant NaN
var myStringNumber = "This is a string and not a number";

var myVar = new Number(myStringNumber);
console.log(myVar.valueOf()); // result will be NaN

// checking NaN
var myStringNumber = "This is a string and not a number";

var myVar = new Number(myStringNumber);

if(isNaN(myVar)){
	console.log("not a number")
} else {
	console.log("value is a number")
}

// parseInt() function to handel and parse the int value
var myVar = parseInt("1234edden5678")
console.log(myVar); // result is 1234

// using parseInt() to convert binary number to decimal
var myVar = parseInt("1001001110", 2);
console.log(myVar); // this will give a required decimal number in the results; 590

// using parseInt() to convert octal number to decimal
var myVar = parseInt("1239", 8);
console.log(myVar); // this will give a required decimal number in the results; 83

// using parseInt() to convert hexadecimal number to decimal
var myVar = parseInt("A34534F", 16);
console.log(myVar); // this will give a required decimal number in the results; 171201359

// parseFloat() to get the floating number point of a decimal number
var myVar = parseFloat("234345.345");
console.log(myVar); // result is 234345.345

// if we use parseInt() on a  floating decimal number
var myVar = parseInt("234345.345");
console.log(myVar); // result is 234345

// toFixed() to get the fixed decimal number; also rounds up the decimal number
var myVar = 234345.345677;
console.log(myVar.toFixed(2)); // this will give us 234345.34

// toPrecision() to get the precision of a number, degree to the closeness of a number in short form
var myVar = 234345.345677;
console.log(myVar.toPrecision(2)); // this will give us 2.3e+5