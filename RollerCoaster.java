public class RollerCoaster extends Ride {
    private boolean simulated; // whether the ride is a simulation
    public RollerCoaster(String name, String color, int minHeight, int maxRiders, boolean simulated) {
        super(name, color, minHeight, maxRiders);
        this.simulated = simulated;
    }
    public boolean isSimulated() {
        return simulated;
    }
    public void setSimulated(boolean simulated) {
        this.simulated = simulated;
    }
    @Override
    public boolean equals(Object o) {
        
    }
}
