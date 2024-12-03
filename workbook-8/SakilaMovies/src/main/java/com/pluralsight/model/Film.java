package com.pluralsight.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Film {
    private int filmId;
    private String title;
    private String description;
    private LocalDate releaseYear;
    private int length;
}
