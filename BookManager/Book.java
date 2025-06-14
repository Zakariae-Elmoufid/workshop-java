public class  Book {
     int id ;
     String  title;
     String author ;

    public Book(int id , String title , String author){
        this.id = id;
        this.title = title;
        this.author = author;
    }


    public int getId(){
        return this.id;
    }

    public String toString(){
        return "ID: " + id + " Title: "+ title + " Author: " + author;  
    }
}