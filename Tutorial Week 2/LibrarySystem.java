public class LibrarySystem {
    public static void main(String[] args) {
        LibraryItem[] items = new LibraryItem[4];
        items[0] = new Book("1984", "George Orwell", "Dystopian");
        items[1] = new Magazine("National Geographic", "Various", 2023);
        items[2] = new Journal("IEEE Transactions", "John Doe",
        "Engineering");
        items[3] = new Ebook("The Hunger Games", "Suzanne Collins", "PDF", 12);
        for (LibraryItem item : items) {
        item.displayInfo(); 
        System.out.println(item.getItemType()); 
        System.out.println(); 
    }
}
}

