import java.util.ArrayList;
import java.util.Scanner;

public class BookManager { 

    Scanner input = new Scanner(System.in);
    
   ArrayList<Book> books  = new ArrayList<>();

    public void addBook(){
        System.out.println("Enter title : ");
        String title = input.nextLine();

        System.out.println("Enter author : ");
        String author = input.nextLine();

        int  id = books.size() + 1;

        books.add(new Book(id,title,author));

        System.out.println("book added succusful");

    } 

    public void updateBook(){
        System.out.println("Entre id the book that you update");
        int id = input.nextInt();
        input.nextLine(); 
        boolean  found = false ;
        for(int i=0;i<books.size();i++){
            if(books.get(i).getId() == id){
                System.out.println("Enter title : ");
                String title = input.nextLine();

                System.out.println("Enter author : ");
                String author = input.nextLine();
                books.set(i,new Book(id,title,author));
                System.out.println("book is update succesful");
                found = true;
               break;
            }
        } 

        if(!found){
            System.out.println("the book whit id "+id + " not found");
        }

       
    }

    public void deleteBook(){
        System.out.println("Entre id the book that you delete");
        int id = input.nextInt();

       boolean found = false;

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == id) {
                books.remove(i); 
                System.out.println(" Book deleted successfully.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(" Book with ID " + id + " not found.");
        }
    }

    public void fetchById(){
         System.out.println("Entre id the book that you show");
        int id = input.nextInt();

        for (int i=0;i<books.size();i++){
            if(books.get(i).getId() == id){
                 System.out.println(books.get(i));
            }
        }

       
    }

    public void fetchAll(){
           if (books.isEmpty()) {
                System.out.println("No books found.");
            } else {
                System.out.println(" All Books:");
                for (int i = 0; i < books.size(); i++) {
                    System.out.println(books.get(i));
                }
            }
       
    }


}