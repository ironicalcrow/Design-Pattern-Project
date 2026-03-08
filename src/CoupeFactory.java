public class CoupeFactory implements CarFactory {

    public Car createCar(String type) {

        if(type.equalsIgnoreCase("toyota"))
            return new ToyotaGR86();

        if(type.equalsIgnoreCase("subaru"))
            return new SubaruBRZ();

        return null;
    }
}