public enum PlaneType {

    BOEING747(250, 5000),
    G6(20, 1500),
    DODO(2, 20);


    private final Integer capacity;
    private final Integer totalWeight;

    PlaneType(Integer capacity, Integer totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public Integer getTotalWeight() {
        return totalWeight;
    }
}
