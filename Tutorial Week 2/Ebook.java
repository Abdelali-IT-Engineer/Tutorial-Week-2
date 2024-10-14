public class Ebook extends LibraryItem {
    private int FileSize;
    private String Format;
    public Ebook (String title, String author, String Format, int Filesize){
        super(title, author);
        this.Format = Format;
        this.FileSize = Filesize;
    }
    @Override
    public void displayInfo() {
    super.displayInfo();
    System.out.println("Format: " + Format + "File Size: " + FileSize + "MB" );

}
    @Override
        public String getItemType() {
        return "Ebook";
}
}
