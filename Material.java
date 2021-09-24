public class Material {
    private EpoxyResin resin;
    private EpoxyType type;
    public Material(String resin, String type) {
        this.resin = EpoxyResin.valueOf(resin.toUpperCase());
        this.type = EpoxyType.valueOf(type.toUpperCase());
    }
    public EpoxyResin getResin() {
        return this.resin;
    }
    public EpoxyType getType() {
        return this.type;
    }
}
