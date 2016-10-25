package nasledovanie;


/**
 * Created by O&J on 18.09.2016.
 */
public class Dog extends Pets{

    public Dog() {
        setWeight(1500 + Math.random()*5000);
    }

    public void voice(){
        super.voice();
        System.out.println("Uff");
    }

    @Override
    public void sleep() {
        System.out.println("Brrrrrr....... Brrrrrrrr......");
    }

    public void swim(){
        System.out.println("Swimming");
    }
}
