import java.util.Random;

public abstract class Race {

    public final void race(Car car, Track track) {

        System.out.println("\n🏁 RACE STARTING\n");

        car.carInfo();
        track.trackInfo();

        GameUI.loading("Preparing Car");

        car.startCar();
        track.startLine();

        countdown();

        car.accelerateCar();

        Car nosCar = pitStop(car);

        applyNos(nosCar);

        track.finishLine();

        nosCar.stopCar();

        lapTime();
    }

    public abstract Car pitStop(Car car);

    public abstract void applyNos(Car car);

    public void countdown() {

        try {

            System.out.println("\nRace starting in:");

            for(int i=3;i>=1;i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }

            System.out.println("GO!\n");

        } catch(Exception e) {}
    }

    public void lapTime() {

        Random rand = new Random();

        int min = rand.nextInt(3)+1;
        int sec = rand.nextInt(60);
        int ms = rand.nextInt(1000);

        System.out.printf("⏱ Lap Time: %02d:%02d:%03d\n",min,sec,ms);
    }
}