// case 1
var events = require('events');

var eventEmitter = new events.EventEmitter();

eventEmitter.on('clicked', function(){
    console.log("Something is clicked");
});

eventEmitter.emit('clicked');


// case 2, passing arguments
var events = require('events');

var eventEmitter = new events.EventEmitter();

eventEmitter.on('clicked', function(button){
    console.log(button + " is clicked");
});

eventEmitter.emit('clicked', 'button 1');


// advanced
var events = require('events');
var util = require('util');

var Students = function(name) {
    this.name = name;
}

util.inherits(Students, events.EventEmitter);

// student 1
var max = new Students('max');

max.on('scored', function(marks){
    console.log(max.name + " scored " + marks);
})

max.emit('scored', 92);

// student 2
var julie = new Students('julie');

julie.on('scored', function(marks){
    console.log(julie.name + " scored " + marks);
})

julie.emit('scored', 95);