const WaterBottle = function(){
  this.volume = 0;
}

WaterBottle.prototype.fill = function () {
  this.volume = 100;
}


//You need to do this at the end of every file in order for it to be visible to modules outside of this file.

module.exports = WaterBottle;
