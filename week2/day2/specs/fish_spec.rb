require ("minitest/autorun")
require("minitest/rg")
require_relative("../fish")

class TestFish < MiniTest::Test


  def setup
    @test_fish1 = Fish.new("test_fish1")
    @test_fish2 = Fish.new("test_fish2")
    @test_fish3 = Fish.new("test_fish3")
    @test_fish4 = Fish.new("test_fish4")
    @test_fish5 = Fish.new("test_fish5")
  end


  def test_fish_has_name
    assert_equal(@test_fish1.fish_name, "test_fish1")
  end





end
