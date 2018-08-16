class River

attr_reader :name, :fish_in_river

def initialize(river_name)
  @name = river_name
  @fish_in_river = []
end

  def add_fish_to_river(fish)
    @fish_in_river.push(fish)
  end

  def fish_count
    return @fish_in_river.count()
  end

end
