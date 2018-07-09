import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './component/App';
import Button from './component/Button';
import ButtonPanel from "./component/ButtonPanel"
import registerServiceWorker from './registerServiceWorker';

ReactDOM.render(<App />, document.getElementById('root'));
registerServiceWorker();