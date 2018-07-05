import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
//import Game from './App';
import Square from './App'
import Board from './App'
import registerServiceWorker from './registerServiceWorker';

ReactDOM.render(<Board />, document.getElementById('root'));

registerServiceWorker();
