import React, { Fragment } from "react";

type CardProps = {
  value1: number;
  value2: number;
};

export default ({ value1, value2 }: CardProps) => (
  <Fragment>
    <h1>Componente de Cálculo</h1>
    <h2>Value 1: {value1}</h2>
    <h2>Value 2: {value2}</h2>
  </Fragment>
);
