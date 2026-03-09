import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public abstract class Race {

    public final void race(Car car, Track track) {

        car.carInfo();
        track.trackInfo();

        car.startCar();
        track.startLine();

        car.accelerateCar();

        Car nosCar = pitStop(car);

        applyNos(nosCar);

        track.finishLine();

        nosCar.stopCar();

        lapTime();
    }

    public abstract Car pitStop(Car car);

    public abstract void applyNos(Car car);

    public void lapTime() {

        Random rand = new Random();
        int sec = rand.nextInt(3600);

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        System.out.println("Lap Time: " + sdf.format(new Date(sec * 1000)));
    }
}