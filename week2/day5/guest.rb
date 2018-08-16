class Guest

attr_reader :name, :fav_song
attr_accessor :money

  def initialize(name, money, fav_song)
    @name = name
    @money = money
    @fav_song = fav_song
  end

  def fav_song_on_playlist(room)
    for song in room.playlist
      if song == @fav_song
        return "Woo!"
      end
    end
  end


end
