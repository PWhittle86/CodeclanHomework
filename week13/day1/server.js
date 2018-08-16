const express = require('express');
const app = express();
const bodyParser = require('body-parser');

app.use(bodyParser.json());
app.use(bodyParser.urlencoded({extended: true}));

app.listen(3000, function(){
	console.log('App is running, listening to port 3000.')
})

app.use(require('./controllers/index.js'))