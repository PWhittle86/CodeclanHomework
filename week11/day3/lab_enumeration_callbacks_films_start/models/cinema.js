const Cinema = function (films) {
  this.films = films;
};

Cinema.prototype.filmTitles = function(){
  return this.films.map(function(film) {
    return film.title;
  })
};

Cinema.prototype.findFilmByTitle = function(filmList, filmTitle){
  return filmList.find(function(film){
    return film.title === filmTitle;
  })
}

Cinema.prototype.filterFilmsByGenre = function(filmList, genre){
  return filmList.filter(film => film.genre === genre);
}

Cinema.prototype.filmsFromYear = function(filmList, year) {
  return filmList.some(year);
};

Cinema.prototype.filmsAboveLength = function(filmList, length) {
  let length_checker = function(film){
    return film.length > length;
  }
  return filmList.every(length_checker);
}

Cinema.prototype.totalRunningTime = function(filmList) {
  output = 0;
  filmList.forEach(function(film){
    output += film.length
  });
  return output;
};

module.exports = Cinema;
