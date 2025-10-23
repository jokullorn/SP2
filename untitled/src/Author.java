import java.util.ArrayList;
import java.util.List;

public class Author {
    private String name;
    private List<Title> titles;

    public Author(String name) {
        this.name = name;
        this.titles = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Title> getTitles() {
        return titles;
    }

    public void addTitle(String name) {
        // This method signature matches the diagram but needs clarification
        // In practice, we need to pass a Title object
    }

    public void addTitle(Title title) {
        titles.add(title);
    }

    public void setAuthor(Title title) {
        titles.add(title);
    }

    public double calculateRoyalties() {
        double totalRoyalties = 0.0;
        for (Title title : titles) {
            totalRoyalties += title.calculateRoyalties();
        }
        return Math.round(totalRoyalties * 100.0) / 100.0;
    }

    public String getRoyalties() {
        return String.format("%.2fkr", calculateRoyalties());
    }
}