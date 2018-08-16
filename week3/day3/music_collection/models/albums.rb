require ('pg')
require_relative ('../db/sql_runner')

class Album

  attr_accessor :title, :genre, :artist_id
  attr_reader :id

  def initialize(options)
    @id = options['id']
    @title = options['title']
    @genre = options['genre']
    @artist_id = options['artist_id'].to_i
  end

  def self.all
    sql = 'SELECT * FROM albums'
    albums = SqlRunner.run(sql)
    return albums.map{|record| Album.new(record)}
  end

  def save()
    sql = 'INSERT INTO albums (title, genre, artist_id) VALUES ($1, $2, $3) RETURNING id'
    values = [@title, @genre, @artist_id]
    result = SqlRunner.run(sql, values)
    @id = result[0]["id"].to_i
  end

  def artist()
    sql = 'SELECT * FROM artists WHERE id = $1'
    values = [@artist_id]
    albums = SqlRunner.run(sql, values)
    return albums.map{|record| Artist.new(record)}
  end

  def edit_title(new_title)
    sql = "UPDATE albums SET title = $1 WHERE id = $2"
    values = [new_title, @id]
    result = SqlRunner.run(sql, values)
  end

  def edit_genre(new_genre)
    sql = "UPDATE albums SET genre = $1 WHERE id =$2"
    values = [new_genre, @id]
    result = SqlRunner.run(sql, values)
  end

  def delete
    sql = "DELETE "
  end

end
