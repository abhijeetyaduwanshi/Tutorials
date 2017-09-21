// strings
// declaring and initializing variable to a string value
var firstName = 'JavaScript';

// or using new string constructor to declare and initialize variable to a string value
var firstName = new String('JavasScript'); // for this we have to use valueOf() to get the value

// this is how we get the value of the variable if we declare and initialize the variable using a string constructor; using valueOf() function
var firstName = new String('JavaScript');
console.log(firstName.valueOf());

// log and check the typeof, output is string
var firstName = "JavaScript";
console.log(typeof firstName);

// log and check the typeof, output is number
var firstName = 1000;
console.log(typeof firstName);

// boolean
// declaring and initializing variable to a boolean value in a regular way
var myVar = true;
var myVar = false;

// or using new boolean constructor to declare and initialize variable to a boolean value
var myVar = new Boolean(); // default value is false, have to use valueOf() function to get the value of the variable
var myVar = new Boolean(true); // initialize the variable with a true value, have to use valueOf() function to get the value of the variable

// we can put non-boolean variables in the conditional expressions in JS
var myVar;
if(!myVar) {
	// this will execute the loop because a value which has not been initialized is of undefined datatype which evaluates to false 
}

// another example of putting the non-boolean valued variable in the conditional expression
var myVar = 0;

if(myVar) {
	console.log("This is true");
} else {
	console.log("This is false");
}