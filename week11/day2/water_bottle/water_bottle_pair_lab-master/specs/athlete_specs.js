const assert = require('assert');
const WaterBottle = require('../water_bottle.js');
const Athlete = require('../athlete.js');

describe('athlete', function(){

  let emptyBottle, bottle, athlete;

  beforeEach(function(){
    athlete = new Athlete();
    emptyBottle = new WaterBottle();
    bottle = new WaterBottle();
    bottle.fill();
  })

  it('should have hydration starting at 100', function(){
    assert.strictEqual(athlete.hydration , 100);
  });

  it('distance covered starts at 0', function() {
    assert.strictEqual(athlete.distanceCovered, 0);
  });

  it('athlete run should decrease hydration and increase distanceCovered', function() {
    athlete.run();
    assert.strictEqual(athlete.distanceCovered, 10);
    assert.strictEqual(athlete.hydration, 90);
  })

  it('athlete cant move if hydration is 0', function() {
    athlete.hydration = 0;
    assert.strictEqual(athlete.run(), "*too exhausted to run*");
  })

  it('athlete can drink from water bottle to increase hydration', function(){
    athlete.hydration = 0;
    athlete.drink(bottle);
    assert.strictEqual(athlete.hydration, 10)
  })


})
