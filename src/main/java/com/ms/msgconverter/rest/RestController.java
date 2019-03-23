package com.ms.msgconverter.rest;

import com.ms.msgconverter.converters.Person;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@RequestMapping("/person")
public class RestController {

    @GetMapping(produces = MediaType.APPLICATION_XML_VALUE)
    public Person get(){

        return Person.builder().city("surat").firstName("mufiz").lastName("shaikh").build();
    }
}
