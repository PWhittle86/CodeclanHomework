import React, {Component} from 'react';
import TopTwenty from '../components/TopTwenty.js'
import ChartEntry from '../components/ChartEntry.js'

class SongContainer extends Component{

  constructor(props){
    super(props);
    this.state = {
      songs: []
    }
  }

  componentDidMount(){
    fetch('https://itunes.apple.com/gb/rss/topsongs/limit=20/json')
    .then(responseText => responseText.json())
    .then(songsData => this.setState({songs: songsData.feed.entry}))
  }

  render(){
    return(
      <TopTwenty songList={this.state.songs}/>
    )
  }

}

export default SongContainer;
