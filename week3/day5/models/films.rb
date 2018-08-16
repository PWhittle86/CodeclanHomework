require_relative('../db/sql_runner')

class Film

  attr_reader :id
  attr_accessor :title, :price

  def initialize(film_hash)
    @id = (film_hash)['id']
    @title = (film_hash)['title']
    @price = (film_hash)['price'].to_i
  end

  def self.delete_all()
    sql = 'DELETE FROM films'
    values = []
    SqlRunner.run(sql, values)
  end

  def save()
    sql = "INSERT INTO films (title, price) VALUES ($1,$2) RETURNING id"
    values = [@title, @price]
    result = SqlRunner.run(sql, values)
    @id = result[0]['id'].to_i
  end

  def update()
    sql = 'UPDATE films SET (title, price) = ($1, $2) WHERE id = $3'
    values = [@title, @price, @id]
    SqlRunner.run(sql, values)
  end

  def delete()
    sql = 'DELETE FROM films WHERE id = $1'
    values = [@id]
    SqlRunner.run(sql, values)
  end

  def customers #Returns the customers that have bought a ticket to see the film.
    sql = 'SELECT customers.* FROM customers INNER JOIN tickets ON customers.id = tickets.customer_id WHERE film_id = $1 ORDER BY name'
    values = [@id]
    output = SqlRunner.run(sql, values)
    return output.map{|people| Customer.new(people)}
  end

end
