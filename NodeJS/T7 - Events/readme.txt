NodeJS works on the events driven architecture.
Which means because NodeJS runs in asynchronously it mush have some events that works to keep it running.

eg: Working with database if we fetch the data, we need some events to be triggered.
Otherwise if the code is blocking then our server execution will be blocked until our data is fully fetched.

For events we will use the inbuilt events module, we have to call it with creating its instance which is by using require keyword
    and then putting it as a value of a variable so we can use that variable later in out code

Then we will create eventEmitter
    which is a inbuilt function, and we will create a new object of this emitter with the events module

Using this event emitter we can create an event or event listner and also emit this events and listner will listen to these events

// case 1
How can we create a listner?
    there is a function called "on" which we can use with the eventEmitter and inside we can pass the events name like "clicked" (event name can be anything meaningful, we decide and pass same in the "emit" function)
    also pass a callback function which will be executed after the even takes place

Before this we have to emit the event which means that the event is triggered
    "emit" is just like "on" which we can use with the eventEmitter and inside pass the same event that we passed in "on"

Inside the call back function in "on" we can now pass the some code to be executed which will now execute successfully

Long story short

on                  emit
event(same name)    event(same name)
callback function

on function ready with event -> emit function event gets emitted
on function will listen to emitter and this fires the callback function inside on function

// case 2, passing arguments
We can also pass arguments in the emit function, same will be passed in the callback function inside "on" function and we can then use this inside the callback function
    likewise we can pass as many arguments as we want

// advanced
We can go to advanced stuff by introducing "util" inbuilt module
Create a instance of util with the require keyword

util has a "inherit" inbuilt function which we will use
inherit takes 2 arguments
first is the class which we want to inherit in
    for this we will create a object function say students
    and pass name in the argument
    and assign this argument to the students name using this keyword

Pass the students in the util.inherit function as first argument
and second argument will be the object is the base class(from the class which we want to inherit)
    that will be the events.eventEmitter without peranthesis

Doing this we can remove the eventEmitted new object which we created earlier

Inheritence
    the class which is inheriting have the access to the methods, members of the class from which it is inheriting
    so students have access to on, emit public functions that are there in the eventEmitter class

We can now create some students as new student objects and pass their name values in the argument

Now this new student object also has access to the "on" function
    so we will use the new student object with "on" function

Now we do the same thing
    create a named event like "scored"
    also pass a callback function with a argument like marks
    put some console.log and pass studentObject.name to get access to their name with the marks from the above function argument

    then we can "emit" this event, use student object with emit function
    with the event name as first argument and the value of marks as second argument