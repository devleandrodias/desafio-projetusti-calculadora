import { createGlobalStyle } from "styled-components";

export default createGlobalStyle`
 @import url('https://fonts.googleapis.com/css?family=Nunito&display=swap');

  * { 
    margin: 0;
    padding: 0;
    outline: 0;
    box-sizing: 0;
  }

  *:focus {
    outline: 0;
  }
  
  html, body, #root {
    height: 100%;
  }

  body {
    -webkit-font-smoothing: antialiased;
  }

  body, input, label {
    font-size: 15px;
    font-family: 'Nunito', sans-serif;
    color: #fff;
    text-align: left;
  }
  
  a {
    text-decoration: none;
  }

  ul {
    list-style: none;
  }
  
  button {
    cursor: pointer;
  }

  input[type=number]::-webkit-inner-spin-button { 
    -webkit-appearance: none;  
  }

  input[type=number] { 
   -moz-appearance: textfield;
   appearance: textfield;
  }
`;
