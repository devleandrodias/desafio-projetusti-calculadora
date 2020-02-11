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
  @GetMapping(path = "/protected/calculate/{value1}/{value2}/{operation}")
  public ResponseEntity<?> calculate(@PathVariable("value1") double value1, @PathVariable("value2") double value2,
      @PathVariable("operation") int operation) {
    return new ResponseEntity<>(service.calculate(value1, value2, operation), HttpStatus.OK);
  }
}