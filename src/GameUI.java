public class GameUI {

    public static void showBanner() {

        System.out.println("\n");
        System.out.println("=================================================");
        System.out.println("        🏁 RACING IN IUT - CONSOLE EDITION 🏁");
        System.out.println("=================================================");
        System.out.println("            Design Pattern Racing Game");
        System.out.println("=================================================\n");
    }

    public static void loading(String msg) {

        System.out.print(msg);

        try {
            for(int i=0;i<5;i++) {
                Thread.sleep(300);
                System.out.print(".");
            }
        } catch(Exception e) {}

        System.out.println("\n");
    }
}