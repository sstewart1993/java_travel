public class Plane {

    public PlaneType planeType;

    public Plane(PlaneType planeType) {
        this.planeType = planeType;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public int getCapacityFromPlaneType(){
        return planeType.getCapacity();
    }

    public int getTotalWeightFromPlaneType(){
        return  planeType.getTotalWeight();
    }

}
