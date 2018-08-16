const assert = require ('assert');
const lodash = require ('lodash');
const Record = require ('../record');
const Customer = require ('../customer');
const RecordStore = require ('../record_store');

describe('Customer', function(){

  let customer;
  let customerRecord;
  let record1, record2, record3;
  let record_store;

  beforeEach(function(){
    customer = new Customer();
    customer2 = new Customer();
    customerRecord = new Record('Pink Floyd', 'Dark Side Of The Moon', 'Prog', 10);

    record1 = new Record('Sublime', '40 Oz To Freedom', 'Ska', 10);
    record2 = new Record('Marmozets', 'Knowing What You Know Now', 'Rock', 15);
    record3 = new Record('The Specials', 'Greatest Hits', 'Ska', 10);
    record4 = new Record('Rage Against The Machine', 'The Battle Of Los Angeles', 'Rock', 20);

    record_store = new RecordStore('Super Stevie Sounds', 'Glasgow');

    record_store.addRecord(record1);
    record_store.addRecord(record2);
    record_store.addRecord(record3);

    customer.addRecord(customerRecord);
    customer2.addRecord(record1);
    customer2.addRecord(record2);
  })

  it('can hold records', function(){
    expected = [customerRecord];
    actual = customer.records;
    assert.deepStrictEqual(actual, expected);
  })

  it('can buy a record', function(){
    customer.buyRecord(record1);
    expected = [customerRecord, record1];
    actual = customer.records;
    assert.deepStrictEqual(actual, expected);
  })

  it('can sell a record', function(){
    customer.sellRecord(customerRecord);
    expected = [];
    actual = customer.records;
    assert.deepStrictEqual(actual, expected);
  })

  it('can view the total value of their collection', function(){
    customer.addRecord(record1);
    expected = 20;
    actual = customer.recordsValue();

    assert.strictEqual(actual, expected);
  })

  it('can view the total value of a specific genre in their collection', function(){
    customer.addRecord(record1);
    customer.addRecord(record3);

    expected = 20;
    actual = customer.recordsValueGenre("Ska");

    assert.strictEqual(actual, expected);
  })

  it('can view the most valuable record in their collection', function(){
    customer.addRecord(record2);
    customer.addRecord(record3);

    expected = record2;
    actual = customer.mostValuableRecord();

    assert.deepStrictEqual(actual, expected);
  })

  it('can sort records by value ascending', function(){
    customer.addRecord(record2);
    customer.addRecord(record4);

    expected = record4;
    actual = customer.sortRecords()[2];
    assert.strictEqual(actual, expected);
  })

  it('can sort records by value descending', function(){
    customer.addRecord(record2);
    customer.addRecord(record4);

    expected = customerRecord;
    actual = customer.sortRecordsDescending()[2];
    assert.strictEqual(actual, expected);
  })

  it('can compare collection value with another collector', function(){
    expected = customer2;
    actual = customer.compareRecordValue(customer2);
    assert.strictEqual(actual, expected);
  })

})
