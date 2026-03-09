public class TrackFactory {

    public static Track createTrack(String name) {

        if(name.equalsIgnoreCase("blue"))
            return new BlueMoonBay();

        if(name.equalsIgnoreCase("bb"))
            return new BBRaceway();

        if(name.equalsIgnoreCase("spa"))
            return new SpaFrancorchamps();

        return null;
    }
}