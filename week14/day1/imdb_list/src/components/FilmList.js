import React, {Component} from 'react';
import Film from './Film.js'

const FilmList = (props) =>{
  const filmData = props.data.map(film =>{
    return(
      <Film key = {film.id} title = {film.title}> //This is where the props information from Film is thrown down
        {film.title}
      </Film>
    )
  })
  return <div className="filmlist">{filmData}</div>
}

export default FilmList;
