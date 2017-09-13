// Nodejs has a very brief and well maintained documentation
// To use the documentation just go to NodeJs.org and select docs
// Go to the LTS version docs and look for the one which we want to use and enjoy

// In the starting of the docs there will be different functions that we can use and then there will be examples
// Go with the stable versions examples

// GLOBALS
// NodeJs has a menu called Globals select it in the left hand side menu bar 
// There will be global objects list and their documentation

// example: setTimeout(function() {}, timeout);
// This takes 2 arguments the first is the function and the second is the time out value in miliseconds
// Run the program from the terminal

// START

console.log("\nTime Out program");
var timer = setTimeout(function () {
    console.log("\nThe program ended after 3 seconds");
}, 3000);

// END

// example: setInterval(function() {}, timeout);
// This takes 2 arguments the first is the function and the second is the time out value in miliseconds
// Run the program from the terminal

// START

var time = 0;
var timer = setInterval(function () {
    time += 2;
    console.log(time + " seconds has passed");

    if (time > 7) {
        clearInterval(timer);
        console.log("Program ended");
    }
}, 2000);

// END

// There are two more very useful global variables dirname and filename
    // these are used with double underscore in the starting

// START

console.log(__dirname);
console.log(__filename);

// END