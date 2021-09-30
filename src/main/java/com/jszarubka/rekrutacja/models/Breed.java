package com.jszarubka.rekrutacja.models;

import java.util.Comparator;

public enum Breed implements Comparator<Breed> {
    GERMANSHEPARD,
    PUG,
    PEKINGESE,
    DACHSHUND,
    UNKNOWNPRODUCTION;

    @Override
    public int compare(Breed o1, Breed o2) {
        return o1.name().compareTo(o2.name());
    }
}
