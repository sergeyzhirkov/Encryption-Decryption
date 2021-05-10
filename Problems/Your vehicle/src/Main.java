class EnjoyVehicle {

    public static void startVehicle() {
        new Vehicle().new Engine().start();
    }


}
class Vehicle {

    // vehicle of your dream

    class Engine {

        void start() {
            System.out.println("RRRrrrrrrr....");
        }
    }
}