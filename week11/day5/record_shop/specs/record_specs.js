const assert = require('assert');
const Record = require('../record');

describe('Record', function(){

  let record;


  beforeEach(function(){
    record = new Record('Sublime', '40 Oz To Freedom', 'Ska', 10);
  })

  it('should have an artist', function(){
    let expected = 'Sublime';
    let actual = record.artist;
    assert.strictEqual(actual, expected);
  })

  it('should have a title', function(){
    let expected = '40 Oz To Freedom';
    let actual = record.title;
    assert.strictEqual(actual, expected);
  })

  it('should have a genre', function(){
    let expected = 'Ska';
    let actual = record.genre;
    assert.strictEqual(actual, expected);
  })

  it('should have a price', function(){
    let expected = 10;
    let actual = record.price;
    assert.strictEqual(actual, expected);
  })

  it('should be able to return the item properties as a string', function(){
    let expected = '40 Oz To Freedom by Sublime is a Ska album which costs £10.';
    let actual = record.info();
    assert.deepStrictEqual(actual, expected);
  })







})
