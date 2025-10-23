public class EAudioBook extends NetTitle {
    private int durationInMinutes;

    public EAudioBook(String title, String literatureType, int availability, int reach, int use, int durationInMinutes) {
        super(title, literatureType, availability, reach, use);
        this.durationInMinutes = durationInMinutes;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    @Override
    public double calculatePoints() {
        return (durationInMinutes / 2.0) * convertLiteratureType() * getDistributionFactor();
    }
}