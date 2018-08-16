import React, {Component} from 'react';
import FilmList from '../components/FilmList.js'

class FilmBox extends Component{
  constructor(props){
    super(props); //Why is super required here? Nothing being thrown up the chain?
    this.state = {
      films: [ {id:1, title: "Ant Man And The Wasp"},
        {id:2, title: "Mamma Mia! Here We Go Again"},
        {id:3, title: "The Meg"},
        {id:4, title: "Incredibles 2"},
        {id:5, title: "Hotel Transylvania 3: Summer Vacation"},
        {id:6, title: "Mission Impossible: Fallout"},
        {id:7, title: "The Darkest Minds"},
        {id:8, title: "Teen Titans Go! To the Movies"},
        {id:9, title: "Unfriended: Dark Web"},
        {id:10, title: "The First Purge"}
      ]
    }
  }

  render(){
    return <div className="filmbox">
      <h3>In Cinemas This Week:</h3>
         <FilmList data = {this.state.films}/> {/*This is where information is passed to the next component in the chain as props.*/}
    </div>
  }

}

export default FilmBox;
