const Record = function(artist, title, genre, price){
  this.artist = artist;
  this.title = title;
  this.genre = genre;
  this.price = price;
}

Record.prototype.info = function() {
  return `${this.title} by ${this.artist} is a ${this.genre} album which costs £${this.price}.`
};

module.exports = Record;
