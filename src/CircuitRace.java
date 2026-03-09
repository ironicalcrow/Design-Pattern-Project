public class CircuitRace extends Race {

    public Car pitStop(Car car) {
        System.out.println("Pit Stop reached");
        return new SemaNOS(car);
    }

    public void applyNos(Car car) {
        System.out.println("Applying NOS for Circuit Race");
    }
}