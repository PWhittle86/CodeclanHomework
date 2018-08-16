const assert = require('assert'); //Brings in the assert module from Mocha.
const WaterBottle = require('../water_bottle.js'); //Defining where the file lives.

describe('Water Bottle', function(){

  // beforeEach(function(){
  //   const bottle = new WaterBottle();
  // })


  it('should be empty at start', function(){
    const bottle = new WaterBottle();
    assert.strictEqual(bottle.volume, 0); //Actual, expected.
  })

  it('should go to 100 when filled', function(){
    const bottle = new WaterBottle();
    bottle.fill();
    assert.strictEqual(bottle.volume, 100);
  })















});
