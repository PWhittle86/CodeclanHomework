// var myObject = {}
// myObject.shape = 'circle';
// myObject.radius = 10;
//
// var myOtherObject = new Object();
// myOtherObject.size = 6;
// myOtherObject.color = 'red';
//
// // var house1 = { //This is not an ideal approach for creating objects, as it requires all the information and properties to be specified.
// //   sqFeet: 2000,
// //   bathrooms: 2,
// //   bedrooms: 3
// // }
// //
// // var house2 = {
// //   sqFeet: 2000,
// //   bathrooms: 2,
// //   bedrooms: 3
// // }
// //
// // var house3 = {
// //   sqFeet: 2000,
// //   bathrooms: 2,
// //   bedrooms: 3
// // }
//
// var House = function(sqFeet, bathrooms, bedrooms){ //This is how you create a constructor for a variable in JS.
//   this.sqFeet = sqFeet;
//   this.bathrooms = bathrooms;
//   this.bedrooms = bedrooms;
//   this.numberOfRooms = function(){
//     return(this.bathrooms + this.bedrooms);
//   }
// }
//
// var house1 = new House(1000, 3, 4);
// var house2 = new House(2000, 4, 5);
//
// var Office = function(desks, meetingRooms){
//   this.desks = desks;
//   this.meetingRooms = meetingRooms;
//   this.averageDesksPerMeetingRoom = function(){
//     return this.desks / this.meetingRooms;
//   }
// }
//
// var office1 = new Office(100, 10);
// var office2 = new Office(2, 2);
//
// console.log(office1);
// console.log(office1.averageDesksPerMeetingRoom());


var Planet = function(name){
  this.name = name;
}

var SolarSystem = function(name){
  this.name = name;
  this.planets = [];
  this.addPlanet = function(planet){
    this.planets.push(planet);
  }
}

var earth = new Planet("Earth");
var milkyWay = new SolarSystem("Milky Way");

milkyWay.addPlanet(earth);
console.log(milkyWay);
