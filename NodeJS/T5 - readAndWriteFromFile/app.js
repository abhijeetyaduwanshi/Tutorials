var fs = require('fs');

// read synchronously
var read_data1 = fs.readFileSync('readSync.txt', 'utf8');
console.log(read_data1);

console.log("File is read sync");

// write synchronously
var dataToWrite1 = "This is the dummy to write sync";
fs.writeFileSync('writeSync.txt', dataToWrite1);

console.log("Success sync file write!!!");

// read asynchronously
var read_data_async2 = fs.readFile('readAsync.txt', 'utf8', function (err, data) {
    if (err) {
        console.error(err);
    }
    console.log(data);
});

console.log("File is read async");

// write asynchronously
var dataToWrite2 = "This is the dummy to write in async";
fs.writeFile('writeAsync.txt', dataToWrite2, function (err, data) {
    if (err) {
        console.error(err);
    }
    console.log("Success async file write!!!");
});