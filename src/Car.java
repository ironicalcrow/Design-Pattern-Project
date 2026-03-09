public abstract class Car {

    EngineBehavior engineBehavior;
    TurboBehavior turboBehavior;

    public void setEngineBehavior(EngineBehavior e) {
        engineBehavior = e;
    }

    public void setTurboBehavior(TurboBehavior t) {
        turboBehavior = t;
    }

    public void performEngine() {
        engineBehavior.engineType();
    }

    public void performTurbo() {
        turboBehavior.turboType();
    }

    public void startCar() {
        System.out.println("🚗 Car Started");
    }

    public void stopCar() {
        System.out.println("🛑 Car Stopped");
    }

    public void accelerateCar() {
        System.out.println("🔥 Car Accelerating");
    }

    public abstract void carInfo();
}