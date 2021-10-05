class Robot implements Truck{

    private final int limitation_run = 200, limitation_height = 5;

    @Override
    public boolean jump(Wall wall) {
        if (limitation_height > wall.getHeight()){
            System.out.println("Робот не может перепрыгнуть препятствие");
            return false;
        } else {
            System.out.println("Робот прыгает");
            return false;
        }
    }

    @Override
    public boolean run(Treadmill treadmill) {
        if (treadmill.getLength() > limitation_run){
            System.out.println("Робот бежит" + treadmill.getLength());
            return true;
        }
        else {
            System.out.println("Робот не может преодолеть препятствие");
            return false;
        }
    }

}
