
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Digital Library System Demo ===\n");
        
        
        EBook[] ebooks = {
            new ProxyEBook("Java_Programming.pdf"),
            new ProxyEBook("Design_Patterns.pdf"),
            new ProxyEBook("Data_Structures.pdf"),
            new ProxyEBook("Software_Engineering.pdf")
        };
        
        System.out.println("\n--- All e-books created (but not loaded yet) ---\n");
        
        
        System.out.println("=== Students browsing e-book catalog ===");
        for (int i = 0; i < ebooks.length; i++) {
            System.out.println((i+1) + ". Title: " + ebooks[i].getTitle() + 
                             " | Size: " + ebooks[i].getSize() + " bytes");
        }
        
        System.out.println("\n--- Notice: No books were actually loaded during browsing ---\n");
        
       
        System.out.println("=== Student 1 wants to read Java Programming ===");
        ebooks[0].display();
        
        System.out.println("\n=== Student 2 wants to read Design Patterns ===");
        ebooks[1].display();
        
        System.out.println("\n=== Student 1 wants to read Java Programming again ===");
        ebooks[0].display(); 
        
        System.out.println("\n=== Student 3 just wants to check the title of Data Structures ===");
        System.out.println("Title: " + ebooks[2].getTitle()); 
        
        System.out.println("\n=== Student 3 now decides to read Data Structures ===");
        ebooks[2].display(); 
        
        System.out.println("\n=== Demo completed ===");
        System.out.println("Notice how books are only loaded when display() is called for the first time!");
    }
}