package Entity;

import Entity.Truck;
import obstacles.Treadmill;
import obstacles.Wall;

public class Cat implements Truck {

    private final int limitation_run = 200, limitation_height = 200;

    @Override
    public boolean jump(int height) {
        if (limitation_height > height){
            System.out.println("Кот прыгает");
            return true;
        } else {
            System.out.println("Кот не может перепрыгнуть препятствие");
            return false;
        }
    }

    @Override
    public boolean run(int lenght) {
        if (limitation_run > lenght ){
            System.out.println("Кот бежит" + lenght + "метров");
            return false;
        }
        else {
            System.out.println("Кот не может преодолеть препятствие");
            return false;
        }
    }
}
