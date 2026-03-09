public class SemaNOS extends NOS {

    public SemaNOS(Car car) {
        this.car = car;
    }

    public void carInfo() {
        car.carInfo();
    }

    public void applyNos() {
        System.out.println("NOS Applied: Sema");
    }
}