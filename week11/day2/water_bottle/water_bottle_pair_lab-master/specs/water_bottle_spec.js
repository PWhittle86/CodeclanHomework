const assert = require('assert');
const WaterBottle = require('../water_bottle.js');

describe('Water Bottle', function(){
// if its empty or you put x before it: xit, then it will ignore(pending) the test.
  let emptyBottle, bottle;

  beforeEach(function(){
    emptyBottle = new WaterBottle();
    bottle = new WaterBottle();
    bottle.fill();
  })

  it('should be empty at start', function(){
    assert.strictEqual(emptyBottle.volume, 0);
  })

  it('should got to 100 when filled', function(){
    assert.strictEqual(bottle.volume, 100);
  })

  it('should go down by 10 when drank', function(){
    bottle.drink();
    assert.strictEqual(bottle.volume, 90);
  })

  it('should go down to 0 when emptied', function() {
    bottle.empty();
    assert.strictEqual(bottle.volume, 0);
  })

  it('should not be able to go below zero', function() {
    assert.strictEqual(emptyBottle.drink(),'*water bottle is empty*')
  })

});
