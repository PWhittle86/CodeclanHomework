require_relative('../db/sql_runner')
require_relative('films')
require_relative('tickets')

class Customer

  attr_reader :id
  attr_accessor :name, :funds

  def initialize(customer_hash)
    @id = (customer_hash)['id'].to_i
    @name = (customer_hash)['name']
    @funds = (customer_hash)['funds'].to_i
  end

  def self.delete_all
    sql = 'DELETE FROM customers'
    values = []
    SqlRunner.run(sql, values)
  end

  def save()
    sql = 'INSERT INTO customers (name, funds) VALUES ($1, $2) RETURNING id'
    values = [@name, @funds]
    result = SqlRunner.run(sql, values)
    @id = result[0]['id'].to_i
  end

  def update()
    sql = 'UPDATE customers SET (name, funds) = ($1, $2) WHERE id = $3'
    values = [@name, @funds, @id]
    SqlRunner.run(sql, values)
  end

  def delete()
    sql = 'DELETE FROM customers WHERE id = $1'
    values = [@id]
    SqlRunner.run(sql, values)
  end

  def films() #Returns the films that a customer has bought a ticket to see.
    sql = 'SELECT films.* FROM films INNER JOIN tickets ON films.id = tickets.film_id WHERE customer_id = $1'
    values = [@id]
    output = SqlRunner.run(sql, values)
    return output.map {|movies| Film.new(movies)}
  end


end
