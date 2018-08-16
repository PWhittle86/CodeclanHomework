public enum BedroomType {
    SINGLE(1),
    DOUBLE(2),
    DUAL(2),
    TRIPLE(3);

    private final int capacity;

    BedroomType(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
