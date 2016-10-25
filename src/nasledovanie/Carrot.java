package nasledovanie;

/**
 * Created by O&J on 02.10.2016.
 */
public class Carrot extends Pets implements Fly{
    public Carrot(){
        setWeight(150 + Math.random()*200.0);
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("Hello! I'm Kesha!");
    }

    @Override
    public void sleep() {

    }

    @Override
    public void fly() {
        System.out.println("Крыльями машет");
    }
}
