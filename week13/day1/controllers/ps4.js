const express = require('express');
const ps4Router = new express.Router();

let ps4Games = [{'title': 'God Of War'}, {'title':'Street Fighter V'}, {'title':'BloodBorne'}];

//View the index of games.
ps4Router.get('/', function(req, res){
	res.json(ps4Games);
})

//Show a specific game.
ps4Router.get('/:id', function(req, res){
	gameIndex = req.params.id;
	res.json(ps4Games[gameIndex]);
})

//Create a game
ps4Router.post('/', function(req, res){
	ps4Games.push(req.body.game);
	res.json(ps4Games);
})

//Update a game
ps4Router.put('/:id', function(req, res){
	gameIndex = req.params.id;
	ps4Games[gameIndex] = req.body.game;
	res.json(ps4Games);
})

//Delete a game
ps4Router.delete('/:id', function(req, res){
	gameIndex = req.params.id;
	ps4Games.splice(gameIndex, 1);
	res.json(ps4Games);
})

module.exports = ps4Router;