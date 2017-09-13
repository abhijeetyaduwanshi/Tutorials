In last T's we already learned how we can use inbuilt module, we used http module as an example
To use an inbuilt module we have to call it with creating its instance which is by using require keyword
    and then putting it as a value of a variable so we can use that variable later in out code

In nodeJs we can define our own custome modules
    eg: we will define a module which says hello in different languages
    there can be several different functionality inside one module
    and these functionality will be set as functions which later will be called by their name
    for this we have to create new file which will be our module, for evey module we make we will have a new file

For the above example we will make a new file called hello.js

Hello.js
    Hello.js is a module
    inside this hello.js we will create a new function called sayHelloInEnglish
    this function can return a value or some functionality, here we will print hello, later we will add hola (spanish) in the same way

    Now we have to call this module in our main file app.js to run the program
    there are several different ways to do this

--> First is to export individual functionality inside the module
    We can export the function by using exports keyword with a dot and then our functions name 
    eg: exports.sayHelloInEnglish = function(){
        .....
        }

Now go to app.js which is our main file

App.js
    Will do same as we did with inbuilt module
    we call our custome module with creating the instance by using the require keyword
    and then putting it as a value of a variable so we can use that variable later in out code
    only difference is that we call the inbuilt module directly with its name
    for custome module we call it with ./ and then the file name with its extension
    eg: var hello = require('./hello.js'); where hello is a local variable which we will use later in our code to access the module

    Now with this hello variable we can call the sayHelloInEnglish method in our app.js file
    for now we will just log the results
    eg: hello.sayHelloInEnglishOne();
    
    This will print hello in english

    Dont forget to use the parentheses because we are calling a function

--> Second is to export the module as a whole and putting the functionality as properties
    which starts with module.export and set it equal to the properties inside { }
    eg: module.exports = {function : functionality(){},
    secondFunction : secondFunctinality(){}}

    NOTE: Two functions will be seperated with comma

App.js
    Same as the one which we did in the option one

--> Third is to put all the functionality in different methods and
    calling these functions in one master function and
    then exporting this master function as we did in the option one using the exports keyword

App.js
    Same as the one which we did in the option one