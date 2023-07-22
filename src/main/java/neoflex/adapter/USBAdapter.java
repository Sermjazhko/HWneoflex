package neoflex.adapter;

public class USBAdapter implements USBInterface {

    private MemoryCard memoryCard;

    public USBAdapter(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void set() {
        memoryCard.set();
    }
}
