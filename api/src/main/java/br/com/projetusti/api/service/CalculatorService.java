package br.com.projetusti.api.service;

import br.com.projetusti.api.model.dto.CalculatorDto;

/**
 * CalculatorService
 */
public interface CalculatorService {

  CalculatorDto calculate(double value1, double value2, int operation);
}