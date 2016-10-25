package Oop;

import nasledovanie.Dog;

/**
 * Created by O&J on 12.09.2016.
 */
public class Cat {

    public static int getCatCount() {
        return catCount;
    }

    private static int catCount = 0;
    private Double originWeight;
    private Double weight;
    private Double minWeight;
    private Double maxWeight;
    private Double foodEated;

    public Cat() {
        this(1500.0 + 3000.0 * Math.random());
    }

    //HW
    public Cat(Double weight) {
        this.weight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        foodEated = 0.0;
        if (isAlive()) {
            System.out.println("Ура! Еще один кот!");
            catCount++;
        } else {
            System.out.println("Котик ... упс...");
        }
    }

    public boolean isAlive() {
        if (weight < minWeight || weight > maxWeight) {
            return false;
        } else
            return true;
    }

    public static Double catWeightDifference(Cat cat1, Cat cat2) {
        double diff = Math.abs(cat1.getWeight() - cat2.getWeight()); // abs возвращает модуль числа, ведь мы не знаем - какой кот будет больше, чтобы не было отрицательного числа
        return diff;
    }

    public static Cat catClone(Cat donor) {
        Cat cat = new Cat(donor.getWeight());
        return cat;
    }

    private void changeWeight(Double amount) {
        weight += amount;
        if (!isAlive())
            catCount--;
    }

//    public Cat catClone(Cat cat){
//        if(cat.getWeight() < minWeight || cat.getWeight()>maxWeight) {
//            Cat cloneCat = cat;
//            System.out.println("Котик тоже упс...");
//            return cloneCat;
//        }else{
//            Cat cloneCat = cat;
//            catCount++;
//            return cloneCat;
//        }
//    }

//    public static Cat catCloneStatic(Cat cat){
//        Cat cloneCat = cat;
//        return cloneCat;
//    }

    public void meow() {
        changeWeight(-1.0);
        System.out.println("Meow");
    }


    public void feed(Double amount) {
        changeWeight(amount);
//        if(isAlive() == false)
//            catCount--;
//        if(!isAlive()) //analogichen verhnemu sposobu zapisi
//            catCount--;
        foodEated += amount;
    }

    public Double getFoodEated() {
        return foodEated;
    }

    public void drink(Double amount) {
        changeWeight(amount);
        weight = weight + amount;
    }

    public Double getWeight() {
        return weight;
    }


    public void goToToilet() {
        System.out.println("Мяв-мяв!");
        System.out.println("Шкряб - шкряб...");
        changeWeight(-(100 * Math.random()));
    }

    public String getStatus() {
        if (weight < minWeight) {
            return "Dead";
        } else if (weight > maxWeight) {
            return "Exploded";
        } else if (weight > originWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }


}
