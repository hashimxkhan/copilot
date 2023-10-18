import java.util.ArrayList;

public class AmusementPark implements Park {
    private double	admissionCost;  // The admission cost of the amusement park in dollars
    private boolean	arcade;  // Indicates whether the amusement park has an arcade
    private boolean	bowling;  // Indicates whether the amusement park has bowling
    private boolean	indoor;  // Indicates whether the amusement park has an indoor component
    private double	land;  // The amount of land in the amusement park in acres
    private String	name;  // The name of the amusement park
    private boolean	outdoor;  // Indicates whether the amusement park has an outdoor component
    private ArrayList<Ride> rides;  // A list of all the rides in the amusement park
    private boolean[] seasons;  // Indicates whether the amusement park is open during a certain season
    public AmusementPark(String name, double admissionCost, double land, ArrayList<Ride> rides,
                         boolean indoor, boolean outdoor, boolean arcade, boolean bowling, boolean[] seasons) {
        this.name = name;
        this.admissionCost = admissionCost;
        this.land = land;
        this.rides = rides;
        this.indoor = indoor;
        this.outdoor = outdoor;
        this.arcade = arcade;
        this.bowling = bowling;
        this.seasons = seasons;
    }


    public void addRide(Ride ride) {

    }

    public void close() {

    }

    public void enlarge(double addedLand, double maxLand, boolean addedIndoor, boolean addedOutdoor) {

    }

    public double getAdmissionCost() {
        return 0;
    }

    public double getLand() {
        return 0;
    }

    public String getName() {
        return null;
    }

    public ArrayList<Ride> getRides() {
        return null;
    }

    public boolean[] getSeasons() {
        return new boolean[0];
    }

    public boolean isIndoor() {
        return false;
    }

    public boolean isOutdoor() {
        return false;
    }

    public void removeRide(Ride ride) {

    }

    public void setAdmissionCost(double admissionCost) {

    }

    public void setName(String name) {

    }

    public void setSeasons(boolean[] seasons) {

    }
}
