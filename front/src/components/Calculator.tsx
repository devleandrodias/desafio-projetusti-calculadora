import React, { Fragment } from "react";

interface IState {
  value1: number;
  value2: number;
  operation: number;
  result: number;
}

export default class Calculator extends React.Component<{}, IState> {
  constructor(props: {}) {
    super(props);

    this.state = {
      value1: 0,
      value2: 0,
      operation: 0,
      result: 0
    };
  }

  handSubmit(e: any) {
    e.preventDefault();

    const { operation } = this.state;

    switch (operation) {
      case 1:
        // Adição
        break;
      case 2:
        // Subtração
        break;
      case 3:
        // Multiplicação
        break;
      case 4:
        //Divisão
        break;
      case 5:
        // Radiciação
        break;
      case 6:
        // Exponenciação
        break;
      default:
        // Operação Inválida
        break;
    }
  }

  render() {
    return (
      <Fragment>
        <form onSubmit={e => this.handSubmit(e)}>
          <input
            type="number"
            name="value1"
            onChange={e => this.setState({ value1: parseInt(e.target.value) })}
          />
          <select
            id="operations"
            onChange={e => this.setState({ value2: parseInt(e.target.value) })}
          >
            <option value={1}>+</option>
            <option value={2}>-</option>
            <option value={3}>*</option>
            <option value={4}>/</option>
            <option value={5}>√</option>
            <option value={6}>^</option>
          </select>
          <input
            type="number"
            name="value2"
            onChange={e =>
              this.setState({ operation: parseInt(e.target.value) })
            }
          />
          <button type="submit">Enviar</button>
        </form>
        <label htmlFor="">Resultado</label>
        <input type="text" name="result" disabled value={this.state.result} />
      </Fragment>
    );
  }
}
