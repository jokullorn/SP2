public abstract class Title {
    protected String title;
    protected String literatureType;
    protected double rate;

    public Title(String title, String literatureType) {
        this.title = title;
        this.literatureType = literatureType;
        this.rate = 0.067574;
    }

    public String getTitle() {
        return title;
    }

    public String getLiteratureType() {
        return literatureType;
    }

    public double getRate() {
        return rate;
    }

    protected double convertLiteratureType() {
        switch (literatureType) {
            case "BI":
                return 3.0;
            case "TE":
                return 3.0;
            case "LYRIK":
                return 6.0;
            case "SKØN":
                return 1.7;
            case "FAG":
                return 1.0;
            default:
                return 1.0;
        }
    }

    public double calculateRoyalties() {
        return calculatePoints() * rate;
    }

    public abstract double calculatePoints();
}