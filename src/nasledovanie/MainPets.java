package nasledovanie;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

/**
 * Created by O&J on 25.09.2016.
 */
public class MainPets {

    public static void main(String[] args) {

        Random r = new Random();
//        for (int i = 0; i < 10; i++) {
//            System.out.println(r.nextInt(3)); //генерация случайных чисел - до трех (0, 1, 2) - это потолок стоит в скобках. Его можно менять
//        }

        Pets cat = new Cat();
        Pets dog = new Dog();
        System.out.println(cat.compareTo(dog));

        ArrayList<Pets> pets = new ArrayList<>();
        // Списочный массив. который содержит объекты типа Pets,сл-но: в нем можно хранить котов, собак и др животных, которые будут наследниками этого класса
        for (int i = 0; i < 20; i++) {
            int random = r.nextInt(4); // при помощи случайных чисел генерируется либо кот, либо собака
            switch (random) {
                case 0:
                    pets.add(new Cat());
                    break;
                case 1:
                    pets.add(new Carrot());
                    break;
                case 2:
                    pets.add(new Fish());
                    break;
                case 3:
                    pets.add(new Dog());
                    break;
                default:
                    pets.add(null);
                    break;
            }
        }
        Collections.sort(pets);
        for (Pets pet: pets // создаем переменную pet, которая перебирает наш масси
             ) {
            pet.voice();
            System.out.println(pet.getWeight());
        }

    }
}
