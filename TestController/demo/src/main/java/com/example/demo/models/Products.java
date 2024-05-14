package com.example.demo.models;


import jakarta.validation.constraints.*;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Products {
    @NotNull(message = "Id cannot be null")
    private int id;
    @NotNull(message = "Name cannot be null")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    private String name;
    private String description;
    @NotNull
    @DecimalMin(value = "0.0", inclusive = true)
    private double price;
}
