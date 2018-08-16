const _ = require('lodash');

const RecordStore = function(name, location){
  this.name = name;
  this.location = location;
  this.inventory = [];
  this.balance = 100;
}

  RecordStore.prototype.addRecord = function(record){
    this.inventory.push(record);
  };

  RecordStore.prototype.inventoryInfo = function(){
    let results = this.inventory.map(function(album){
      return album.info();
      })
    return results;
  };

  RecordStore.prototype.sellToCustomer = function(recordToSell, customer){
      _.remove(this.inventory, record =>{
      if(record === recordToSell && customer.wallet >= recordToSell.price){
        this.balance += recordToSell.price;
        customer.wallet -= recordToSell.price;
        customer.records.push(recordToSell);
        return true;
      }
    })
  };

  RecordStore.prototype.buy = function(recordToBuy){
    this.inventory.push(recordToBuy);
    this.balance -= recordToBuy;
  };

  RecordStore.prototype.allFinancials = function(){
    let result = 0;
    _.forEach(this.inventory, record => {result += record.price;})
    return result + this.balance;
  };

  RecordStore.prototype.findByGenre = function(genre){
    return _.filter(this.inventory, record => record.genre === genre);
  };



module.exports = RecordStore;
