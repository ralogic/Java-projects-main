public class Car {

    int noOfWheels;
    float speed;
    String color;
    float carPetrol;

    public Car start() {
        if (carPetrol <= 0) {
            System.out.println("Sorry, please fill petrol first");
        }
        else if (carPetrol <= 5) {
            System.out.println("Your car is in reserve, fill petrol as soon as possible");
            carPetrol--;
        }
        else {
            System.out.println("Your car is driving");
            carPetrol--;
        }
        return this;
    }

    public void drive() {
        if (carPetrol <= 0) {
            System.out.println("Car stopped! No petrol.");
        } else {
            carPetrol--;
            System.out.println("Car is driving");
        }
    }

    public void getFuel(float fuel) {
        this.carPetrol += fuel;

    }

    public float getFuelCurrent() {
        return carPetrol;
    }
}
