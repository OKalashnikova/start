package Oop;

/**
 * Created by O&J on 12.09.2016.
 */
public class Loader {
    public static void main(String[] args) {
        Cat vaska = new Cat();
        Cat murzik = new Cat(9999999.0);
        System.out.println(vaska.getWeight());
        vaska.feed(100.0);
        vaska.feed(118.0);
        System.out.println(vaska.getWeight());
        vaska.goToToilet();
        System.out.println(vaska.getWeight());

        System.out.println(vaska.getFoodEated());

        vaska.catClone(murzik);

        System.out.println(Cat.getCatCount());

        vaska.goToToilet();

        System.out.println(vaska.getWeight());
    }

    /*public static void main(String[] args) {

        Cat vaska = new Cat(800.0);
        Cat murzik = new Cat();

        for (int i = 0; i < 10; i++) {
            Cat cat = new Cat(); // Sozdaem 10 kotov
            
        }

        System.out.println(vaska.getWeight());
        System.out.println(murzik.getWeight());
        System.out.println(Cat.catWeightDifference(vaska, murzik));

        // no static
       // Cat copy = new Cat ();
        //System.out.println("браt-близнец Мурзика " + copy.catClone(murzik).getWeight());

        // static
        System.out.println("браt-близнец Васьки " + (new Cat().catClone(vaska).getWeight()));


        System.out.println("Kollichestvo kotov " + Cat.getCatCount());

//        Cat cat = new Cat();
//        System.out.println(cat.getWeight());
//        cat.drink(1000.2);
//        cat.feed(0.2);
//        System.out.println(cat.eatMass());
//        cat.toilet();
//        System.out.println(cat.getWeight());
//        System.out.println(cat.getStatus());
    }
    */
}


//- Создать в классе Cat метод, который будет возвращать массу съеденной еды.
//- Создать в классе Cat метод “сходить в туалет”, который будет уменьшать вес кошки и что-­
//  нибудь печатать.