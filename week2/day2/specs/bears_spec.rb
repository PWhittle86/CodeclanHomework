require ("minitest/autorun")
require("minitest/rg")
require_relative("../bears")
require_relative("../fish")
require_relative("../rivers")


class TestBear < MiniTest::Test

  def setup
    @fish1 = Fish.new("test_fish1")
    @fish2 = Fish.new("test_fish2")
    @fish3 = Fish.new("test_fish3")

    @the_amazon = River.new("Amazon")

    @test_bear = Bear.new("Yogi", "Grizzly")
  end

  def test_bear_has_name
    assert_equal(@test_bear.bear_name, "Yogi")
  end

  def test_bear_has_type
    assert_equal(@test_bear.bear_type, "Grizzly")
  end

  def test_bear_food_count_no_fish
    assert_equal(@test_bear.food_count, 0)
  end

  def test_take_fish_from_river
    @the_amazon.add_fish_to_river(@fish1) #Adding fish to the river so that there is something there for the bear to take.
    @the_amazon.add_fish_to_river(@fish2) #Leaving a fish in the river, so that we know whether a fish has been taken.

    @test_bear.take_fish(@fish1, @the_amazon)

    assert_equal(@the_amazon.fish_count(), 1)

  end

  def test_bear_food_count_2_fish_eaten
    @the_amazon.add_fish_to_river(@fish1)
    @the_amazon.add_fish_to_river(@fish2)
    @the_amazon.add_fish_to_river(@fish3)

    @test_bear.take_fish(@fish1, @the_amazon)
    @test_bear.take_fish(@fish2, @the_amazon)

    assert_equal(@test_bear.food_count, 2)
    assert_equal(@the_amazon.fish_count, 1)

  end

  def test_rawr
    assert_equal(@test_bear.rawr, "RAWR!")
  end

end
