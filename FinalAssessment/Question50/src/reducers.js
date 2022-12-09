import {  RANDGEN } from './actions';

const initialState = {
  number: 100
};

function reducer(state = initialState, action) {
  switch (action.type) {
    case RANDGEN:
      var min=50;
      var max=50000;
      var res=Math.floor(Math.random() * (max - min) + min);
      return {
        number: res
      };
    
    default:
      return state;
  }
}

export default reducer;