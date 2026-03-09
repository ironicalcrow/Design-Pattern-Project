public class CircuitRace extends Race {

    public Car pitStop(Car car) {

        System.out.println("\n🔧 Pit Stop!");
        return new SemaNOS(car);
    }

    public void applyNos(Car car) {

        System.out.println("Applying NOS for Circuit Race");
    }
}