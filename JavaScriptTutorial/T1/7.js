// typecasting in Javascript
var myVar = 23;
console.log("value - " + myVar + ", datatype - " + typeof myVar);

myVar = "I have changes the value from 23 to twenty three";
console.log("value - " + myVar + ", datatype - " + typeof myVar);

// arithemetic operators +, -, *, / and %
// + operator is used for addition as well as for concatenation
var x = 5 + 10; // x = 15;
var y = "Hello" + " " + "World"; // y = "Hello World"

// important
var z = "3" + 4 + 5; // z = 345; dayatype = string;
var zz = 3 + 4 + "5"; // zz = 75; dayatype = string;

// strange calculation in JavaScript
var x = 0.1 + 0.1;
console.log(x); // well that simple, its 0.2

var y = 0.1 + 0.2;
console.log(y); // its not 0.3; not exactly, its this 0.30000000000000004

// logical operations
/*
&& represents and
|| represents or
! represents not
*/

// conditional operation
var myVar = (condition) ? value_if_true : value_if_false;
// regular if function
var myVar = 100;
var another;

if(myVar == 200) {
	console.log(another = "equal");
} else {
	console.log(another = "notEqual");
}
// condtional operator
var myVar = 100;
var another = (myVar == 200) ? "equal" : "notEqual";