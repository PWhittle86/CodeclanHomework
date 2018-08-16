require ("minitest/autorun")
require("minitest/rg")
require_relative("../rivers")
require_relative("../fish")

class TestRivers < MiniTest::Test


  def setup
    @fish1 = Fish.new("test_fish1")
    @fish2 = Fish.new("test_fish2")
    @fish3 = Fish.new("test_fish3")
    @fish4 = Fish.new("test_fish4")
    @fish5 = Fish.new("test_fish5")
    @the_amazon = River.new("Amazon")
  end


  def test_river_has_name
    assert_equal(@the_amazon.name, "Amazon")
  end

  def test_fish_count
    assert_equal(@the_amazon.fish_in_river.count, @the_amazon.fish_count())
  end

  def test_add_fish_to_river
    @the_amazon.add_fish_to_river(@fish1)
    assert_equal(@the_amazon.fish_count, 1)
  end

  def test_add_lots_of_fish_to_river
    @the_amazon.add_fish_to_river(@fish1)
    @the_amazon.add_fish_to_river(@fish2)
    @the_amazon.add_fish_to_river(@fish3)
    @the_amazon.add_fish_to_river(@fish4)
    @the_amazon.add_fish_to_river(@fish5)
    assert_equal(@the_amazon.fish_count, 5)
  end




end
