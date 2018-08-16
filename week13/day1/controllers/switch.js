const express = require('express');
const switchRouter = new express.Router();

let switchGames = ['Breath of the Wild', 'Super Mario Oddyssey', 'Mario Kart 8'];

//View the index of games.
switchRouter.get('/', function(req, res){
	res.json(switchGames);
})

//Show a specific game.
switchRouter.get('/:id', function(req, res){
	gameIndex = req.params.id;
	res.json(switchGames[gameIndex]);
})

//Create a game
switchRouter.post('/', function(req, res){
	switchGames.push(req.body.game);
	res.json(switchGames);
})

//Update a game
switchRouter.put('/:id', function(req, res){
	gameIndex = req.params.id;
	switchGames[gameIndex] = req.body.game;
	res.json(switchGames);
})

//Delete a game
switchRouter.delete('/:id', function(req, res){
	gameIndex = req.params.id;
	switchGames.splice(gameIndex, 1);
	res.json(switchGames);
})

module.exports = switchRouter;