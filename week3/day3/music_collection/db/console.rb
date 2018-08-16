require("pry")
require_relative("../models/albums")
require_relative("../models/artists")

artist1 = Artist.new({'name' => 'Slayer'})
artist2 = Artist.new({'name' => 'Cancer Bats'})

artist1.save
artist2.save

album1 = Album.new({
  'title' => 'Reign In Blood',
  'genre' => 'Metal',
  'artist_id' => artist1.id
  })

album2 = Album.new({
  'title' => 'The Spark That Moves',
  'genre' => 'Hardcore',
  'artist_id' => artist2.id
  })

album3 = Album.new({
  'title' => 'Repentless',
  'genre' => 'Metal',
  'artist_id' => artist1.id
  })

album1.save
album2.save
album3.save

binding.pry
nil
