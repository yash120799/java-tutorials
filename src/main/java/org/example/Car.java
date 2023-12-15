package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class Car {
    private String carName;
    private String colour;
    private Integer price;
}
