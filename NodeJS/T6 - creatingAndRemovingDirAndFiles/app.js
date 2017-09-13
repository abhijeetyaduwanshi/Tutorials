var fs = require('fs');

// create file
fs.writeFile('nynode.txt', "This is the data which will be written in the new file created");

// remove file
fs.unlink('one.txt');

// clean remove file
fs.unlink('test.txt', function (err) {
    if (err) {
        console.log('Error deletion');
    } else {
        console.log('successfully deleted');
    }
});

// create directory
fs.mkdir('node');

// clean create directory
fs.mkdir('node', function (err) {
    if (err) {
        console.log("failed to create dir");
    } else {
        console.log("dir created");
    }
});

// create new directory and new file inside it
fs.mkdir('node', function (err, data) {
    if (err) {
        console.log("failed to create dir");
    } else {
        console.log("dir created");
        fs.writeFile('./node/nynode.txt', "This is the data which will be written in the new file created");
    }
});

// remove directory
fs.rmdir('node');

// remove file inside the directory and then the directory itself
fs.unlink('./node/nynode.txt', function () {
    fs.rmdir('node');
});