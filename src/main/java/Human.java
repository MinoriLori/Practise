class Human implements Truck{

    private final int limitation_run = 200, limitation_height = 5;

    //Может ли перепрыгнуть препятсвтие человек
    @Override
    public boolean jump(Wall wall) {
        if (limitation_height > wall.getHeight()){
            System.out.println("Человек прыгает");
            return true;
        } else {
            System.out.println("Человек не может перепрыгнуть препятствие");
            return false;
        }
    }

    //Может ли человек пройти дистанцию
    @Override
    public boolean run(Treadmill treadmill) {
        if (treadmill.getLength() > limitation_run){
            System.out.println("Человек бежит" + treadmill.getLength());
            return false;
        }
        else {
            System.out.println("Человек не может преодолеть препятствие");
            return false;
        }
    }
}
