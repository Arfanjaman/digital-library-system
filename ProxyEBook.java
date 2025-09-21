
public class ProxyEBook implements EBook {
    private String filename;
    private String title;
    private long size;
    private RealEBook realEBook;
    
    public ProxyEBook(String filename) {
        this.filename = filename;
      
        this.title = filename.replace(".pdf", "").replace(".txt", "").replace("_", " ");
        this.size = (long)(Math.random() * 1000000) + 100000;
        System.out.println("ProxyEBook created for: " + title + " (not loaded yet)");
    }
    
 
 
    private void ensureRealEBookLoaded() {
        if (realEBook == null) {
            System.out.println("ProxyEBook: First time access, creating RealEBook...");
            realEBook = new RealEBook(filename);
        }
    }
    
    @Override
    public void display() {
        System.out.println("ProxyEBook: display() called for " + title);
        ensureRealEBookLoaded();
        realEBook.display();
    }
    
    @Override
    public String getTitle() {
        
        return title;
    }
    
    @Override
    public long getSize() {
        
        return size;
    }
}