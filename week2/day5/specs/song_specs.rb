require ('minitest/autorun')
require('minitest/rg')
require_relative('../song')

class SongTest < MiniTest::Test

  def setup
    @song1 = Song.new("Play", "Marmozets")
  end

  def test_song_has_song_name
    assert_equal("Play", @song1.song_name)
  end

  def test_song_has_artist
    assert_equal("Marmozets", @song1.artist)
  end

end
