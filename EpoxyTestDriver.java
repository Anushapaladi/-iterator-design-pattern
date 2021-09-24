public class EpoxyTestDriver {
    public static void main(String[] args) {
        Epoxy[] orders = new Epoxy[] {
            PrepareFloor.prepareFloor("Quartz_Filled", "clear", "novolac"),
            PrepareFloor.prepareFloor("Graveled", "transparent", "bisphenol"),
            PrepareFloor.prepareFloor("Self_leveling", "various", "novolac"),
            PrepareFloor.prepareFloor("Metallic", "clear", "bisphenol"),
            PrepareFloor.prepareFloor("Quartz_filled", "transparent", "novolac"),
        };

        EpoxyStore store = new EpoxyStore(orders);
        Iterator<Epoxy> iterator = store.getIterator();
        int i = 1;
        while (iterator.hasNext()) {
            System.out.println(i+". "+iterator.next().toString());
            i++;
        }

    
    }
}
