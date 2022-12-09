import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import { BrowserRouter as Router, Route, Link, NavLink } from 'react-router-dom'  
import * as serviceWorker from './serviceWorker';

const routing = (  
    <Router>  
      <div>  
        <h1>React Router Example</h1>  
        <Route exact path="/check-your-magic-number" component={App} />  
         
      </div>  
    </Router>  
  )  
ReactDOM.render(<App />, document.getElementById('root'));


