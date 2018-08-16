require ("minitest/autorun")
require ("minitest/rg")
require_relative ("../models/rps_logic")

class TestRps < MiniTest::Test


  def setup
    @rock_wins = Rps.new("rock", "scissors")
    @rock_draws = Rps.new("rock", "rock")
    @paper_wins = Rps.new("paper", "rock")
    @scissors_wins = Rps.new("scissors", "paper")
  end

  def test_rock_wins
    assert_equal("Rock wins!", @rock_wins.play_rps)
  end

  def test_paper_wins
    assert_equal("Paper wins!", @paper_wins.play_rps)
  end

  def test_scissors_wins
    assert_equal("Scissors wins!", @scissors_wins.play_rps)
  end

  def test_draw
    assert_equal("It's a draw!", @rock_draws.play_rps)
  end

end
