package br.com.projetusti.api.service;

import br.com.projetusti.api.dto.CalculatorDto;

/**
 * Interfaces de contrato da camada de serviço.
 *
 * @author Leandro Dias
 * @since 10/02/2020
 */
public interface CalculatorService {

  CalculatorDto calculateSum(double value1, double value2);

  CalculatorDto calculateSubtraction(double value1, double value2);

  CalculatorDto calculateMultiplication(double value1, double value2);

  CalculatorDto calculateDivision(double value1, double value2);

  CalculatorDto calculateExponentiation(double value1, double value2);

  CalculatorDto calculateRadication(double value);
}