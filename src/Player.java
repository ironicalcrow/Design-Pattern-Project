public class Player {

    private static Player instance;

    private Player() {
        System.out.println("Player created");
    }

    public static Player getInstance() {

        if(instance == null)
            instance = new Player();

        return instance;
    }
}