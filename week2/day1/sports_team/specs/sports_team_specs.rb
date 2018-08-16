require("minitest/autorun")
require("minitest/rg")
require("../sports_team")

class TestSportsTeam < MiniTest::Test

  # Make a class to represent a Team that has the properties
  # Team name (String), Players (array of strings) and a Coach (String).
  # For each property in the class make a getter method than can return them.

  def test_team_name
    team = SportsTeam.new("Celtic", ["Hendrik Larsson", "Captain Football", "Some Guy"], "Mr. Manager")
    assert_equal("Celtic", team.team_name)
  end

  def test_players
    team = SportsTeam.new("Celtic", ["Hendrik Larsson", "Captain Football", "Some Guy"], "Mr. Manager")
    assert_equal(["Hendrik Larsson", "Captain Football", "Some Guy"], team.players)
  end

  def test_coach
    team = SportsTeam.new("Celtic", ["Hendrik Larsson", "Captain Football", "Some Guy"], "Mr. Manager")
    assert_equal("Mr. Manager", team.coach)
  end


  # Create a setter method to allow the coach's name to be updated.

  # def test_change_coach
  #   team = SportsTeam.new("Celtic", ["Hendrik Larsson", "Captain Football", "Some Guy"], "Mr. Manager")
  #   assert_equal("Mr. Super Manager", team.change_coach"Mr. Super Manager"))
  # end

  # Refactor the class to use attr_reader or attr_accessor instead of your own getter and setter methods.

  def test_change_coach
    team = SportsTeam.new("Celtic", ["Hendrik Larsson", "Captain Football", "Some Guy"], "Mr. Manager")
    assert_equal("Mr. Super Manager", team.coach = "Mr. Super Manager")
  end

  # Create a method that adds a new player to the players array.

  def test_add_new_player
    team = SportsTeam.new("Celtic", ["Hendrik Larsson", "Captain Football", "Some Guy"], "Mr. Manager")
    team.add_new_player("Dave Supercool")
    assert_equal(["Hendrik Larsson", "Captain Football", "Some Guy", "Dave Supercool"], team.players)
  end

  # Add a method that takes in a string of a player's name
  # and checks to see if they are in the players array.

  def test_player_search
    team = SportsTeam.new("Celtic", ["Hendrik Larsson", "Captain Football", "Some Guy"], "Mr. Manager")
    search_result = team.player_search("Captain Football")
    assert_equal(true, search_result)
  end


  # Add a points property into your class that starts at 0.

  # Create a method that takes in whether the team has won or
  # lost and updates the points property for a win.

  def test_point_counter
    team = SportsTeam.new("Celtic", ["Hendrik Larsson", "Captain Football", "Some Guy"], "Mr. Manager")
    team.point_counter("Win")
    assert_equal(1, team.points)
  end












end
