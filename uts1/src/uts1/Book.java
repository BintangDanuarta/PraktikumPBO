package uts1;


/**
 *
 * @author Bintang Danuarta
 */

// Kelas abstrak untuk buku
abstract class Book {
    private String title;
    private String author;
    private int yearPublished;

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public abstract String getGenre();

    public String getInfo() {
        return title + " by " + author + ", published in " + yearPublished;
    }
}









