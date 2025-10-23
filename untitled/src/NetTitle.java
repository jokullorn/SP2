public abstract class NetTitle extends Title {
    protected int availability;
    protected int reach;
    protected int use;

    public NetTitle(String title, String literatureType, int availability, int reach, int use) {
        super(title, literatureType);
        this.availability = availability;
        this.reach = reach;
        this.use = use;
    }

    public int getAvailability() {
        return availability;
    }

    public int getReach() {
        return reach;
    }

    public int getUse() {
        return use;
    }

    protected double getDistributionFactor() {
        return (reach * 5) + (availability * 0.5) + use;
    }
}