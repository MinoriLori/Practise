package obstacles;

import Entity.Truck;

public class Wall extends Obstacle {
    private int height;

    public Wall(int height){
        this.height = height;
    }

    public int getHeight(){
        return height;
    }

    public boolean action(Truck truck){
        return truck.jump(this.height);
    }
}
