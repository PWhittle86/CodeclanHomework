require ('minitest/autorun')
require('minitest/rg')
require_relative('../bar')
require_relative('../room')
require_relative('../guest')
require_relative('../song')

class TestBar < Minitest::Test

  def setup
    @song1 = Song.new("Play", "Marmozets")
    @guest1 = Guest.new("Richard", 50, @song1)
    @guest2 = Guest.new("Pete", 10, @song1)
    @room1 = Room.new("Rock Room!", 2)
    @bar = Bar.new
  end

  def test_value_of_beer
    assert_equal(5, @bar.beer)
  end

  def test_track_entry_fees
    @room1.charge_guest_for_entry(@guest1, @bar)
    assert_equal(10, @bar.till_entry_fees)
  end

  def test_buy_beer
    @room1.charge_guest_for_drink(@guest1, @bar.whisky, @bar)
    assert_equal(35, @guest1.money)
    assert_equal(15, @bar.till_drinks_balance)
  end

  def test_cant_afford_drink
    assert_equal("Sorry, you don't have enough cash for that drink. It costs 15 smackaroonies.", @room1.charge_guest_for_drink(@guest2, @bar.whisky, @bar))
  end


end
