JavaScript

On the road to world domination

JavaScript Intro
Based on ECMA-262, standard developed by European Computer Manufacturers Association, First came in NetScape(1995)

JS is a powerful interpreted (no compiler) language for web, servers, devices including computers, tablets, smartphones etc

Interpreter stops as soon as it encounters an error

JS is the world's most misunderstood programming language

The name is cpoyrighted to SUN but now its copyrighted to Oracle, but only the name and all the other stuff is maintained by European Computer Manufacturers Association

JS siblings - LiveScript, JScript & TypeScript(Microsoft), ActionScript(Adobe), CoffeeScript

What can you do on the web
- Dynamically create, read, update, delete the DOM structure of the HTML elements.
- Change styling of the HTML elements
- Bind event handlers on HTML elements
- Form validation, handle browser storage and caching and web sockets, AJAX, Web Workers, GEO Location
- Handle async request calls and response machanisms (AJAX calls)


-----JSIntro.html-----
Now how and where to use the JS file
we have 4 options,
1. external script placed in the head
2. inline script placed in the head
3. external script placed in the body
4. inline script placed in the body

If we have our application code somewhere and JS library somewhere else put it as a external script

Advantages of external js script
Script can be cached, minified, many js files can be combined into one, simplifies and improve the performance

When the js is really small or using any analytics, use the JS inline, specially in the head section, for rest of the stuff use the external sctipts

Script in the head or the body
- Script block parallel downloads (does not matter same host or not). Delays rendering of the page

Script in the head, the code travels line by line startig from the top, as soon as it encounters the script, it will stop parsing the html and will start downloading the js script
If we have multiple scripts then our browser will download and executing those scripts

So for this put the js script as the last element of the body, this will get all the html and styles and will show the page to the user and then it will download and execute the code

Or use
If you want to use the script in the head and keep them there we can usr "defer and async" attributes in the script tag 

image of the difference