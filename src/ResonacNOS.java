public class ResonacNOS extends NOS {

    public ResonacNOS(Car car) {
        this.car = car;
    }

    public void carInfo() {
        car.carInfo();
    }

    public void applyNos() {
        System.out.println("NOS Applied: Resonac");
    }
}