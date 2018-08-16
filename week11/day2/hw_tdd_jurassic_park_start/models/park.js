const Dinosaur = require('../models/dinosaur.js');

const Park = function(name, ticketPrice, dinosaurs){
  this.name = name;
  this.ticketPrice = ticketPrice;
  this.dinosaurs = [];
}

Park.prototype.addDinosaur = function(dinosaur){
  this.dinosaurs.push(dinosaur);
}

Park.prototype.removeDinosaur = function(dinosaur){
  let dinosaurIndex = this.dinosaurs.indexOf(dinosaur);
  this.dinosaurs.splice(dinosaurIndex, dinosaurIndex + 1);
}

Park.prototype.mostPopularDino = function(){

  let topDino = this.dinosaurs[0];

  for(let dinosaur of this.dinosaurs){
    if (dinosaur.guestsAttractedPerDay > topDino.guestsAttractedPerDay){
      topDino = dinosaur;
    }
  }

  return topDino;
}

module.exports = Park;
