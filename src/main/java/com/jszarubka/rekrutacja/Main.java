package com.jszarubka.rekrutacja;

import com.jszarubka.rekrutacja.models.Breed;
import com.jszarubka.rekrutacja.models.Dog;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Dog dachhund = new Dog().setBreed(Breed.DACHSHUND).setName("Szarik").setFciCertificate(true);
        Dog germanShepard = new Dog().setBreed(Breed.GERMANSHEPARD).setName("Burek").setFciCertificate(true);
        Dog pekingese = new Dog().setBreed(Breed.PEKINGESE).setName("Heniek").setFciCertificate(true);
        Dog germanShepardTwo = new Dog().setBreed(Breed.GERMANSHEPARD).setName("Fafik").setFciCertificate(true);
        Dog pug = new Dog().setBreed(Breed.PUG).setName("Gustaw").setFciCertificate(true);
        Dog somethingMixed = new Dog().setBreed(Breed.UNKNOWNPRODUCTION).setName("Demon").setFciCertificate(false);
        Dog pugTwo = new Dog().setBreed(Breed.PUG).setName("Enrice").setFciCertificate(true);


        List<Dog> dogList = List.of(dachhund, germanShepard, pekingese, germanShepard, pug, somethingMixed, germanShepardTwo, pugTwo);
        Map<Breed, List<Dog>> map = new TreeMap<>();

        dogList.forEach(s -> {
            if (map.containsKey(s.breed)) {
                map.get(s.breed).add(s);
            } else {
                List<Dog> dogList1 = new ArrayList<>();
                dogList1.add(s);
                map.put(s.breed, dogList1);
            }
        });
        System.out.println(map);
    }
}
