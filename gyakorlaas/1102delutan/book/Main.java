public class Main 
{
    public static void main(String[] args) {
        Book book = new Book("1984", "George Orwell", 328, "Regény", 1949);

        System.out.println(book);
        System.out.println("Klasszikus-e a könyv? " + book.isClassic());
        book.summarize();

    }
}