const _ = require ('lodash');

const Customer = function(){
  this.wallet = 50;
  this.records = [];
}

Customer.prototype.addRecord = function(record){
  this.records.push(record);
};

Customer.prototype.buyRecord = function(record){
  this.records.push(record);
  this.wallet -= record.price;
};

Customer.prototype.sellRecord = function (recordToSell){
  _.remove(this.records, record =>{
    if(record === recordToSell){
      this.balance += recordToSell
      return true;
    }
  })
};

Customer.prototype.recordsValue = function(){
  let total = 0;
  _.forEach(this.records, function(record){
    total += record.price;
  })
  return total;
};

Customer.prototype.recordsValueGenre = function(genre){
  let total = 0;
  _.forEach(this.records, record =>{
    if(record.genre === genre){
      total += record.price;
      return true;}
    }
  )
  return total;
};

Customer.prototype.mostValuableRecord = function(){
  return _.maxBy(this.records, 'price');
};

Customer.prototype.sortRecords = function(){
  return _.sortBy(this.records, "price");
};

//This solution allows you to have a single function which covers both of the record sorting problems.

// Customer.prototype.sortRecords = function(type){
//   return _.orderBy(this.records, "price", type);
// };


Customer.prototype.sortRecordsDescending = function () {
  new_array = _.sortBy(this.records, "price");
  _.reverse(new_array); //There is definitely a better way to do this... Ask Instructors on Monday.
  return new_array;
};

Customer.prototype.compareRecordValue = function(customer2){
  if (this.recordsValue() > customer2.recordsValue()){
    return this;
  }else{
    return customer2;
  }
};

module.exports = Customer;
