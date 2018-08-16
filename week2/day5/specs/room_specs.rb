require("minitest/autorun")
require('minitest/rg')
require_relative('../room')
require_relative('../song')
require_relative('../guest')
require_relative('../bar')

class RoomTest < MiniTest::Test

  def setup

  @guest1 = Guest.new("Pete", 10, @song1)
  @guest2 = Guest.new("Jack", 20, @song2)
  @guest3 = Guest.new("Richard", 50, @song3)

  @song1 = Song.new("Play", "Marmozets")
  @song2 = Song.new("PDA", "Interpol")
  @song3 = Song.new("One More Time", "Daft Punk")
  @song4 = Song.new("Lithium", "Nirvana")

  @room1 = Room.new("Rock Room!", 2)

  @bar = Bar.new

  end

  def test_room_has_name
    assert_equal("Rock Room!", @room1.room_name)
  end

  def test_room_capacity
    assert_equal(2, @room1.available_space)
  end

  def test_room_playlist_empty
    assert_equal(0, @room1.playlist.length)
  end

  def test_add_to_playlist
    @room1.add_to_playlist(@song1)
    p @room1.playlist
    assert_equal(1, @room1.playlist.length)
  end

  def test_remove_from_playlist
    @room1.add_to_playlist(@song1)
    @room1.add_to_playlist(@song2)
    @room1.remove_from_playlist(@song1)

    assert_equal(1, @room1.playlist.length)
  end

  def test_check_in_guest_and_capacity_counter
    @room1.check_in_guest(@guest1)

    assert_equal(1, @room1.available_space)
    assert_equal(1, @room1.guests_in_room.length)
  end

  def test_check_out_guest_and_capacity_counter
    @room1.check_in_guest(@guest1)
    @room1.check_in_guest(@guest2)

    @room1.check_out_guest(@guest1)

    assert_equal(1, @room1.available_space)
    assert_equal([@guest2], @room1.guests_in_room)
  end

  def test_adding_guest_when_capacity_0
    @room1.check_in_guest(@guest1)
    @room1.check_in_guest(@guest2)

    assert_equal(@room1.check_in_guest(@guest3), "Sorry, this room is full. Please try another.")
  end

  def test_charging_for_entry_to_room
    @room1.charge_guest_for_entry(@guest1, @bar)
    assert_equal(@guest1.money, 0)
  end


end
