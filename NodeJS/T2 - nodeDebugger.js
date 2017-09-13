// Code from previous tutorial
// In this one we will see how to use the debugger and resolve any problems in node
// If we have some mistakes in our code the program will not run on the browser and
    // we will not come to know where the actual mistakes are
// So there is this option to run the code in the debug mode to calculate the mistakes
// Regularly we run the code with going to the terminal and do -> node <file.ext>
// But for debugger we will do -> node debug <file.ext>

// Now purposely we make a mistake say "responseContentLength" value
    // put "responseBody.lengthh" instead of "responseBody.length"
// Then try to run the code we will notice that the code is not run
// Open the code in debugger mode and if we type "help" while our code is in debugg mode
    // this will give us all the options that we can use
// Now we can put a break point, take the suggestion from help like -> "setBreakpoint(4);"
// This will set breakpoint at like 4 in our code
// Now press "cont" and the server will again run with setting the breakpoint at like 4
// To stepdown we can use "next" or "step", shorthand shortform "n" and "s", this will step down to line 5 in our code
// If we dont put any command and simply press "enter" this will execute the last command used

// To verify the values of the variables we can use "repl" that is "read-eval-print-loop"
// To use repl we can do repl enter and then the variable name like -> repl <enter>
// -> body
// This will print the value of the body variable
// Now we will verify the second variable and third and so on...
// The variable for which we dont get any value is the one where we have mistake

// To come out of the debug type ctrl c
    // and then type ".exit"

// Now run the code normally, this will run else follow this process again

// VisualStudio code also have an inbuilt debug option
// Go to view > debug and then the default debugger will start
// Go and run the code normally from terminal and if needed refresh the page on the browser

// START

var http = require("http");

http.createServer(function (request, response) {
    var responseBody = 'this is the body of the response';
    var responseContentType = 'text/plain';
    var responseContentLength = responseBody.lengthh;

    response.writeHead(200, {
        'Content-Type': responseContentType,
        'Content-Length': responseContentLength
    });
    response.end(responseBody);
}).listen(3000);

console.log("Server running on port http://127.0.0.1:3000");

// END