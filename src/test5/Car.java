package test5;



public class Car{
    private final int tankCapacity;
    private int fuelAmount;

    public Car(int fuelCapacity){
        this.tankCapacity = fuelCapacity;
        this.fuelAmount = 0;
    }

    public int getTankCapacity(){
        return this.tankCapacity;
    }

    public int getFuelAmount(){
        return this.fuelAmount;
    }

    public void fullRefill(){
        this.fuelAmount = this.tankCapacity;
    }
}