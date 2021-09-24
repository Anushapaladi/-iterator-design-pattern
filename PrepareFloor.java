public class PrepareFloor {
    public static Epoxy prepareFloor(String type, String color, String resin){
        Epoxy epoxy = new Epoxy(type.toUpperCase(), color.toUpperCase(), resin.toUpperCase());
        return epoxy;
    }

}
