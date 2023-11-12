package uts1;

/**
 *
 * @author Bintang Danuarta
 */
// Kelas untuk menyimpan buku berdasarkan genre

// Kelas untuk menyimpan buku berdasarkan genre
class GenreBook extends Book {
    private String genre;

    public GenreBook(String title, String author, int yearPublished, String genre) {
        super(title, author, yearPublished);
        this.genre = genre;
    }

    @Override
    public String getGenre() {
        return genre;
    }
}