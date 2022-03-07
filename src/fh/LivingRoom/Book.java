package fh.LivingRoom;

public class Book {
    private String author;
    private String title;
    private int page;

    public Book(String author, String title, int page) {
        this.author = author;
        this.title = title;
        this.page = page;
    }

    public String getAuthor() {
        return author;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}

