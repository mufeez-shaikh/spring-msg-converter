package com.ms.msgconverter.converters;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Getter
@Builder(toBuilder = true)
public class Person {
    String firstName;
    String lastName;
    String city;

}
