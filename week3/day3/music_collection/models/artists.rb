require ('pg')
require_relative ('../db/sql_runner')

class Artist

attr_reader :id, :name

  def initialize(options)
    @id = options['id'].to_i
    @name = options['name']
  end

  def self.all()
    sql = 'SELECT * FROM artists'
    artists = SqlRunner.run(sql)
    return artists.map {|band| Artist.new(band)}
  end

  def save()
    sql = "INSERT INTO artists (name) VALUES ($1) RETURNING id"
    values = [@name]
    result = SqlRunner.run(sql, values)
    @id = result[0]["id"].to_i
  end

  def albums
    sql = "SELECT * FROM albums WHERE artist_id = $1"
    values = [@id]
    album_list = SqlRunner.run(sql, values)
    return album_list.map {|record| Album.new(record)}
  end

  def edit_name(new_name)
      sql = "UPDATE artists SET name = $1 WHERE id =$2"
      values = [new_name, @id]
      result = SqlRunner.run(sql, values)
  end

end
