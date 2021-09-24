public class Epoxy {
    private Material material;
    private Color color;
    public Epoxy(String type, String color, String resin){
        this.color = Color.valueOf(color);
        prepare(type, resin);
    }
    private void prepare(String type, String resin){
        this.material = new Material(resin, type);
        System.out.println("Preparing "+material.getType().toString()+" expoxy.");
        System.out.println(material.getResin().toString()+" resign added.");
    }

    public String toString() {
        return material.getType().toString() + " epoxy "+ color.toString() +" color floor covering prepared.";
    }
}
