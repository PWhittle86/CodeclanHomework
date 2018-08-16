require_relative('../db/sql_runner')
require_relative('customers')

class Ticket

attr_reader :id
attr_accessor :customer_id, :film_id

  def initialize(ticket_hash)
    @id = (ticket_hash)['id']
    @customer_id = (ticket_hash)['customer_id']
    @film_id = (ticket_hash)['film_id']
  end

  def self.delete_all()
    sql = 'DELETE FROM tickets'
    values = []
    SqlRunner.run(sql, values)
  end

  def save()
    sql = 'INSERT INTO tickets (customer_id, film_id) values ($1, $2) RETURNING id'
    values = [@customer_id, @film_id]
    output = SqlRunner.run(sql, values)
    @id = output[0]['id'].to_i
  end

  def update()
    sql = 'UPDATE tickets SET (customer_id, film_id) = values ($1, $2) WHERE id = $3'
    values = [@customer_id, @film_id]
    SqlRunner.run(sql, values)
  end

  def delete()
    sql = 'DELETE FROM tickets WHERE id = $1'
    values = [@id]
    SqlRunner.run(sql, values)
  end

  def identify_charge
    sql = 'SELECT price FROM films WHERE id = $1'
    values = [@film_id]
    return SqlRunner.run(sql, values)[0][:price].to_i
  end

  def charge_customer
    sql = 'UPDATE customers SET funds = $1 WHERE id = $2'
    values = []
  end

end
