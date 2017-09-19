Variables and datatypes in JS

Declaring variables in JS
Declare the variables in JS using "var" keyword

Always use a "var" keywork when declaring the variables in JS
Even if we dont use a "var" keyword the variable will be declared but the scope of the variable will be global

```
var firstName; // declares variable in the current scope.
var firstName, lastName = "Script", address, city;
```

One thing to notice, these variables does not have a datatype like int, boolean , string or anything else

Variables get assigned to a data type when we initialize them

```
lastName - "Script"
```

This has a string datatype because we assigned a string value

rest of the variables like firstName, address and city have "undefined" as their datatype

Undefined is the first datatype in JS

This means that the variable is never initialyzed, no value and it has no datatype but makes a garuntee that there is a variable declared

```
var firstName;
console.log(firstName);
```
if we see the above in our developertools we can see that it has got the value of undefined

And to further know the datatype we can always use typeof operator to know the datatype of any variable

```
var firstName;
console.log(typeof firstName);
```

Null
```
var firstName = null;
console.log(typeof firstName);
```

If we assign the variable to null, this means that the variable is declared the datatype is known but the value is not known