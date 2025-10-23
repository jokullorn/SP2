public class AudioBook extends PhysicalTitle {
    private int durationInMinutes;

    public AudioBook(String title, String literatureType, int copies, int durationInMinutes) {
        super(title, literatureType, copies);
        this.durationInMinutes = durationInMinutes;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    @Override
    public double calculatePoints() {
        return (durationInMinutes * 0.5) * convertLiteratureType() * copies;
    }
}