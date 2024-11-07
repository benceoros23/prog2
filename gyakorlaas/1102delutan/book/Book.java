public class Book {
    private final String title;
    private final String author;
    private final int pageCount;
    private final String genre;
    private final int yearPublished;

    public Book(String title, String author, int pageCount, String genre, int yearPublished) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.genre = genre;
        this.yearPublished = yearPublished;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getGenre() {
        return genre;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public boolean isClassic() {
        return 2024 - yearPublished > 50;
    }

    public void summarize() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return String.format("Könyv adatok:\n- Cím: %s\n- Szerző: %s\n- Oldalak száma: %d\n- Műfaj: %s\n- Kiadási év: %d",
                             title, author, pageCount, genre, yearPublished);
    }
}
