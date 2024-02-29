package ru.diana.zoo.entity;

import java.text.Annotation;

public class Leopard extends AbstractAnimal {
    @Override
    void eat () {
        System.out.println("Я - леопард, и я ем мясо\n");
    }
    @Override
    void play () {
        super.play();
        System.out.println("Я - леопард, я люблю играть, но человеку со мной играть опасно\n");
    }
}
