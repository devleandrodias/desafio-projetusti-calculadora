import React, { Fragment } from "react";
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

// interface ICalculator {
//   value1: number;
//   value2: number;
//   result: number;
// }

const Calculator: React.FC = () => {
  // const [data, setData] = useState<ICalculator>();

  return (
    <Fragment>
      <Wrapper>
        <Container>
          <Title>
            <FaCalculator color="#fff" fontSize="75px" />
          </Title>
          <Form>
            <Group>
              <Label>Primeiro Valor</Label>
              <Input type="number" />
            </Group>
            <Group>
              <Label>Segundo Valor</Label>
              <Input type="number" />
            </Group>
            <Group>
              <Label>Operação</Label>
              <Selected name="operations">
                <Option value={1}>+</Option>
                <Option value={1}>-</Option>
                <Option value={1}>*</Option>
                <Option value={1}>/</Option>
                <Option value={1}>√</Option>
                <Option value={1}>^</Option>
              </Selected>
            </Group>
            <Button type="submit">Calcular</Button>
          </Form>
          <Group style={{ marginTop: "25px" }}>
            <Label htmlFor="result">Resultado</Label>
            <Input type="number" name="result" disabled />
          </Group>
        </Container>
      </Wrapper>
    </Fragment>
  );
};

export default Calculator;
