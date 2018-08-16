require ('minitest/autorun')
require('minitest/rg')
require_relative('../guest')
require_relative('../song')
require_relative('../room')

class GuestTest < MiniTest::Test

  def setup
    @room1 = Room.new("Rock Room!", 2)
    @song1 = Song.new("Play", "Marmozets")
    @guest1 = Guest.new("Pete", 10, @song1)
  end

  def test_guest_has_name
    assert_equal(@guest1.name, "Pete")
  end

  def test_guest_has_money
    assert_equal(@guest1.money, 10)
  end

  def test_guest_has_fav_song
    assert_equal(@guest1.fav_song, @song1)
  end

  def test_favourite_song_on_playlist
    @room1.check_in_guest(@guest1)
    @room1.add_to_playlist(@song1)

    assert_equal(@guest1.fav_song_on_playlist(@room1), "Woo!")
  end

end
