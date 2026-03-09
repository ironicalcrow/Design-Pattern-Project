public class Player {

    private static Player instance;

    private Player() {
        System.out.println("Player profile created.\n");
    }

    public static Player getInstance() {

        if(instance == null)
            instance = new Player();

        return instance;
    }
}