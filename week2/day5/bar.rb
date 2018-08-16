class Bar

attr_accessor :till_entry_fees, :till_drinks_balance
attr_reader :beer, :wine, :whisky

  def initialize
    @till_entry_fees = 0
    @till_drinks_balance = 0
    @beer = 5
    @wine = 10
    @whisky = 15
  end


end
