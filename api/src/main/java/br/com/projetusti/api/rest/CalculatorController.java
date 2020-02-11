package br.com.projetusti.api.rest;

import org.springframework.http.ResponseEntity;

/**
 * Interfaces de contrato da camada REST.
 *
 * @author Leandro Dias
 * @since 10/02/2020
 */

public interface CalculatorController {
  ResponseEntity<?> calculateSum(double value1, double value2);

  ResponseEntity<?> calculateSubtraction(double value1, double value2);

  ResponseEntity<?> calculateMultiplication(double value1, double value2);

  ResponseEntity<?> calculateDivision(double value1, double value2);

  ResponseEntity<?> calculateExponentiation(double value, int exponent);

  ResponseEntity<?> calculateRadication(double value);
}