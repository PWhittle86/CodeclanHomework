const assert = require('assert');
const Park = require('../models/park.js');
const Dinosaur = require('../models/dinosaur.js');

describe('Park', function() {

  beforeEach(function () {
    park = new Park("Jurassic Park", 10);
    stegosaurus = new Dinosaur("Stegosaurus", "Vegetarian", 10);
    triceratops = new Dinosaur("Triceratops", "Vegetarian", 15);
    velociraptor = new Dinosaur("Velociraptor", "Carnivore", 30);
    trex = new Dinosaur("T Rex", "Carnivore", 50);


    // park.addDinosaur(velociraptor);
    // park.addDinosaur(trex);
  })

  it('should have a name', function(){
    assert.strictEqual("Jurassic Park", park.name);
  });

  it('should have a ticket price', function(){
    assert.strictEqual(10, park.ticketPrice);
  });

  it('should have a collection of dinosaurs', function(){
    assert.deepStrictEqual(park.dinosaurs, []);
  });

  it('should be able to add a dinosaur to its collection', function(){
      park.addDinosaur(stegosaurus);
      assert.deepStrictEqual([stegosaurus], park.dinosaurs);
  });

  it('should be able to remove a dinosaur from its collection', function(){
    park.addDinosaur(stegosaurus);
    park.addDinosaur(triceratops);
    park.removeDinosaur(triceratops);

    assert.deepStrictEqual([stegosaurus], park.dinosaurs);
  });

  it('should be able to find the dinosaur that attracts the most visitors', function(){
    park.addDinosaur(stegosaurus);
    park.addDinosaur(triceratops);
    park.addDinosaur(velociraptor);
    park.addDinosaur(trex);

    assert.deepStrictEqual(trex, park.mostPopularDino());
  });

  it('should be able to find all dinosaurs of a particular species');

  it('should be able to remove all dinosaurs of a particular species');

});
