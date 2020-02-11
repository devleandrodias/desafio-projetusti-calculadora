package br.com.projetusti.api.service.impl;

import org.springframework.stereotype.Service;

import br.com.projetusti.api.model.dto.CalculatorDto;
import br.com.projetusti.api.service.CalculatorService;

/**
 * CalculatorServiceImpl
 */
@Service
public class CalculatorServiceImpl implements CalculatorService {

  @Override
  public CalculatorDto calculate(double value1, double value2, int operation) {
    CalculatorDto dto = new CalculatorDto();

    dto.setValue1(value1);
    dto.setValue2(value2);

    switch (operation) {
    case 1:
      dto.setResult(calculateSum(value1, value2));
      dto.setOperation("Sum");
      return dto;
    case 2:
      // Subtração
      break;
    case 3:
      // Multiplicação
      break;
    case 4:
      // Divisão
      break;
    case 5:
      // Exponeciação
      break;
    case 6:
      // Radiciação
      break;
    default:
      // Operação Inválida
      break;
    }

    return dto;
  }

  private double calculateSum(double value1, double value2) {
    return value1 + value2;
  };
}