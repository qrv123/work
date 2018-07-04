import React, { Component } from 'react';
import logo from './logo.svg';
import girl from './girl.jpg';
import './App.css';

class App extends Component {
  render() {
    return (
      <div className="App">
        <header className="App-header">
          <img src={logo} id="App-logo" alt="logo" />
          <h1 className="App-title">Welcome to React</h1>
        </header>
        <p className="App-intro">
          To get started, edit <code>src/App.js</code> and save to reload.
        </p>
        <img src={girl} id="App-logo" alt = "Girl" />
      </div>
    );
  }
}

class TestTing extends Component{
  render(){
    return(
      <div className="Optimus">
        <img src={require('./girl.jpg')} id="App-logo" alt = "Girl" />
      </div>
    );
  }
}

class Board extends Component {
  render(){
    return<Square value={i} />;
  }
}

class Square extends Component {
  render() {
    return(
      <button className="square">
        {this.props.value}
      </button>

    );
  }
}

export {
  App,
  TestTing
};