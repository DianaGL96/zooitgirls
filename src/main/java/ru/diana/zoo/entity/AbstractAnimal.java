package ru.diana.zoo.entity;

public abstract class AbstractAnimal {
    abstract void eat();
    void play() {
        System.out.println("Я - животное, и люблю играть с человеком\n");
    }
}
