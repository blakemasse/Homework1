public class ParkingTester {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot();

        System.out.println(parkingLot.toString());

        Car car1 = new Car("Infiniti A", "Some Manufacturer", true);
        int index1 = parkingLot.parkCar(car1);

        System.out.println(parkingLot.toString());

        Car car2 = new Car("Cadillac B", "Some Other Manufacturer", false);
        parkingLot.parkCar(car2);

        System.out.println(parkingLot.toString());

        parkingLot.removeCar(index1);

        System.out.println(parkingLot.toString());
    }
}







