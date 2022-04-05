package Classes;

import java.util.Random;

public class Cat {
    Random random = new Random();
    String name;
    int age;
    String color;
    int health;

    Cat(String CatName, int CatAge, String CatColor) {
        name = CatName;
        age = CatAge;
        color = CatColor;
        health = random.nextInt(100);
    }



    public int FeedCat(int health) {
        System.out.println("Сейчас здоровье котэ " + (health + 20));
        return health + 20;
    }



}
