const assert = require('assert');
const ShoppingBasket = require('../shopping_basket.js');
const BasketItem = require('../basket_item.js');

describe('Shopping Basket', function(){

  let basket;

  beforeEach(function(){
    basket = new ShoppingBasket();

    apple = new BasketItem("Apple", 1, false);
    bread = new BasketItem("Bread", 2, false);
    milk = new BasketItem("Milk", 3, true);
    cereal = new BasketItem("Cereal", 4, true);
    whiskey = new BasketItem("Whiskey", 10, true);
  });

  it('basket item has name', function(){
    assert.strictEqual(apple.name, "Apple");
  });

  it('basket item has price', function(){
    assert.strictEqual(apple.price, 1);
  });

  it('basket item has bogof', function(){
    assert.strictEqual(apple.bogof, false);
  });

  it('basket should be empty at first', function(){
    assert.strictEqual(basket.contents.length, 0);
  });

  it('basket can add items', function(){
    basket.addItem(apple);
    assert.strictEqual(basket.contents.length, 1);
  });

  it('basket can remove items', function(){
    basket.addItem(apple);
    basket.addItem(bread);
    assert.strictEqual(basket.contents.length, 2);

    basket.removeItem(apple);
    assert.strictEqual(basket.contents.length, 1);
  });

  it('basket has total price', function(){
    basket.addItem(apple);
    basket.addItem(bread);
    assert.strictEqual(basket.totalValue(), 3);
  });

  it('basket can apply 10% discount', function(){
    basket.addItem(apple);
    basket.addItem(bread);
    basket.addItem(milk);
    basket.addItem(cereal);
    basket.addItem(whiskey);
    assert.strictEqual(basket.totalValue(), 18);
  });

  it('basket can apply discount card when under £20', function(){
    basket.addItem(apple);
    basket.addItem(bread);
    basket.addItem(milk);
    basket.addItem(cereal);
    assert.strictEqual(basket.totalValue(), 9.5)
  });



});
