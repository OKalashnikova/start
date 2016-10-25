package nasledovanie;

/**
 * Created by O&J on 18.09.2016.
 */
public class Cat extends Pets{

    public Cat() {
        setWeight(1000 + Math.random()*2000.0);
    }

    public void voice(){
        super.voice();
        System.out.println("Meaw");
    }

    @Override
    public void sleep() {
        System.out.println("muuuuurrrrr......");
    }

}
