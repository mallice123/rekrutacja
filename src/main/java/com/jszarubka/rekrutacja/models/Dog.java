package com.jszarubka.rekrutacja.models;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Dog {

    public String name;
    public Breed breed;
    public Boolean fciCertificate;
}