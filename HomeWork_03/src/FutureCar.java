public class FutureCar extends Car {
    FutureCar() {
        this.setNumberWheels(3);
    }

    @Override
    public void movement() {
        fly();
    }

    @Override
    public boolean switchHeadlightss() {
        return false;
    }

    private void fly() {
    }
}