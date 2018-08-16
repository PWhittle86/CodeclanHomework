// var myPerson = Object.create(null);
// myPerson.walk = function(){
//   console.log('left right left right');
// }
//
// var wisePerson = {
//   wisdom: function(){
//     console.log("Commit often");
//   }
// }
//
// var myPerson = Object.create(wisePerson);
// myPerson.walk = function(){
//   console.log('left right left right');
// }
//
// myPerson.wisdom();
// myPerson.walk();

var Fish = function(name, color){
  this.name = name;
  this.color = color;
}

Fish.prototype = { //All functions within this prototype are available to instances of fish.
  swim: function(){
    console.log('splash');
  }
}

fish1 = new Fish("James Pond", "blue");

console.log(fish1.swim());

// ES6 Syntax.
var proto = Object.getPrototypeOf(fish1); //Code to view the details of a given prototype.
console.log(proto);

var oldProto =fish1.__proto__
console.log(oldProto);
