const ShoppingBasket = function() {
  this.contents = [];
  this.discountCard = true;
}

ShoppingBasket.prototype.addItem = function(basketItem) {
  this.contents.push(basketItem);
}

ShoppingBasket.prototype.removeItem = function(basketItem) {
  let itemIndex = this.contents.indexOf(basketItem);
  this.contents.splice(itemIndex, (itemIndex + 1));
}

ShoppingBasket.prototype.totalValue = function(){
  let normalTotal = 0;
  let discountedTotal = 0;

  for(let item of this.contents){
    normalTotal += item.price;
  }
  if(total >= 20){
    discountedTotal = normalTotal * 0.9;
  }

  return total;
}

module.exports = ShoppingBasket;
