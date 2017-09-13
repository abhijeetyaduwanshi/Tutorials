// We need a http to run this application in our browser
// For this we will have to use a inbuilt module which is also called http
// This is just like importing packages in JAVA
// In node we have inbuilt modules instead of packages and we use require keyword instead of import
// Also we can set this equal to some variable so that we can later use them in our code
// http is an inbuilt module and we have to create a instance of http 
    // and the instance is made by using require keyword
    // eg: var http = require("http");

// Then we will use a method which is already defined in http module that is createServer to define a new server
// We will chain this method with http using dot
// We will have to create an instance of the createServer method which will be http.createServer = implementing method
// Inside this http.createServer we will have a anonymous function (IFFE or self executing or unnamed)
// Inside above function we will pass 2 arguments, request and response
// That means that the function in the server will take request and send response
// Next thing is to decide which port do we have to run this on
// To do this we will chain createServer method with listen function with the port number as its argument
// Now inside the createServer method we will send a response
// The response is sent with response argument which was passed in the method itself
// The above response is chained with .end function with the response body in the argument
// Thats it our server is done
// Just log a message in the end for the server running on local host port 3000; local host is "127.0.0.1"

// Now go to the terminal and bring it to the current directory and run this
// -> node <file name with extension>
// -> node t2 - firstServer.js

// START

// var http = require("http");

// http.createServer(function (request, response) {
//     response.end("This is my first program\nHello Node");
// }).listen(3000);

// console.log("Server running on port http://127.0.0.1:3000");

// END

// A little modifications can be done
// If we run and inspect this in the console window in browser
    // we can see that the request is a GET request and a status code is 200
// But to make sure we get data with correct status code we can explicitly make a writeHead method
    // with status code as its argument
// This writeHead method can take multiple argument,
    // another argument is the content-type so to make sure we get a date in the expected format

// START

var http = require("http");

http.createServer(function (request, response) {
    response.writeHead(200, { 'Content-Type': 'text/plain' });
    response.end("This is my first program\nHello Node");
}).listen(3000);

console.log("Server running on port http://127.0.0.1:3000");

// END