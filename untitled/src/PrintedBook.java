public class PrintedBook extends PhysicalTitle {
    private int pages;

    public PrintedBook(String title, String literatureType, int copies, int pages) {
        super(title, literatureType, copies);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public double calculatePoints() {
        return pages * convertLiteratureType() * copies;
    }
}