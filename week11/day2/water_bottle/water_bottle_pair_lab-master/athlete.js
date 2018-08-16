const Athlete = function() {
  this.hydration = 100;
  this.distanceCovered = 0;
}

Athlete.prototype.run = function () {
  if (this.hydration == 0) {
    return "*too exhausted to run*";
  }
  this.hydration -= 10;
  this.distanceCovered += 10;
};

Athlete.prototype.drink = function (bottle) {
  this.hydration += bottle.drink();
};


module.exports = Athlete;
