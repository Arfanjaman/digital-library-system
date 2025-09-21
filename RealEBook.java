public class RealEBook implements EBook {
    private String filename;
    private String title;
    private long size;
    private String content;
    private boolean isLoaded = false;
    
    public RealEBook(String filename) {
        this.filename = filename;
       
        this.title = filename.replace(".pdf", "").replace(".txt", "").replace("_", " ");
        this.size = (long)(Math.random() * 1000000) + 100000;
        System.out.println("RealEBook created for: " + title);
    }

    private void loadBook() {
        if (!isLoaded) {
            System.out.println("Loading book file: " + filename + "...");
           
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            
            // Simulate loading content
            this.content = "Content of " + title + " - This is the actual book content that was loaded from file.";
            this.isLoaded = true;
            System.out.println("Book loaded successfully: " + title);
        }
    }
    
    @Override
    public void display() {
        loadBook(); 
        System.out.println("=== Displaying EBook ===");
        System.out.println("Title: " + title);
        System.out.println("File: " + filename);
        System.out.println("Size: " + size + " bytes");
        System.out.println("Content: " + content);
        System.out.println("========================");
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