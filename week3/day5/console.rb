require_relative('models/customers')
require_relative('models/films')
require_relative('models/tickets')

require('pry-byebug')

Customer.delete_all
Film.delete_all
Ticket.delete_all

customer1 = Customer.new({
  'name' => 'Pete',
  'funds' => '50'
  })

customer1.save

customer2 = Customer.new({
  'name' => 'Keith',
  'funds' => '100'
  })

customer2.save

#############################

film1 = Film.new({
  'title' => 'Hereditary',
  'price' => '10'
  })

film1.save

film2 = Film.new({
  'title' => 'Solo',
  'price' => '15'
  })

film2.save

#############################

ticket1 = Ticket.new({
  'customer_id' => customer1.id,
  'film_id' => film1.id
  })

ticket1.save

ticket2 = Ticket.new({
  'customer_id' => customer1.id,
  'film_id' => film2.id
  })

ticket2.save

ticket3 = Ticket.new({
  'customer_id' => customer2.id,
  'film_id' => film1.id
  })

ticket3.save



binding.pry
nil
