import React, { Fragment } from "react";
import {
  Container,
  Input,
  Label,
  Selected,
  Button,
  Form,
  Option
} from "./style";

// interface ICalculator {
//   value1: number;
//   value2: number;
//   result: number;
// }

const Calculator: React.FC = () => {
  // const [data, setData] = useState<ICalculator>();

  return (
    <Fragment>
      <Container>
        <Form>
          <Input type="number" />
          <Selected name="operations">
            <Option value={1}>+</Option>
            <Option value={1}>+</Option>
            <Option value={1}>+</Option>
            <Option value={1}>+</Option>
            <Option value={1}>+</Option>
            <Option value={1}>+</Option>
          </Selected>
          <Input type="number" />
          <Button type="submit">Calcular</Button>
        </Form>
        <Label htmlFor="result">Resultado</Label>
        <Input type="number" name="result" disabled />
      </Container>
    </Fragment>
  );
};

export default Calculator;
