package br.com.projetusti.api.service.impl;

import org.springframework.stereotype.Service;

import br.com.projetusti.api.dto.CalculatorDto;
import br.com.projetusti.api.service.CalculatorService;

/**
 * Implementação das interfaces da camada de serviço.
 *
 * @author Leandro Dias
 * @since 10/02/2020
 */
@Service
public class CalculatorServiceImpl implements CalculatorService {

  @Override
  public CalculatorDto calculateSum(double value1, double value2) {
    CalculatorDto dto = new CalculatorDto();

    double result = value1 + value2;

    dto.setValue1(value1);
    dto.setValue2(value2);
    dto.setResult(result);
    dto.setOperation("Sum");

    return dto;
  };

  @Override
  public CalculatorDto calculateSubtraction(double value1, double value2) {
    CalculatorDto dto = new CalculatorDto();

    double result = value1 - value2;

    dto.setValue1(value1);
    dto.setValue2(value2);
    dto.setResult(result);
    dto.setOperation("Subtraction");

    return dto;
  };

  @Override
  public CalculatorDto calculateMultiplication(double value1, double value2) {
    CalculatorDto dto = new CalculatorDto();

    double result = value1 * value2;

    dto.setValue1(value1);
    dto.setValue2(value2);
    dto.setResult(result);
    dto.setOperation("Multiplication");

    return dto;
  }

  @Override
  public CalculatorDto calculateDivision(double value1, double value2) {
    CalculatorDto dto = new CalculatorDto();

    dto.setValue1(value1);
    dto.setValue2(value2);

    if (value2 != 0) {
      double result = value1 / value2;
      dto.setResult(result);
      dto.setOperation("Division");

    } else {
      dto.setResult(0);
      dto.setOperation("Zero division is not possible");
    }

    return dto;
  }

  @Override
  public CalculatorDto calculateExponentiation(double value1, double value2) {
    CalculatorDto dto = new CalculatorDto();

    double result = Math.pow(value1, value2);

    dto.setValue1(value1);
    dto.setValue2(value2);
    dto.setResult(result);
    dto.setOperation("Exponentiation");

    return dto;
  }

  @Override
  public CalculatorDto calculateRadication(double value) {
    CalculatorDto dto = new CalculatorDto();

    double result = Math.sqrt(value);

    dto.setValue1(value);
    dto.setResult(result);
    dto.setOperation("Radication");

    return dto;
  }
}