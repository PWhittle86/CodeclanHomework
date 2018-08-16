require( 'sinatra' )
require( 'sinatra/contrib/all' )
require_relative('controllers/zombies_controller')
require_relative('controllers/victims_controller')
require_relative('controllers/bitings_controller')

#Rather than having all of our code within a single controller, we have split them into three separate files. This is much neater.

get '/' do
  erb( :index )
end
