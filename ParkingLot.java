public class ParkingLot {
    public ParkingSpot[] spots;

    private int handicapCount;
    private int standardCount;

    public ParkingLot() {
        this.spots = new ParkingSpot[10];
        for (int i = 0; i < 10; i++) {
            if (i <= 1) {
                this.spots[i] = new ParkingSpot(true);
                handicapCount++;
            } else {
                this.spots[i] = new ParkingSpot(false);
                standardCount++;
            }
        }
    }

    public int parkCar(Car car) {
        for (int i = 0; i < spots.length; i++) {
            if (!spots[i].occupied() && (!car.handicap || !spots[i].handicap)) {
                spots[i].parkedCar = car;
    
                if (car.handicap) {
                    handicapCount--;
                } else {
                    standardCount--;
                }
    
                spots[i].handicap = car.handicap;
                return i;
            }
        }
        return -1; // If no available spot
    }
    

    public Car removeCar(int index) {
        if (index >= 0 && index < spots.length && spots[index].occupied()) {
            Car removedCar = spots[index].parkedCar;
            spots[index].parkedCar = null;
    
            if (spots[index].handicap) {
                handicapCount++;
            } else {
                standardCount++;
            }
    
            return removedCar;
        }
        return null; // If index is out of bounds or spot is empty
    }
    


    public String toString() {
        return handicapCount + " " + standardCount;
    }
}