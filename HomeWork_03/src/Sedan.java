class Sedan extends Car implements iRefueling, iWiping {
    private int loadCapacity;

    public Sedan() {

        this.setTypeCar(TypeCar.Sedan);
    }

    @Override
    public void fuel() {
    }

    @Override
    public void wipWindshield() {
    }

    @Override
    public void wipHeadlights() {
    }

    @Override
    public void wipMirrors() {
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public boolean switchHeadlightss() {
        return false;
    }
}