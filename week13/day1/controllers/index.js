const express = require('express');
const router = new express.Router();

router.get('/', function(req, res){
	res.json({data: 'Welcome!'});
})

router.use('/ps4', require('./ps4')); //Redirects to the PS4 router.
router.use('/switch', require('./switch')); //Redirects to the PS4 router.

module.exports = router;