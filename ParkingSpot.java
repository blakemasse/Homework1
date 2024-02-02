public class ParkingSpot {
    public Car parkedCar;
    public boolean handicap;

    public ParkingSpot(boolean handicap){
        this.handicap = handicap;
    }

    public boolean occupied() {
        return parkedCar != null;
    }
}
