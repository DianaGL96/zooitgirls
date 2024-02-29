package ru.diana.zoo.entity;

public class Turtle extends AbstractAnimal {
    @Override
    void eat() {
        System.out.println("Я - черепаха, и я ем водоросли\n");
    }
    @Override
    void play () {
        System.out.println("Я - черепаха, и я не умею играть\n");
    }
}
