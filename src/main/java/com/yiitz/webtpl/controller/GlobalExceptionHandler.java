package com.yiitz.webtpl.controller;

import javax.servlet.http.HttpServletRequest;

import com.yiitz.webtpl.protocol.Result;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import lombok.extern.log4j.Log4j2;

@RestControllerAdvice
@Log4j2
public class GlobalExceptionHandler {

  @ExceptionHandler(value = Exception.class)
  @ResponseBody
  protected ResponseEntity<Object> handleException(HttpServletRequest request, Exception ex) {
    log.warn("global exception: {}, {}", request.getServletPath(), ex.getMessage());
    ex.printStackTrace();
    return new ResponseEntity<Object>(Result.errorInternal(ex.getMessage()), HttpStatus.OK);
  }

}