import React, { Component } from 'react';
import { connect } from 'react-redux';

const containerStyle = {
  display: 'flex'
}
const buttonStyle = {
  fontSize: '1.5rem',
  width: '360px',
  height: '50px'
}

class Counter extends Component {

  randGen=()=>{
    console.log('Generating random number');
    this.props.dispatch({type:'RANDGEN'});
  }

  render() {
    return (
      <div className="App" >
        <header className="App-header">
          <h1>{this.props.number}</h1>
          <div style={containerStyle}>
            <button onClick={this.randGen} type="button" style={buttonStyle}>Generate Random Number</button>
            
          </div>
        </header>
      </div>
    );
  }
}

const mapStateToProps = (state) => {
  return {
    number: state.number
  };
}

export default connect(mapStateToProps)(Counter);
