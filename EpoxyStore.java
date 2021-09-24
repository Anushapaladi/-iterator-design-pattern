public class EpoxyStore implements Containter<Epoxy>{
    private Epoxy[] epoxyList;

    public EpoxyStore(Epoxy[] epoxyList){
        this.epoxyList = epoxyList;
    }
    @Override
    public Iterator<Epoxy> getIterator() {
        return new EpoxyIterator();
    }
    public class EpoxyIterator implements Iterator<Epoxy> {
        private int position;
         
        public EpoxyIterator(){
            position = 0;
        }
     
        @Override
        public void reset() {
            position = 0;
        }
     
        @Override
        public Epoxy next() { 
            return epoxyList[position++];
        }
     
        @Override
        public Epoxy currentItem() {
            return epoxyList[position];
        }
     
        @Override
        public boolean hasNext() {
            if(position >= epoxyList.length)
                return false;
            return true;
        }
    }
    
}

