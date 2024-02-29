package ru.diana.zoo.entity;

public class Zookeeper {
    public void makeEat (AbstractAnimal abstractAnimal) {
        System.out.println("Я - смотритель за животными, и сейчас я буду кормить животных");
        abstractAnimal.eat();
    }
    public void makePlay (AbstractAnimal abstractAnimal) {
        System.out.println("Я - смотритель за животными, и сейчас я буду играть с животным");
        abstractAnimal.play();
    }
}
