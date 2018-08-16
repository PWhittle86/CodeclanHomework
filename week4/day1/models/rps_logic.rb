
class Rps

  def initialize(player1, player2)
    @player1 = player1.downcase
    @player2 = player2.downcase
  end

  def play_rps
    if (@player1 == "rock" || @player2 == "rock") && (@player1 == "scissors" || @player2 == "scissors")
      return "Rock wins!"
    elsif (@player1 == "rock" || @player2 == "rock") && (@player1 == "paper" || @player2 == "paper")
      return "Paper wins!"
    elsif (@player1 == "paper" || @player2 == "paper") && (@player1 == "scissors" || @player2 == "scissors")
      return "Scissors wins!"
    elsif @player1 == @player2
      return "a draw!"
    end
  end

end
