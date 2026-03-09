public class SprintRace extends Race {

    public Car pitStop(Car car) {
        System.out.println("Pit Stop reached");
        return new ResonacNOS(car);
    }

    public void applyNos(Car car) {
        System.out.println("Applying NOS for Sprint Race");
    }
}