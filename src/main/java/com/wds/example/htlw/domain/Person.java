package com.wds.example.htlw.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @Id
     private int id;

    private String name;

    private String lastName;

    private LocalDate birthDate;


}
