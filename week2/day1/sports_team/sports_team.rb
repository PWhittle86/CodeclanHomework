class SportsTeam

attr_reader :team_name, :players
attr_accessor :coach, :points

  def initialize(team_name, players, coach)
    @team_name = team_name
    @players = players
    @coach = coach
    @points = 0
  end

  # def team_name()
  #   return @team_name
  # end
  #
  # def players()
  #   return @players
  # end
  #
  # def coach()
  #   return @coach
  # end
  #
  # def change_coach(new_coach)
  #   @coach = new_coach
  # end

  def add_new_player(new_player)
    @players.push(new_player)
  end

  def player_search(named_player)
    for player in @players
      if player == named_player
        return true
      end
    end
    return false
  end

  def point_counter(result)
    if result == "Win"
      @points += 1
    end
  end
















end
