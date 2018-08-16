require('sinatra')
require('sinatra/contrib/all')
require('pry-byebug')
require_relative('./models/rps_logic')
also_reload('models/*')

get '/play_rps/:player1/:player2' do
  game = Rps.new(params[:player1], params[:player2])
  @outcome = game.play_rps
  erb(:result)
end

get '/' do
  erb(:home)
end
