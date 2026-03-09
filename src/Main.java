import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Player player = Player.getInstance();

        System.out.println("Choose Car Category: coupe / roadster");
        String category = sc.nextLine();

        CarFactory factory;

        if(category.equalsIgnoreCase("coupe"))
            factory = new CoupeFactory();
        else
            factory = new RoadsterFactory();

        System.out.println("Choose Car:");
        String carName = sc.nextLine();

        Car car = factory.createCar(carName);

        car.setEngineBehavior(new V8Engine());
        car.setTurboBehavior(new HoneywellTurbo());

        System.out.println("Choose Track: blue / bb / spa");
        String trackName = sc.nextLine();

        Track track = TrackFactory.createTrack(trackName);

        System.out.println("Race Type: sprint / circuit");
        String raceType = sc.nextLine();

        Race race;

        if(raceType.equalsIgnoreCase("sprint"))
            race = new SprintRace();
        else
            race = new CircuitRace();

        race.race(car, track);
    }
}