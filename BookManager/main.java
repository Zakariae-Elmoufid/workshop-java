import java.util.ArrayList;
import java.util.Scanner;


class main {
     
     public static void main(String[] args){
         
         Scanner input = new Scanner(System.in);

         BookManager book = new BookManager();

         System.out.println("------what would you do ?----------");
         System.out.println("1 - add new book");
         System.out.println("2 -  update book");
         System.out.println("3 - delete book ");
         System.out.println("4 - fetch book by id");
         System.out.println("5 - fetch all books");
         System.out.print("enter number what would you do : ");

        
         int userScanne  =  input.nextInt();

         switch(userScanne){
           case 1 :
             book.addBook();
            break;
           case 2 :
             book.updateBook();
             break;
           case 3 :
            book.deleteBook();
            break;
           case 4 :
            book.fetchById();    
            break; 
           case 5 :
            book.fetchAll();
            break;
           default:
            System.out.println("it not  exestes this number \n please enter the number from 1 to 5");  

         }




            
        
 
     }


}