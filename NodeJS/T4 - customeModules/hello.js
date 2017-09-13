// 1 Exporting each methods to app.js
exports.sayHelloInEnglishOne = function () {
    console.log('1, English - Hello');
}

exports.sayHelloInSpanishOne = function () {
    console.log('1, Spanish - Hola');
}

// 2 Exporting module
// module.exports = {
//     sayHelloInEnglishTwo: function () {
//         console.log('2, English - Hello');
//     },

//     sayHelloInSpanishTwo: function () {
//         console.log('2, Spanish - Hola');
//     },

//     sendMessages: function () {
//         sayHelloInEnglishThree();
//         sayHelloInSpanishThree();
//     }
// };

// 3 Exporting one method and doing functionality in regular method
exports.sendMessages = function () {
    sayHelloInEnglishThree();
    sayHelloInSpanishThree();
}

function sayHelloInEnglishThree() {
    console.log('3, English - Hello');
}

function sayHelloInSpanishThree() {
    console.log('3, Spanish - Hola');
}