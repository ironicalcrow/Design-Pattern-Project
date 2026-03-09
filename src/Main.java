import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        GameUI.showBanner();

        Player player = Player.getInstance();

        System.out.println("Choose Car Category (coupe/roadster): ");
        String category = sc.nextLine();

        CarFactory factory;

        if(category.equalsIgnoreCase("coupe"))
            factory = new CoupeFactory();
        else
            factory = new RoadsterFactory();

        System.out.println("Choose Car:");
        String carChoice = sc.nextLine();

        Car car = factory.createCar(carChoice);

        car.setEngineBehavior(new V8Engine());
        car.setTurboBehavior(new HoneywellTurbo());

        System.out.println("Choose Track (blue/bb/spa): ");
        String trackChoice = sc.nextLine();

        Track track = TrackFactory.createTrack(trackChoice);

        System.out.println("Choose Race Type (sprint/circuit): ");
        String raceType = sc.nextLine();

        Race race;

        if(raceType.equalsIgnoreCase("sprint"))
            race = new SprintRace();
        else
            race = new CircuitRace();

        race.race(car,track);
    }
}