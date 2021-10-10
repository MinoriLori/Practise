package Entity;

import Entity.Truck;
import obstacles.Treadmill;
import obstacles.Wall;

public class Robot implements Truck {

    private final int limitation_run = 200, limitation_height = 5;

    @Override
    public boolean jump(int height) {
        if (limitation_height > height){
            System.out.println("Робот не может перепрыгнуть препятствие");
            return false;
        } else {
            System.out.println("Робот прыгает");
            return false;
        }
    }

    @Override
    public boolean run(int length) {
        if (limitation_run > length ){
            System.out.println("Робот бежит" + length + "метров");
            return true;
        }
        else {
            System.out.println("Робот не может преодолеть препятствие");
            return false;
        }
    }

}
