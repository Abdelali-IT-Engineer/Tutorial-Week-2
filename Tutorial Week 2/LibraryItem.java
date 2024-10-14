public class LibraryItem {
    private String title;
    private String author;
    public LibraryItem(String title ,String author) {
    this.title = title;
    this.author = author;
    }
    public String getTitle() {
    return title;
    }
    public String getAuthor() {
    return author;
    }
    public String getItemType() {
        return "Naught";
    }
    public void displayInfo() {
    System.out.println("Title: " + title + ", Author: " + author);
    }
}
