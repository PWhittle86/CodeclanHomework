class Room

attr_reader :room_name, :available_space, :playlist, :guests_in_room

def initialize(room_name, initial_capacity)
  @room_name = room_name
  @available_space = initial_capacity
  @playlist = []
  @guests_in_room = []
end

  def add_to_playlist(song_to_add)
    @playlist << song_to_add
  end

 def remove_from_playlist(song_to_remove)
   @playlist.delete(song_to_remove)
 end

 def check_in_guest(guest_to_check_in)
   if @available_space >= 1
     @guests_in_room << guest_to_check_in
     @available_space -= 1
   else
     return "Sorry, this room is full. Please try another."
   end
 end

 def check_out_guest(guest_to_check_out)
   @guests_in_room.delete(guest_to_check_out)
   @available_space += 1
 end

 def charge_guest_for_entry(guest_to_check_in, bar)
   if guest_to_check_in.money >= 10
     guest_to_check_in.money -= 10
     bar.till_entry_fees += 10
   else
     return "Sorry, but you do not have sufficient funds. The fee is 10 smackeroonies."
   end
 end

 def charge_guest_for_drink(guest, drink, bar)
   if guest.money >= drink
     guest.money = guest.money - drink
     bar.till_drinks_balance += drink
   else
     return "Sorry, you don't have enough cash for that drink. It costs #{drink} smackaroonies."
   end

 end


end
