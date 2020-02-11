package br.com.projetusti.api.model.dto;

import lombok.Data;

/**
 * CalculatorDto
 */
@Data
public class CalculatorDto {

  private double value1;

  private double value2;

  private double result;

  private String operation;
}