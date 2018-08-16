class Bear

  attr_reader :bear_name, :bear_type, :stomach

  def initialize(bear_name, bear_type)
    @bear_name = bear_name
    @bear_type = bear_type
    @stomach = []
  end

  def food_count
    return @stomach.count
  end

  def take_fish(fish, river)
    @stomach.push(fish)
    river.fish_in_river.pop
  end

  def rawr
    return "RAWR!"
  end

end
