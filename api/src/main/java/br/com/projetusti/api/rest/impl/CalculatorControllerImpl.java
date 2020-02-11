package br.com.projetusti.api.rest.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetusti.api.rest.CalculatorController;
import br.com.projetusti.api.service.impl.CalculatorServiceImpl;

/**
 * Interfaces de contrato da camada REST.
 *
 * @author Leandro Dias
 * @since 10/02/2020
 */
@RestController
@RequestMapping("api/v1")
public class CalculatorControllerImpl implements CalculatorController {

  @Autowired
  CalculatorServiceImpl service;

  @Override
  @GetMapping(path = "/protected/sum/{value1}/{value2}")
  public ResponseEntity<?> calculateSum(@PathVariable double value1, @PathVariable double value2) {
    return new ResponseEntity<>(service.calculateSum(value1, value2), HttpStatus.OK);
  }

  @Override
  @GetMapping(path = "/protected/subtraction/{value1}/{value2}")
  public ResponseEntity<?> calculateSubtraction(@PathVariable double value1, @PathVariable double value2) {
    return new ResponseEntity<>(service.calculateSubtraction(value1, value2), HttpStatus.OK);
  }

  @Override
  @GetMapping(path = "/protected/multiplication/{value1}/{value2}")
  public ResponseEntity<?> calculateMultiplication(double value1, double value2) {
    return new ResponseEntity<>(service.calculateMultiplication(value1, value2), HttpStatus.OK);
  }

  @Override
  @GetMapping(path = "/protected/division/{value1}/{value2}")
  public ResponseEntity<?> calculateDivision(double value1, double value2) {
    return new ResponseEntity<>(service.calculateDivision(value1, value2), HttpStatus.OK);
  }

  @Override
  @GetMapping(path = "/protected/exponentiation/{value1}/{value2}")
  public ResponseEntity<?> calculateExponentiation(double value1, double value2) {
    return new ResponseEntity<>(service.calculateExponentiation(value1, value2), HttpStatus.OK);
  }

  @Override
  @GetMapping(path = "/protected/radication/{value}")
  public ResponseEntity<?> calculateRadication(double value) {
    return new ResponseEntity<>(service.calculateRadication(value), HttpStatus.OK);
  }
}