package br.com.projetusti.api.rest.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetusti.api.rest.CalculatorController;
import br.com.projetusti.api.service.impl.CalculatorServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * Interfaces de contrato da camada REST.
 *
 * @author Leandro Dias
 * @since 10/02/2020
 */
@RestController
@RequestMapping("api/v1")
@Api(value = "API ProjetusTI")
@CrossOrigin(origins = "*")
public class CalculatorControllerImpl implements CalculatorController {

  @Autowired
  CalculatorServiceImpl service;

  @Override
  @ApiOperation(value = "Calculate sum value 1 and value 2")
  @GetMapping(path = "/protected/sum/{value1}/{value2}")
  public ResponseEntity<?> calculateSum(@PathVariable double value1, @PathVariable double value2) {
    return new ResponseEntity<>(service.calculateSum(value1, value2), HttpStatus.OK);
  }

  @Override
  @ApiOperation(value = "Calculate subtration value 1 and value 2")
  @GetMapping(path = "/protected/subtraction/{value1}/{value2}")
  public ResponseEntity<?> calculateSubtraction(@PathVariable double value1, @PathVariable double value2) {
    return new ResponseEntity<>(service.calculateSubtraction(value1, value2), HttpStatus.OK);
  }

  @Override
  @ApiOperation(value = "Calculate multiplication value 1 and value 2")
  @GetMapping(path = "/protected/multiplication/{value1}/{value2}")
  public ResponseEntity<?> calculateMultiplication(double value1, double value2) {
    return new ResponseEntity<>(service.calculateMultiplication(value1, value2), HttpStatus.OK);
  }

  @Override
  @ApiOperation(value = "Calculate division value 1 and value 2")
  @GetMapping(path = "/protected/division/{value1}/{value2}")
  public ResponseEntity<?> calculateDivision(double value1, double value2) {
    return new ResponseEntity<>(service.calculateDivision(value1, value2), HttpStatus.OK);
  }

  @Override
  @ApiOperation(value = "Calculate exponentiation value 1 with exponent")
  @GetMapping(path = "/protected/exponentiation/{value1}/{exponent}")
  public ResponseEntity<?> calculateExponentiation(double value, int exponent) {
    return new ResponseEntity<>(service.calculateExponentiation(value, exponent), HttpStatus.OK);
  }

  @Override
  @ApiOperation(value = "Calculate radication of value")
  @GetMapping(path = "/protected/radication/{value}")
  public ResponseEntity<?> calculateRadication(double value) {
    return new ResponseEntity<>(service.calculateRadication(value), HttpStatus.OK);
  }
}