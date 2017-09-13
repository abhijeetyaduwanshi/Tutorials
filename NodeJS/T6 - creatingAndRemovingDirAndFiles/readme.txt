This is done by file system or simple fs module

First call the fs module with creating its instance which is by using require keyword
    and then putting it as a value of a variable so we can use that variable later in out code

We will 
create file
remove file
create directory
create new directory and new file inside it
remove directory
remove file inside the directory and then the directory itself
into a file system synchronously and asynchronously

create file
    we will use inbulit "writeFile" function in fs module
    pass the new name for the file we want to create with extension as first argument
    second argument is the message or data that we want to the new file created should have
    if we dont use the second argument the new file created will have "undefined" writter on it
    if the new file which we want to create already exists even then this will not throw any error
    but will change the data in it if the second argument changes

remove file
    we will use inbulit "unlink" function in fs module
    first create a file in the project that we will remove
    pass the file name with extension as the argument

clean remove file
    if the file to be deleted is not there
    code will throw a error so we do some extra checking for clean removal
    we will pass a callback function as end argument
    callback function will have err argument to check if there is any error
    print the error else print results

create directory
    we will use inbulit "mkdir" function in fs module
    this will make a directory on the same level

clean create directory
    if the folder to be made already exists with the same name
    code will throw a error so we do some extra checking for clean creating of directory
    we will pass a callback function as end argument
    callback function will have err argument to check if there is any error
    print the error else print results

create new directory and new file inside it
    this will make a new folder and inside this, this will create a new file with the data we provide
    when the create directory successfully executed put extra code to create a new file
    remember to provide the correct path of the file to be created inside

remove directory
    we will use inbulit "rmdir" function in fs module
    this will remove directory on the same level

remove file inside the directory and then the directory itself
    if we have problem removing the folder ther is probably no folder in place to remove
    or the folder has some files in it which has to be deleted first
    in the inbuilt "rmdir" function put a call back function with no arguments
    and indise the callback function we will put the code to remove the dir
    remember the file path and the folder path must be checked twice