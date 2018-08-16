import React, {Component} from 'react';
import ChartEntry from './ChartEntry.js';

const TopTwenty = (props) =>{

  console.log(props);

  const songs = props.songList.map(song => {
    
  })

  return(
    <ol>
      {songs}
    </ol>
  )

}



export default TopTwenty;
