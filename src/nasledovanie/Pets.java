package nasledovanie;

/**
 * Created by O&J on 18.09.2016.
 */
abstract public class Pets implements Comparable<Pets> {

    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) { //setter - nazivayut mutator
        this.weight = weight;
    }

    public final void run(){
        System.out.println("Running");
    }

    public final void eat(){
        System.out.println("Eating");
    }

    public void voice(){
        System.out.println("What say the pet?");
    }

    abstract public void sleep();

    @Override
    public int compareTo(Pets o) {
        if(this.getWeight() < o.getWeight())
            return -1; //если объект класса меньше по весу, чем объект, который мы создали и передали в метод
        else if(this.getWeight() < o.getWeight())
            return +1;
        else
        return 0; // если два объекта будут равны
    }
}
