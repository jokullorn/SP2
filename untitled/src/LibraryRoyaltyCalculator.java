public class LibraryRoyaltyCalculator {
    public static void main(String[] args) {
        System.out.println("=== Testing Physical Titles ===\n");

        // Create author Olga Ravn
        Author olgaRavn = new Author("Olga Ravn");

        // Add printed book "Celestine"
        PrintedBook celestinePrinted = new PrintedBook("Celestine (Printed)", "SKØN", 140, 166);
        olgaRavn.addTitle(celestinePrinted);

        // Add audiobook "Celestine" (3 hours 12 minutes = 192 minutes)
        AudioBook celestineAudio = new AudioBook("Celestine (Audio)", "SKØN", 140, 192);
        olgaRavn.addTitle(celestineAudio);

        // Add another book for testing
        PrintedBook anotherBook = new PrintedBook("De ansatte", "SKØN", 100, 136);
        olgaRavn.addTitle(anotherBook);

        // Calculate and display royalties
        System.out.println(olgaRavn.getName() + ": " + olgaRavn.getRoyalties());

        // Test with another author
        System.out.println("\n--- Additional Physical Title Tests ---");
        Author harukiMurakami = new Author("Haruki Murakami");

        // Add various types of books
        PrintedBook fictionBook = new PrintedBook("1Q84", "SKØN", 200, 816);
        harukiMurakami.addTitle(fictionBook);

        AudioBook audioBook = new AudioBook("Men Without Women (Audio)", "SKØN", 150, 438);
        harukiMurakami.addTitle(audioBook);

        PrintedBook nonFictionBook = new PrintedBook("What I Talk About When I Talk About Running", "FAG", 120, 192);
        harukiMurakami.addTitle(nonFictionBook);

        System.out.println(harukiMurakami.getName() + ": " + harukiMurakami.getRoyalties());

        // Test with children's books
        Author andersMatthesen = new Author("Anders Matthesen");
        PrintedBook pictureBook = new PrintedBook("Ternet Ninja", "BI", 300, 248);
        andersMatthesen.addTitle(pictureBook);

        AudioBook childrenAudio = new AudioBook("Emil of Lönneberga (Audio)", "BI", 180, 262);
        andersMatthesen.addTitle(childrenAudio);

        System.out.println(andersMatthesen.getName() + ": " + andersMatthesen.getRoyalties());

        // Test online titles
        System.out.println("\n=== Testing Online Titles ===\n");

        Author onlineAuthor = new Author("Digital Writer");

        // Test EBook (from the example in the assignment)
        // 360,000 characters, non-fiction, not illustrated
        // 97 availability, 50 reach, 205 use
        EBook ebook = new EBook("Digital Non-Fiction", "FAG", 97, 50, 205, 360000, false);
        onlineAuthor.addTitle(ebook);

        // Test illustrated EBook
        EBook illustratedBook = new EBook("Illustrated Children's Story", "BI", 80, 40, 150, 180000, true);
        onlineAuthor.addTitle(illustratedBook);

        // Test EAudioBook
        EAudioBook eAudioBook = new EAudioBook("Online Fiction Audio", "SKØN", 90, 45, 180, 480);
        onlineAuthor.addTitle(eAudioBook);

        System.out.println(onlineAuthor.getName() + ": " + onlineAuthor.getRoyalties());

        // Verify the EBook calculation from the example
        System.out.println("\n--- Verification of Example ---");
        System.out.println("EBook points (should be ~110,770): " + ebook.calculatePoints());
    }
}