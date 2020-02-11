import styled from "styled-components";

export const Wrapper = styled.div`
  height: 100%;
  background: linear-gradient(-75deg, #c31432, #240b36);
  display: flex;
  justify-content: center;
  align-items: center;
`;

export const Container = styled.div`
  width: 100%;
  max-width: 315px;
  text-align: center;
`;

export const Input = styled.input`
  background: rgba(0, 0, 0, 0.1);
  border: 0;
  border-radius: 4px;
  height: 45px;
  padding: 0 15px;
  color: #fff;
  margin-bottom: 10px;
  font-size: 15px;
  &::placeholder {
    color: rgba(255, 255, 255, 0.7);
  }
`;

export const Selected = styled.select`
  background: rgba(0, 0, 0, 0.1);
  border: 0;
  border-radius: 4px;
  height: 45px;
  padding: 0 15px;
  color: #fff;
  margin-bottom: 10px;
  font-size: 15px;
  &::placeholder {
    color: rgba(255, 255, 255, 0.7);
  }
`;

export const Option = styled.option`
  background: #690d2f;
`;

export const Label = styled.label`
  margin-bottom: 5px;
`;

export const Button = styled.button`
  margin: 5px 0 0;
  height: 42px;
  background: #da4453;
  color: #fff;
  border: 0;
  border-radius: 4px;
  font-size: 16px;
`;

export const Form = styled.form`
  display: flex;
  flex-direction: column;
  margin-top: 30px;
`;

export const Title = styled.h1``;

export const Group = styled.div`
  display: flex;
  flex-direction: column;
`;
