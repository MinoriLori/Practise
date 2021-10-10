package Entity;

import Entity.Truck;
import obstacles.Treadmill;
import obstacles.Wall;

public class Human implements Truck {

    private final int limitation_run = 200, limitation_height = 5;

    //Может ли перепрыгнуть препятсвтие человек
    @Override
    public boolean jump(int height) {
        if (limitation_height > height){
            System.out.println("Человек прыгает");
            return true;
        } else {
            System.out.println("Человек не может перепрыгнуть препятствие");
            return false;
        }
    }

    //Может ли человек пройти дистанцию
    @Override
    public boolean run(int length) {
        if (limitation_run > length){
            System.out.println("Человек бежит" + length + "Метров");
            return false;
        }
        else {
            System.out.println("Человек не может преодолеть препятствие");
            return false;
        }
    }
}
