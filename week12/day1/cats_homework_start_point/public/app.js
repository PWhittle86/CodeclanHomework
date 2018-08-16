// const new_cat = function(){
//   let catList = document.createElement('ul');
//   catList.classList.add('cat');
//
//   let catName = document.createElement('li');
//   catName.innerText = ('New Cat Name Goes Here');
//
//   let catFood = document.createElement('li');
//   catFood.innerText = ('Cat\'s favourite food goes here.');
//
//   let catImage = document.createElement('img');
//   catImage.setAttribute('width', '500');
//   catImage.setAttribute('src', 'https://images.pexels.com/photos/20787/pexels-photo.jpg?cs=srgb&dl=adorable-animal-cat-20787.jpg&fm=jpg');
//
//   catList.appendChild(catFood);
//   catList.appendChild(catName);
//   catList.appendChild(catImage);
//
//   let cats = document.querySelector('#cats');
//   cats.appendChild(catList);
// }

const addCat = function(catNameText, catFoodText, catImageURL){
  let catList = createCatList();
  let catName = createCatName(catNameText);
  let catFood = createCatFood(catFoodText)
  let catImage = createCatImage(catImageURL);
  appendElements(catList, catName, catFood, catImage, cats);
}

const createCatList = function(){
  let catList = document.createElement('ul');
  catList.classList.add('cat');
  return catList;
}

const createCatName = function(catNameText){
  let catName = document.createElement('li');
  catName.innerText = catNameText;
  return catName;
}

const createCatFood = function(catFoodText){
  let catFood = document.createElement('li');
  catFood.innerText = (catFoodText);
  return catFood;
}

const createCatImage = function(catImageURL){
  let catImage = document.createElement('img');
  catImage.setAttribute('src', catImageURL);
  return catImage;
}

const appendElements = function(catList, catName, catFood, catImage){
  catList.appendChild(catName);
  catList.appendChild(catFood);
  catList.appendChild(catImage);

  var cats = document.querySelector('#cats');
  cats.appendChild(catList);
}

var app = function(){
  addCat('Milo', 'Bacon', 'https://images.pexels.com/photos/20787/pexels-photo.jpg?cs=srgb&dl=adorable-animal-cat-20787.jpg&fm=jpg');
  addCat('Boba', 'Sock fluff', 'http://66.media.tumblr.com/d1f01bbe0150fda0c40d2151c5eaeac8/tumblr_odlqqskjj61v9cejwo1_400.jpg');
  addCat('Barnaby', 'Tuna', 'https://68.media.tumblr.com/88d0fcf2b84a7b098dda839130597569/tumblr_okuo4teiql1uhevdso1_1280.jpg');
  addCat('Max', 'Whiskas Temptations', 'http://66.media.tumblr.com/7c5784ea89369c780e782bf10c60315a/tumblr_npb0hlYwhV1u63jaco1_1280.jpg');
}

window.onload = app;
