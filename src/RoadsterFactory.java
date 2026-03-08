public class RoadsterFactory implements CarFactory {

    public Car createCar(String type) {

        if(type.equalsIgnoreCase("porsche"))
            return new PorscheBoxster();

        if(type.equalsIgnoreCase("ferrari"))
            return new Ferrari812();

        return null;
    }
}