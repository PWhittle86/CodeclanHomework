const assert = require('assert');
const Record = require('../record');
const Customer = require('../customer');
const RecordStore = require('../record_store');

describe('Record Shop', function(){

  let record1, record2, record3;
  let record_store

  beforeEach(function(){
    record1 = new Record('Sublime', '40 Oz To Freedom', 'Ska', 10);
    record2 = new Record('Marmozets', 'Knowing What You Know Now', 'Rock', 15);
    record3 = new Record('The Specials', 'Greatest Hits', 'Ska', 10);

    record_store = new RecordStore('Super Stevie Sounds', 'Glasgow');

    customer = new Customer();
    customerRecord = new Record('Pink Floyd', 'Dark Side Of The Moon', 'Prog', 10);

    record_store.addRecord(record1);
    record_store.addRecord(record2);
    record_store.addRecord(record3);

    customer.addRecord(customerRecord);
  })

  it('should have a store name', function(){
    let expected = 'Super Stevie Sounds';
    let actual = record_store.name;
    assert.strictEqual(actual, expected)
  });

  it('should have a location', function(){
    let expected = 'Glasgow';
    let actual = record_store.location;
    assert.strictEqual(actual, expected)
  });

  xit('should have an empty inventory', function(){
    let expected = [];
    let actual = record_store.inventory;
    assert.deepStrictEqual(actual, expected)
  });

  it('should have a starting balance', function(){
    let expected = 100;
    let actual = record_store.balance;
    assert.deepStrictEqual(actual, expected)
  });

  it('can add records to inventory', function(){
    let expected = [record1, record2, record3];
    let actual = record_store.inventory;
    assert.deepStrictEqual(actual, expected)
  });

  it('can add multiple records to inventory', function(){
    let expected = 3;
    let actual = record_store.inventory.length;
    assert.strictEqual(actual, expected)
  });

  it('can list the information of all records in inventory', function(){
    let expected = [record1.info(), record2.info(), record3.info()]
    let actual = record_store.inventoryInfo();
    assert.deepStrictEqual(actual, expected)
  });

  it('can sell a record to customer when he has enough cash', function(){
    record_store.sellToCustomer(record1, customer);

    let inventoryExpected = [record2, record3];
    let inventoryActual = record_store.inventory;
    assert.deepStrictEqual(inventoryActual, inventoryExpected);

    let balanceExpected = 110;
    let balanceActual = record_store.balance;
    assert.deepStrictEqual(balanceActual, balanceExpected);

    let custBalExpected = 40;
    let custBalActual = customer.wallet;
    assert.strictEqual(custBalActual, custBalExpected);

    let custRecordsExpected = [customerRecord, record1];
    let custRecordsActual = customer.records;
    assert.deepStrictEqual(custRecordsActual, custRecordsExpected);
  });

  it('can list all of stores financial position', function(){
    let expected = 135;
    let actual = record_store.allFinancials();
    assert.deepStrictEqual(actual, expected);
  });

  it('can view all records of a given genre', function(){
    let expected = [record1, record3];
    let actual = record_store.findByGenre('Ska');
    assert.deepStrictEqual(actual, expected);
  })





















})
