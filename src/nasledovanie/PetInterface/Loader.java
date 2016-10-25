package nasledovanie.PetInterface;

import nasledovanie.Cat;
import nasledovanie.Dog;

/**
 * Created by O&J on 18.09.2016.
 */
public class Loader {
    public static void main(String[] args) {
        Dog tuzik  = new Dog();
        Cat murzik = new Cat();
        tuzik.voice();
        murzik.voice();

        tuzik.sleep();
        murzik.sleep();
    }

    //Придумайте несколько методов и унаследуйте их, подумайте какие части методов будут общие, и какие будут различия

}
