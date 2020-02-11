package br.com.projetusti.api.rest;

import org.springframework.http.ResponseEntity;

/**
 * Interfaces de contrato da camada REST.
 *
 * @author Leandro Dias
 * @since 10/02/2020
 */

public interface CalculatorController {
  ResponseEntity<?> calculate(double value1, double value2);
}