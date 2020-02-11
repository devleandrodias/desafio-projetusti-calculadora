import React, { Fragment } from "react";
import Calculator from "./components/Calculator";
import Global from "./style/global";

const App: React.FC = () => (
  <Fragment>
    <Global />
    <Calculator />
  </Fragment>
);

export default App;
