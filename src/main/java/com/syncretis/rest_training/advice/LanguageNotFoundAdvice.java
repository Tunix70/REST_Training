package com.syncretis.rest_training.advice;

import com.syncretis.rest_training.exception.LanguageNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class LanguageNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(LanguageNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String languageNotFoundAdvice(LanguageNotFoundException e) {
        return e.getMessage();
    }
}