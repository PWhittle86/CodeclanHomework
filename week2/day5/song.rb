class Song

attr_reader :song_name, :artist, :genre

  def initialize(song_name, artist)
    @song_name = song_name
    @artist = artist
  end

end
