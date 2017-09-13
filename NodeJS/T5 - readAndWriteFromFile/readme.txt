There are several different inbuilt modules and, we used http module as an example
Now we will see how to read and write data from file systems
NodeJs has a built in module to support this functionality
Node implements file io using simple wrapper around standard functions
This is done by file system or simple fs module

First we will have to call the fs module with creating its instance which is by using require keyword
    and then putting it as a value of a variable so we can use that variable later in out code

We will read and write into a file system synchronously and asynchronously

Read synchronously
    For this we will create a text file and put some dummy data in it to read

App.js
    This should already have fs module called with require keyword
    Now we will use the inbuilt function called readFileSync to read the file synchronously
    in this function we will pass the files name as first argument (file called is equals to the file path use slash and dot dot to navigate)
    we can put a second argument that is the encoding type which can be utf-8
    We will then put this equals to a variable to use it to print the data
    do a console.log with to print the result

Write synchronously
    Same as the read file sync
    use inbuilt function writeFileSync to write
    pass 2 arguments, 1st is the file name with its approriate path and the 2nd is the messase to write
    if the file does not exist it will make a new file and then put the data in it

Asynchronously means which ever functionality is available do that first 
    and dont wait for other which are still loading, as soon as things are done execute them

Read asynchronously
    For this we will create a text file and put some dummy data in it to read

App.js
    This should already have fs module called with require keyword
    Now we will use the inbuilt function called readFile to read the file asynchronously
    in this function we will pass the files name as first argument (file called is equals to the file path use slash and dot dot to navigate)
    we can put a second argument that is the encoding type which can be utf-8
    then we have to put the call back function
    callback function takes 2 arguments error and data read
    inside the callback function we can print the data read and throw a error if there is any error
    We will then put this equals to a variable to use it to print the data

Write asynchronously
    Same as the read file async
    use inbuilt function writeFile to write
    pass 3 arguments, 1st is the file name with its approriate path and the 2nd is the messase to write
    3rd is the call back function with two arguments error and data read
    inside the callback function we can print success message
    if the file does not exist it will make a new file and then put the data in it