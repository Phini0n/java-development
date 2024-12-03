package com.pluralsight.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Actor {
    private int actorId;
    private String firstName;
    private String lastName;
}