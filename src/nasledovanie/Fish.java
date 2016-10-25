package nasledovanie;

/**
 * Created by O&J on 02.10.2016.
 */
public class Fish extends Pets implements Swim, Fly {
    public Fish() {
        setWeight(600 + Math.random()*100.0);
    }

    @Override
    public void sleep() {

    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("Bul-bul-bul, I am Tule... sorry Tune");
    }

    @Override
    public void swim() {

    }

    @Override
    public void fly() {

    }
}
