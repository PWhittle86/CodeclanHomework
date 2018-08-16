const makeRequest = function(url, callback){
  const request = new XMLHttpRequest();
  request.open('GET', url);
  request.addEventListener('load', callback);
  request.send();
}

const requestComplete = function(){
  if(this.status !== 200) return;
  const jsonString = this.responseText;
  const beers = JSON.parse(jsonString);
  createBeersList(beers);
}

const createBeersList = function(beers){
  let beersTag = document.getElementById('beers');
  beers.forEach(function(beer, id){

    let beerDiv = document.createElement('div');
    beerDiv.classList.add('beer');
    beersTag.appendChild(beerDiv);

    let beerHeading = document.createElement('h3');
    beerHeading.innerText = beer.name;
    beerHeading.value = id;
    beerDiv.appendChild(beerHeading);

    let beerImage = document.createElement('img');
    beerImage.src = beer.image_url;
    beerDiv.appendChild(beerImage);

  })
}

var app = function(){
  const url = 'https://api.punkapi.com/v2/beers';
  makeRequest(url, requestComplete);
}

window.addEventListener('load', app);
