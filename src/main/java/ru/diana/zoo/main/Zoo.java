package ru.diana.zoo.main;

import ru.diana.zoo.entity.Leopard;
import ru.diana.zoo.entity.Panda;
import ru.diana.zoo.entity.Turtle;
import ru.diana.zoo.entity.Zookeeper;

public class Zoo {
    public static void main (String[] args) {
        Zookeeper zookeeper = new Zookeeper();
        Panda panda = new Panda();
        Turtle turtle = new Turtle();
        Leopard leopard = new Leopard();

        System.out.println("Сейчас смотритель за животными покормит их:\n");
        zookeeper.makeEat(panda);
        zookeeper.makeEat(turtle);
        zookeeper.makeEat(leopard);
        System.out.println("\n----------------------------------------------\n");
        System.out.println("Сейчас смотритель за животными будет играть с ними: \n");
        zookeeper.makePlay(panda);
        zookeeper.makePlay(turtle);
        zookeeper.makePlay(leopard);

    }
}
