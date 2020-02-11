import React, { Fragment, Component } from "react";
import { FaCalculator } from "react-icons/fa";
import {
  Container,
  Input,
  Label,
  Selected,
  Button,
  Form,
  Option,
  Wrapper,
  Title,
  Group
} from "./style";

import api from "../service/api";

interface ICalculator {
  value1: number;
  value2: number;
  operation: number;
  result: number;
  isRadication: boolean;
}

export class Calculator extends Component<{}, ICalculator> {
  constructor(props: any) {
    super(props);

    this.state = {
      value1: 0,
      value2: 0,
      operation: 0,
      result: 0,
      isRadication: false
    };
  }

  handleSubmit = () => {
    const { operation, value1, value2 } = this.state;

    switch (operation) {
      case 0:
        api
          .get(`/protected/sum/${value1}/${value2}`)
          .then(res => this.setState({ result: res.data.result }));
        break;
      case 1:
        api
          .get(`/protected/subtraction/${value1}/${value2}`)
          .then(res => this.setState({ result: res.data.result }));
        break;
      case 2:
        api
          .get(`/protected/multiplication/${value1}/${value2}`)
          .then(res => this.setState({ result: res.data.result }));
        break;
      case 3:
        api
          .get(`/protected/division/${value1}/${value2}`)
          .then(res => this.setState({ result: res.data.result }));
        break;
      case 4:
        api
          .get(`/protected/radication/${value1}`)
          .then(res => this.setState({ result: res.data.result }));
        break;
      case 5:
        api
          .get(`/protected/exponentiation/${value1}/${value2}`)
          .then(res => this.setState({ result: res.data.result }));
        break;
      default:
        this.setState({
          isRadication: false,
          operation: 0,
          result: 0,
          value1: 0,
          value2: 0
        });
        break;
    }
  };

  render() {
    const { isRadication } = this.state;

    return (
      <Fragment>
        <Wrapper>
          <Container>
            <Title>
              <FaCalculator color="#fff" fontSize="75px" />
            </Title>
            <Form onSubmit={e => e.preventDefault()}>
              <Group>
                <Label>Primeiro Valor</Label>
                <Input
                  type="number"
                  name="value1"
                  onChange={e =>
                    this.setState({ value1: parseInt(e.target.value) })
                  }
                />
              </Group>
              {!isRadication && (
                <Group>
                  <Label>Segundo Valor</Label>
                  <Input
                    type="number"
                    name="value2"
                    onChange={e =>
                      this.setState({ value2: parseInt(e.target.value) })
                    }
                  />
                </Group>
              )}
              <Group>
                <Label>Operação</Label>
                <Selected
                  name="operations"
                  onChange={e => {
                    const response = e.target.value;
                    if (response === "4") {
                      this.setState({
                        operation: parseInt(e.target.value),
                        isRadication: true
                      });
                    } else
                      this.setState({
                        operation: parseInt(e.target.value),
                        isRadication: false
                      });
                  }}
                >
                  <Option value={0}>+</Option>
                  <Option value={1}>-</Option>
                  <Option value={2}>*</Option>
                  <Option value={3}>/</Option>
                  <Option value={4}>√</Option>
                  <Option value={5}>^</Option>
                </Selected>
              </Group>
              <Button type="button" onClick={this.handleSubmit}>
                Calcular
              </Button>
            </Form>
            <Group style={{ marginTop: "25px" }}>
              <Label htmlFor="result">Resultado</Label>
              <Input
                type="number"
                name="result"
                value={this.state.result}
                disabled
              />
            </Group>
          </Container>
        </Wrapper>
      </Fragment>
    );
  }
}
export default Calculator;
